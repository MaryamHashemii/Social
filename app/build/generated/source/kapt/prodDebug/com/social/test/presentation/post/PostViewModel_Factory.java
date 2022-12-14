// Generated by Dagger (https://dagger.dev).
package com.social.test.presentation.post;

import com.social.test.domain.usecase.GetPagedPostUseCase;
import com.social.test.domain.usecase.UpdatePostUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PostViewModel_Factory implements Factory<PostViewModel> {
  private final Provider<UpdatePostUseCase> updatePostUseCaseProvider;

  private final Provider<GetPagedPostUseCase> getPagedPostUseCaseProvider;

  public PostViewModel_Factory(Provider<UpdatePostUseCase> updatePostUseCaseProvider,
      Provider<GetPagedPostUseCase> getPagedPostUseCaseProvider) {
    this.updatePostUseCaseProvider = updatePostUseCaseProvider;
    this.getPagedPostUseCaseProvider = getPagedPostUseCaseProvider;
  }

  @Override
  public PostViewModel get() {
    return newInstance(updatePostUseCaseProvider.get(), getPagedPostUseCaseProvider.get());
  }

  public static PostViewModel_Factory create(Provider<UpdatePostUseCase> updatePostUseCaseProvider,
      Provider<GetPagedPostUseCase> getPagedPostUseCaseProvider) {
    return new PostViewModel_Factory(updatePostUseCaseProvider, getPagedPostUseCaseProvider);
  }

  public static PostViewModel newInstance(UpdatePostUseCase updatePostUseCase,
      GetPagedPostUseCase getPagedPostUseCase) {
    return new PostViewModel(updatePostUseCase, getPagedPostUseCase);
  }
}
