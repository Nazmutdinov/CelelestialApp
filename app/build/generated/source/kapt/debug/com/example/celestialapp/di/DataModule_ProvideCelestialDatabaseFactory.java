// Generated by Dagger (https://dagger.dev).
package com.example.celestialapp.di;

import android.content.Context;
import com.example.celestialapp.data.local.CelestialDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataModule_ProvideCelestialDatabaseFactory implements Factory<CelestialDatabase> {
  private final DataModule module;

  private final Provider<Context> contextProvider;

  public DataModule_ProvideCelestialDatabaseFactory(DataModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public CelestialDatabase get() {
    return provideCelestialDatabase(module, contextProvider.get());
  }

  public static DataModule_ProvideCelestialDatabaseFactory create(DataModule module,
      Provider<Context> contextProvider) {
    return new DataModule_ProvideCelestialDatabaseFactory(module, contextProvider);
  }

  public static CelestialDatabase provideCelestialDatabase(DataModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideCelestialDatabase(context));
  }
}
