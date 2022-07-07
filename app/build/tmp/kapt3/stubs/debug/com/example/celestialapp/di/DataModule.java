package com.example.celestialapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\"\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\bH\u0007J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J.\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\b\u0010\u001c\u001a\u00020\u0016H\u0007J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0012\u0010\u001f\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006 "}, d2 = {"Lcom/example/celestialapp/di/DataModule;", "", "()V", "provideCelestialDatabase", "Lcom/example/celestialapp/data/local/CelestialDatabase;", "context", "Landroid/content/Context;", "provideCoroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "provideLocalDataMapper", "Lcom/example/celestialapp/data/repository/LocalDataMapper;", "utils", "Lcom/example/celestialapp/data/repository/Utils;", "provideLocalDataRepository", "Lcom/example/celestialapp/domain/repository/LocalDataRepository;", "db", "dispatcher", "provideMyPager", "Lcom/example/celestialapp/data/repository/MyPager;", "remoteApiService", "Lcom/example/celestialapp/data/repository/RemoteApiService;", "remoteDataMapper", "Lcom/example/celestialapp/data/repository/RemoteDataMapper;", "providePagingSourceFactory", "Lcom/example/celestialapp/data/repository/PagingSourceFactory;", "keywords", "", "", "provideRemoteDataMapper", "provideRemoteDataRepository", "Lcom/example/celestialapp/domain/repository/RemoteDataRepository;", "provideUtils", "app_debug"})
@dagger.Module()
public final class DataModule {
    
    public DataModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineDispatcher provideCoroutineDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.celestialapp.data.local.CelestialDatabase provideCelestialDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.celestialapp.domain.repository.LocalDataRepository provideLocalDataRepository(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.local.CelestialDatabase db, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.celestialapp.domain.repository.RemoteDataRepository provideRemoteDataRepository(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.RemoteApiService remoteApiService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.celestialapp.data.repository.LocalDataMapper provideLocalDataMapper(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.Utils utils) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.celestialapp.data.repository.MyPager provideMyPager(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.RemoteApiService remoteApiService, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.RemoteDataMapper remoteDataMapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.celestialapp.data.repository.PagingSourceFactory providePagingSourceFactory(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> keywords, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.RemoteApiService remoteApiService, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.RemoteDataMapper remoteDataMapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.celestialapp.data.repository.RemoteDataMapper provideRemoteDataMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.celestialapp.data.repository.Utils provideUtils(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
}