// Generated by Dagger (https://dagger.dev).
package com.example.celestialapp.di;

import com.example.celestialapp.domain.repository.LocalDataRepository;
import com.example.celestialapp.domain.usecase.UpdateTagCelestialUseCase;
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
public final class DomainModule_ProvideUpdateTagCelestialUseCaseFactory implements Factory<UpdateTagCelestialUseCase> {
  private final DomainModule module;

  private final Provider<LocalDataRepository> localDataRepositoryProvider;

  public DomainModule_ProvideUpdateTagCelestialUseCaseFactory(DomainModule module,
      Provider<LocalDataRepository> localDataRepositoryProvider) {
    this.module = module;
    this.localDataRepositoryProvider = localDataRepositoryProvider;
  }

  @Override
  public UpdateTagCelestialUseCase get() {
    return provideUpdateTagCelestialUseCase(module, localDataRepositoryProvider.get());
  }

  public static DomainModule_ProvideUpdateTagCelestialUseCaseFactory create(DomainModule module,
      Provider<LocalDataRepository> localDataRepositoryProvider) {
    return new DomainModule_ProvideUpdateTagCelestialUseCaseFactory(module, localDataRepositoryProvider);
  }

  public static UpdateTagCelestialUseCase provideUpdateTagCelestialUseCase(DomainModule instance,
      LocalDataRepository localDataRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideUpdateTagCelestialUseCase(localDataRepository));
  }
}
