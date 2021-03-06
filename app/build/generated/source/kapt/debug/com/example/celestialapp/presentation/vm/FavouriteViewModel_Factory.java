// Generated by Dagger (https://dagger.dev).
package com.example.celestialapp.presentation.vm;

import com.example.celestialapp.domain.usecase.GetAllTagsUseCase;
import com.example.celestialapp.domain.usecase.GetFavouriteCelestialsByTagUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FavouriteViewModel_Factory implements Factory<FavouriteViewModel> {
  private final Provider<GetAllTagsUseCase> getAllTagsUseCaseProvider;

  private final Provider<GetFavouriteCelestialsByTagUseCase> getFavouriteCelestialsByTagUseCaseProvider;

  public FavouriteViewModel_Factory(Provider<GetAllTagsUseCase> getAllTagsUseCaseProvider,
      Provider<GetFavouriteCelestialsByTagUseCase> getFavouriteCelestialsByTagUseCaseProvider) {
    this.getAllTagsUseCaseProvider = getAllTagsUseCaseProvider;
    this.getFavouriteCelestialsByTagUseCaseProvider = getFavouriteCelestialsByTagUseCaseProvider;
  }

  @Override
  public FavouriteViewModel get() {
    return newInstance(getAllTagsUseCaseProvider.get(), getFavouriteCelestialsByTagUseCaseProvider.get());
  }

  public static FavouriteViewModel_Factory create(
      Provider<GetAllTagsUseCase> getAllTagsUseCaseProvider,
      Provider<GetFavouriteCelestialsByTagUseCase> getFavouriteCelestialsByTagUseCaseProvider) {
    return new FavouriteViewModel_Factory(getAllTagsUseCaseProvider, getFavouriteCelestialsByTagUseCaseProvider);
  }

  public static FavouriteViewModel newInstance(GetAllTagsUseCase getAllTagsUseCase,
      GetFavouriteCelestialsByTagUseCase getFavouriteCelestialsByTagUseCase) {
    return new FavouriteViewModel(getAllTagsUseCase, getFavouriteCelestialsByTagUseCase);
  }
}
