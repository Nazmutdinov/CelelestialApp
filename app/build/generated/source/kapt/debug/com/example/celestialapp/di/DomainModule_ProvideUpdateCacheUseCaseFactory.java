// Generated by Dagger (https://dagger.dev).
package com.example.celestialapp.di;

import com.example.celestialapp.data.repository.LocalDataMapper;
import com.example.celestialapp.data.repository.Utils;
import com.example.celestialapp.domain.repository.LocalDataRepository;
import com.example.celestialapp.domain.usecase.UpdateCacheUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("dagger.hilt.android.scopes.ViewModelScoped")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DomainModule_ProvideUpdateCacheUseCaseFactory implements Factory<UpdateCacheUseCase> {
  private final DomainModule module;

  private final Provider<LocalDataRepository> localDataRepositoryProvider;

  private final Provider<LocalDataMapper> localDataMapperProvider;

  private final Provider<Utils> utilsProvider;

  public DomainModule_ProvideUpdateCacheUseCaseFactory(DomainModule module,
      Provider<LocalDataRepository> localDataRepositoryProvider,
      Provider<LocalDataMapper> localDataMapperProvider, Provider<Utils> utilsProvider) {
    this.module = module;
    this.localDataRepositoryProvider = localDataRepositoryProvider;
    this.localDataMapperProvider = localDataMapperProvider;
    this.utilsProvider = utilsProvider;
  }

  @Override
  public UpdateCacheUseCase get() {
    return provideUpdateCacheUseCase(module, localDataRepositoryProvider.get(), localDataMapperProvider.get(), utilsProvider.get());
  }

  public static DomainModule_ProvideUpdateCacheUseCaseFactory create(DomainModule module,
      Provider<LocalDataRepository> localDataRepositoryProvider,
      Provider<LocalDataMapper> localDataMapperProvider, Provider<Utils> utilsProvider) {
    return new DomainModule_ProvideUpdateCacheUseCaseFactory(module, localDataRepositoryProvider, localDataMapperProvider, utilsProvider);
  }

  public static UpdateCacheUseCase provideUpdateCacheUseCase(DomainModule instance,
      LocalDataRepository localDataRepository, LocalDataMapper localDataMapper, Utils utils) {
    return Preconditions.checkNotNullFromProvides(instance.provideUpdateCacheUseCase(localDataRepository, localDataMapper, utils));
  }
}
