// Generated by Dagger (https://dagger.dev).
package com.example.celestialapp.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataModule_ProvideCoroutineDispatcherFactory implements Factory<CoroutineDispatcher> {
  private final DataModule module;

  public DataModule_ProvideCoroutineDispatcherFactory(DataModule module) {
    this.module = module;
  }

  @Override
  public CoroutineDispatcher get() {
    return provideCoroutineDispatcher(module);
  }

  public static DataModule_ProvideCoroutineDispatcherFactory create(DataModule module) {
    return new DataModule_ProvideCoroutineDispatcherFactory(module);
  }

  public static CoroutineDispatcher provideCoroutineDispatcher(DataModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideCoroutineDispatcher());
  }
}
