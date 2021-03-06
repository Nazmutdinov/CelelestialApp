// Generated by Dagger (https://dagger.dev).
package com.example.celestialapp.di;

import com.example.celestialapp.data.repository.RemoteApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideRemoteApiServiceFactory implements Factory<RemoteApiService> {
  private final NetworkModule module;

  public NetworkModule_ProvideRemoteApiServiceFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public RemoteApiService get() {
    return provideRemoteApiService(module);
  }

  public static NetworkModule_ProvideRemoteApiServiceFactory create(NetworkModule module) {
    return new NetworkModule_ProvideRemoteApiServiceFactory(module);
  }

  public static RemoteApiService provideRemoteApiService(NetworkModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideRemoteApiService());
  }
}
