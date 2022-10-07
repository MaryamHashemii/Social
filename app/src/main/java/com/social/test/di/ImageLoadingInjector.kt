package com.social.test.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.social.test.common.imageloading.FrescoImageLoadingService
import com.social.test.common.imageloading.ImageLoadingService

@Module
@InstallIn(SingletonComponent::class)
abstract class ImageLoadingInjector {

    @Binds
    abstract fun provideFrescoImageLoadingService(fresco: FrescoImageLoadingService): ImageLoadingService

}