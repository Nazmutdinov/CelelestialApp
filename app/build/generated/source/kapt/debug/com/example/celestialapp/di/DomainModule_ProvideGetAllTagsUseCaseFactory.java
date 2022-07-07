// Generated by Dagger (https://dagger.dev).
package com.example.celestialapp.di;

import com.example.celestialapp.data.repository.LocalDataMapper;
import com.example.celestialapp.domain.repository.LocalDataRepository;
import com.example.celestialapp.domain.usecase.GetAllTagsUseCase;
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
public final class DomainModule_ProvideGetAllTagsUseCaseFactory implements Factory<GetAllTagsUseCase> {
  private final DomainModule module;

  private final Provider<LocalDataRepository> localDataRepositoryProvider;

  private final Provider<LocalDataMapper> localDataMapperProvider;

  public DomainModule_ProvideGetAllTagsUseCaseFactory(DomainModule module,
      Provider<LocalDataRepository> localDataRepositoryProvider,
      Provider<LocalDataMapper> localDataMapperProvider) {
    this.module = module;
    this.localDataRepositoryProvider = localDataRepositoryProvider;
    this.localDataMapperProvider = localDataMapperProvider;
  }

  @Override
  public GetAllTagsUseCase get() {
    return provideGetAllTagsUseCase(module, localDataRepositoryProvider.get(), localDataMapperProvider.get());
  }

  public static DomainModule_ProvideGetAllTagsUseCaseFactory create(DomainModule module,
      Provider<LocalDataRepository> localDataRepositoryProvider,
      Provider<LocalDataMapper> localDataMapperProvider) {
    return new DomainModule_ProvideGetAllTagsUseCaseFactory(module, localDataRepositoryProvider, localDataMapperProvider);
  }

  public static GetAllTagsUseCase provideGetAllTagsUseCase(DomainModule instance,
      LocalDataRepository localDataRepository, LocalDataMapper localDataMapper) {
    return Preconditions.checkNotNullFromProvides(instance.provideGetAllTagsUseCase(localDataRepository, localDataMapper));
  }
}
