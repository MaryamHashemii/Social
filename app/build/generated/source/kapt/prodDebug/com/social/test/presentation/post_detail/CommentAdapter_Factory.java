// Generated by Dagger (https://dagger.dev).
package com.social.test.presentation.post_detail;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CommentAdapter_Factory implements Factory<CommentAdapter> {
  @Override
  public CommentAdapter get() {
    return newInstance();
  }

  public static CommentAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CommentAdapter newInstance() {
    return new CommentAdapter();
  }

  private static final class InstanceHolder {
    private static final CommentAdapter_Factory INSTANCE = new CommentAdapter_Factory();
  }
}
