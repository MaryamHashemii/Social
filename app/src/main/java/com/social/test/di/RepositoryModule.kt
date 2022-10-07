package com.social.test.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.social.test.domain.repository.AppRepository
import com.social.test.data.AppRepositoryImp
import com.social.test.data.local.dao.AppDao
import com.social.test.data.sharedPref.DataSharedPref
import dagger.Provides
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    // we should pass the apiService too if we want to save the data by its function and get
    //the data from server
    @Provides
    @Singleton
    fun provideAppRepository(
        appDao: AppDao,
        sharedPref: DataSharedPref
    ): AppRepository {
        return AppRepositoryImp(appDao, sharedPref)
    }

}