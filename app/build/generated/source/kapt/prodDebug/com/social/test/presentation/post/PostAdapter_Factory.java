// Generated by Dagger (https://dagger.dev).
package com.social.test.presentation.post;

import com.social.test.common.imageloading.ImageLoadingService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PostAdapter_Factory implements Factory<PostAdapter> {
  private final Provider<ImageLoadingService> imageLoadingServiceProvider;

  public PostAdapter_Factory(Provider<ImageLoadingService> imageLoadingServiceProvider) {
    this.imageLoadingServiceProvider = imageLoadingServiceProvider;
  }

  @Override
  public PostAdapter get() {
    return newInstance(imageLoadingServiceProvider.get());
  }

  public static PostAdapter_Factory create(
      Provider<ImageLoadingService> imageLoadingServiceProvider) {
    return new PostAdapter_Factory(imageLoadingServiceProvider);
  }

  public static PostAdapter newInstance(ImageLoadingService imageLoadingService) {
    return new PostAdapter(imageLoadingService);
  }
}
