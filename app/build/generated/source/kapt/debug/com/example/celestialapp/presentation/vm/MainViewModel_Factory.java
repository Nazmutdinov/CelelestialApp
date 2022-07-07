// Generated by Dagger (https://dagger.dev).
package com.example.celestialapp.presentation.vm;

import com.example.celestialapp.data.repository.MyPager;
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
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<MyPager> myPagerProvider;

  public MainViewModel_Factory(Provider<MyPager> myPagerProvider) {
    this.myPagerProvider = myPagerProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(myPagerProvider.get());
  }

  public static MainViewModel_Factory create(Provider<MyPager> myPagerProvider) {
    return new MainViewModel_Factory(myPagerProvider);
  }

  public static MainViewModel newInstance(MyPager myPager) {
    return new MainViewModel(myPager);
  }
}
