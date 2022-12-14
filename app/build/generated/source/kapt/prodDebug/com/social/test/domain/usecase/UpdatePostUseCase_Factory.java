// Generated by Dagger (https://dagger.dev).
package com.social.test.domain.usecase;

import com.social.test.domain.repository.AppRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UpdatePostUseCase_Factory implements Factory<UpdatePostUseCase> {
  private final Provider<AppRepository> appRepositoryProvider;

  private final Provider<CoroutineDispatcher> coroutineDispatcherProvider;

  public UpdatePostUseCase_Factory(Provider<AppRepository> appRepositoryProvider,
      Provider<CoroutineDispatcher> coroutineDispatcherProvider) {
    this.appRepositoryProvider = appRepositoryProvider;
    this.coroutineDispatcherProvider = coroutineDispatcherProvider;
  }

  @Override
  public UpdatePostUseCase get() {
    return newInstance(appRepositoryProvider.get(), coroutineDispatcherProvider.get());
  }

  public static UpdatePostUseCase_Factory create(Provider<AppRepository> appRepositoryProvider,
      Provider<CoroutineDispatcher> coroutineDispatcherProvider) {
    return new UpdatePostUseCase_Factory(appRepositoryProvider, coroutineDispatcherProvider);
  }

  public static UpdatePostUseCase newInstance(AppRepository appRepository,
      CoroutineDispatcher coroutineDispatcher) {
    return new UpdatePostUseCase(appRepository, coroutineDispatcher);
  }
}
