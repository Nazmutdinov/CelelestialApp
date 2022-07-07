// Generated by Dagger (https://dagger.dev).
package com.example.celestialapp.presentation.fragments;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FavouriteDetailsFragment_MembersInjector implements MembersInjector<FavouriteDetailsFragment> {
  private final Provider<DialogFactory> dialogProvider;

  public FavouriteDetailsFragment_MembersInjector(Provider<DialogFactory> dialogProvider) {
    this.dialogProvider = dialogProvider;
  }

  public static MembersInjector<FavouriteDetailsFragment> create(
      Provider<DialogFactory> dialogProvider) {
    return new FavouriteDetailsFragment_MembersInjector(dialogProvider);
  }

  @Override
  public void injectMembers(FavouriteDetailsFragment instance) {
    injectDialog(instance, dialogProvider.get());
  }

  @InjectedFieldSignature("com.example.celestialapp.presentation.fragments.FavouriteDetailsFragment.dialog")
  public static void injectDialog(FavouriteDetailsFragment instance, DialogFactory dialog) {
    instance.dialog = dialog;
  }
}