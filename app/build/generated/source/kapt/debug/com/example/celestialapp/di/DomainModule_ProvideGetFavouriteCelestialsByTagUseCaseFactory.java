// Generated by Dagger (https://dagger.dev).
package com.example.celestialapp.di;

import com.example.celestialapp.data.repository.LocalDataMapper;
import com.example.celestialapp.domain.repository.LocalDataRepository;
import com.example.celestialapp.domain.usecase.GetFavouriteCelestialsByTagUseCase;
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
public final class DomainModule_ProvideGetFavouriteCelestialsByTagUseCaseFactory implements Factory<GetFavouriteCelestialsByTagUseCase> {
  private final DomainModule module;

  private final Provider<LocalDataRepository> localDataRepositoryProvider;

  private final Provider<LocalDataMapper> localDataMapperProvider;

  public DomainModule_ProvideGetFavouriteCelestialsByTagUseCaseFactory(DomainModule module,
      Provider<LocalDataRepository> localDataRepositoryProvider,
      Provider<LocalDataMapper> localDataMapperProvider) {
    this.module = module;
    this.localDataRepositoryProvider = localDataRepositoryProvider;
    this.localDataMapperProvider = localDataMapperProvider;
  }

  @Override
  public GetFavouriteCelestialsByTagUseCase get() {
    return provideGetFavouriteCelestialsByTagUseCase(module, localDataRepositoryProvider.get(), localDataMapperProvider.get());
  }

  public static DomainModule_ProvideGetFavouriteCelestialsByTagUseCaseFactory create(
      DomainModule module, Provider<LocalDataRepository> localDataRepositoryProvider,
      Provider<LocalDataMapper> localDataMapperProvider) {
    return new DomainModule_ProvideGetFavouriteCelestialsByTagUseCaseFactory(module, localDataRepositoryProvider, localDataMapperProvider);
  }

  public static GetFavouriteCelestialsByTagUseCase provideGetFavouriteCelestialsByTagUseCase(
      DomainModule instance, LocalDataRepository localDataRepository,
      LocalDataMapper localDataMapper) {
    return Preconditions.checkNotNullFromProvides(instance.provideGetFavouriteCelestialsByTagUseCase(localDataRepository, localDataMapper));
  }
}
