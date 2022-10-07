package com.social.test.di

import com.social.test.BuildConfig
import com.social.test.data.remote.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

//we need this if first of all we want to call api and then save data in our db

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    fun provideApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    fun provideRetrofit(
        okHttpClient: OkHttpClient,
    ): Retrofit {
        val builder = Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())

        return builder.build()
    }

    @Provides
    fun provideHttpClient(
        httpLoggingInterceptor: HttpLoggingInterceptor,
    ): OkHttpClient {
        val builder = OkHttpClient.Builder()
            .addInterceptor(provideOfflineCacheInterceptor())
            .readTimeout(60, TimeUnit.SECONDS)
            .connectTimeout(60, TimeUnit.SECONDS)
            .addInterceptor(httpLoggingInterceptor)

        return builder.build()
    }

    @Provides
    fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor()
            .apply {
                level = HttpLoggingInterceptor.Level.BODY
            }
    }

    private fun provideOfflineCacheInterceptor(): Interceptor {
        return Interceptor { chainObj ->
            try {
                chainObj.proceed(chainObj.request())
            } catch (e: Exception) {
                val cacheControl: CacheControl = CacheControl.Builder()
                    .onlyIfCached()
                    .maxStale(60, TimeUnit.SECONDS)
                    .build()
                val offlineRequest: Request = chainObj.request().newBuilder()
                    .cacheControl(cacheControl)
                    .build()
                chainObj.proceed(offlineRequest)
            }
        }
    }

}