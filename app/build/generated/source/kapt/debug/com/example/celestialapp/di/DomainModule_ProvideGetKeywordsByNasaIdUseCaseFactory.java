// Generated by Dagger (https://dagger.dev).
package com.example.celestialapp.di;

import com.example.celestialapp.domain.repository.LocalDataRepository;
import com.example.celestialapp.domain.usecase.GetKeywordsByNasaIdUseCase;
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
public final class DomainModule_ProvideGetKeywordsByNasaIdUseCaseFactory implements Factory<GetKeywordsByNasaIdUseCase> {
  private final DomainModule module;

  private final Provider<LocalDataRepository> localDataRepositoryProvider;

  public DomainModule_ProvideGetKeywordsByNasaIdUseCaseFactory(DomainModule module,
      Provider<LocalDataRepository> localDataRepositoryProvider) {
    this.module = module;
    this.localDataRepositoryProvider = localDataRepositoryProvider;
  }

  @Override
  public GetKeywordsByNasaIdUseCase get() {
    return provideGetKeywordsByNasaIdUseCase(module, localDataRepositoryProvider.get());
  }

  public static DomainModule_ProvideGetKeywordsByNasaIdUseCaseFactory create(DomainModule module,
      Provider<LocalDataRepository> localDataRepositoryProvider) {
    return new DomainModule_ProvideGetKeywordsByNasaIdUseCaseFactory(module, localDataRepositoryProvider);
  }

  public static GetKeywordsByNasaIdUseCase provideGetKeywordsByNasaIdUseCase(DomainModule instance,
      LocalDataRepository localDataRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideGetKeywordsByNasaIdUseCase(localDataRepository));
  }
}
