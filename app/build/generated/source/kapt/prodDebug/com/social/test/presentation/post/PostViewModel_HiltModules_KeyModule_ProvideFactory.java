// Generated by Dagger (https://dagger.dev).
package com.social.test.presentation.post;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PostViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static PostViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(PostViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final PostViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new PostViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
