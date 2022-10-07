package com.social.test.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/social/test/di/RepositoryModule;", "", "()V", "provideAppRepository", "Lcom/social/test/domain/repository/AppRepository;", "appDao", "Lcom/social/test/data/local/dao/AppDao;", "sharedPref", "Lcom/social/test/data/sharedPref/DataSharedPref;", "app_prodDebug"})
@dagger.Module()
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.social.test.di.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.social.test.domain.repository.AppRepository provideAppRepository(@org.jetbrains.annotations.NotNull()
    com.social.test.data.local.dao.AppDao appDao, @org.jetbrains.annotations.NotNull()
    com.social.test.data.sharedPref.DataSharedPref sharedPref) {
        return null;
    }
}