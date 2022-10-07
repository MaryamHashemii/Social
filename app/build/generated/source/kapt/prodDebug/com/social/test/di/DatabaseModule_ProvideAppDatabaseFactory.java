// Generated by Dagger (https://dagger.dev).
package com.social.test.di;

import android.content.Context;
import com.social.test.data.local.dao.AppDb;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideAppDatabaseFactory implements Factory<AppDb> {
  private final Provider<Context> contextProvider;

  public DatabaseModule_ProvideAppDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AppDb get() {
    return provideAppDatabase(contextProvider.get());
  }

  public static DatabaseModule_ProvideAppDatabaseFactory create(Provider<Context> contextProvider) {
    return new DatabaseModule_ProvideAppDatabaseFactory(contextProvider);
  }

  public static AppDb provideAppDatabase(Context context) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideAppDatabase(context));
  }
}
