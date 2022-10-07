// Generated by Dagger (https://dagger.dev).
package com.social.test.di;

import com.social.test.data.local.dao.AppDao;
import com.social.test.data.sharedPref.DataSharedPref;
import com.social.test.domain.repository.AppRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_ProvideAppRepositoryFactory implements Factory<AppRepository> {
  private final Provider<AppDao> appDaoProvider;

  private final Provider<DataSharedPref> sharedPrefProvider;

  public RepositoryModule_ProvideAppRepositoryFactory(Provider<AppDao> appDaoProvider,
      Provider<DataSharedPref> sharedPrefProvider) {
    this.appDaoProvider = appDaoProvider;
    this.sharedPrefProvider = sharedPrefProvider;
  }

  @Override
  public AppRepository get() {
    return provideAppRepository(appDaoProvider.get(), sharedPrefProvider.get());
  }

  public static RepositoryModule_ProvideAppRepositoryFactory create(Provider<AppDao> appDaoProvider,
      Provider<DataSharedPref> sharedPrefProvider) {
    return new RepositoryModule_ProvideAppRepositoryFactory(appDaoProvider, sharedPrefProvider);
  }

  public static AppRepository provideAppRepository(AppDao appDao, DataSharedPref sharedPref) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideAppRepository(appDao, sharedPref));
  }
}