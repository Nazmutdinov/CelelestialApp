package com.example.celestialapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J \u0010\u001f\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H\u0007J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006%"}, d2 = {"Lcom/example/celestialapp/di/DomainModule;", "", "()V", "provideAddTagCelestialUseCase", "Lcom/example/celestialapp/domain/usecase/AddTagCelestialUseCase;", "context", "Landroid/content/Context;", "localDataRepository", "Lcom/example/celestialapp/domain/repository/LocalDataRepository;", "provideDeleteCrossRefDataUseCase", "Lcom/example/celestialapp/domain/usecase/DeleteCrossRefDataUseCase;", "provideDeleteTagsDataUseCase", "Lcom/example/celestialapp/domain/usecase/DeleteTagsDataUseCase;", "provideGetAllTagsUseCase", "Lcom/example/celestialapp/domain/usecase/GetAllTagsUseCase;", "localDataMapper", "Lcom/example/celestialapp/data/repository/LocalDataMapper;", "provideGetDetailedDataUseCase", "Lcom/example/celestialapp/domain/usecase/GetDetailedDataUseCase;", "remoteDataRepository", "Lcom/example/celestialapp/domain/repository/RemoteDataRepository;", "provideGetFavouriteCelestialByIdUseCase", "Lcom/example/celestialapp/domain/usecase/GetFavouriteCelestialByIdUseCase;", "provideGetFavouriteCelestialsByTagUseCase", "Lcom/example/celestialapp/domain/usecase/GetFavouriteCelestialsByTagUseCase;", "provideGetKeywordsByNasaIdUseCase", "Lcom/example/celestialapp/domain/usecase/GetKeywordsByNasaIdUseCase;", "provideGetTagsByNasaIdUseCase", "Lcom/example/celestialapp/domain/usecase/GetTagsByNasaIdUseCase;", "provideInsertTagDataUseCase", "Lcom/example/celestialapp/domain/usecase/InsertTagDataUseCase;", "provideUpdateCacheUseCase", "Lcom/example/celestialapp/domain/usecase/UpdateCacheUseCase;", "utils", "Lcom/example/celestialapp/data/repository/Utils;", "provideUpdateTagCelestialUseCase", "Lcom/example/celestialapp/domain/usecase/UpdateTagCelestialUseCase;", "app_debug"})
@dagger.Module()
public final class DomainModule {
    
    public DomainModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.example.celestialapp.domain.usecase.AddTagCelestialUseCase provideAddTagCelestialUseCase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.example.celestialapp.domain.usecase.DeleteCrossRefDataUseCase provideDeleteCrossRefDataUseCase(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.example.celestialapp.domain.usecase.DeleteTagsDataUseCase provideDeleteTagsDataUseCase(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.example.celestialapp.domain.usecase.GetAllTagsUseCase provideGetAllTagsUseCase(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.LocalDataMapper localDataMapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.example.celestialapp.domain.usecase.GetDetailedDataUseCase provideGetDetailedDataUseCase(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.repository.RemoteDataRepository remoteDataRepository, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.LocalDataMapper localDataMapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.example.celestialapp.domain.usecase.GetFavouriteCelestialByIdUseCase provideGetFavouriteCelestialByIdUseCase(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.LocalDataMapper localDataMapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.example.celestialapp.domain.usecase.GetFavouriteCelestialsByTagUseCase provideGetFavouriteCelestialsByTagUseCase(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.LocalDataMapper localDataMapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.example.celestialapp.domain.usecase.GetKeywordsByNasaIdUseCase provideGetKeywordsByNasaIdUseCase(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.example.celestialapp.domain.usecase.GetTagsByNasaIdUseCase provideGetTagsByNasaIdUseCase(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.example.celestialapp.domain.usecase.InsertTagDataUseCase provideInsertTagDataUseCase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.example.celestialapp.domain.usecase.UpdateCacheUseCase provideUpdateCacheUseCase(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.LocalDataMapper localDataMapper, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.Utils utils) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.example.celestialapp.domain.usecase.UpdateTagCelestialUseCase provideUpdateTagCelestialUseCase(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository) {
        return null;
    }
}