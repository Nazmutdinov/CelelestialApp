// Generated by Dagger (https://dagger.dev).
package com.example.celestialapp.di;

import com.example.celestialapp.data.repository.LocalDataMapper;
import com.example.celestialapp.data.repository.Utils;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataModule_ProvideLocalDataMapperFactory implements Factory<LocalDataMapper> {
  private final DataModule module;

  private final Provider<Utils> utilsProvider;

  public DataModule_ProvideLocalDataMapperFactory(DataModule module,
      Provider<Utils> utilsProvider) {
    this.module = module;
    this.utilsProvider = utilsProvider;
  }

  @Override
  public LocalDataMapper get() {
    return provideLocalDataMapper(module, utilsProvider.get());
  }

  public static DataModule_ProvideLocalDataMapperFactory create(DataModule module,
      Provider<Utils> utilsProvider) {
    return new DataModule_ProvideLocalDataMapperFactory(module, utilsProvider);
  }

  public static LocalDataMapper provideLocalDataMapper(DataModule instance, Utils utils) {
    return Preconditions.checkNotNullFromProvides(instance.provideLocalDataMapper(utils));
  }
}
