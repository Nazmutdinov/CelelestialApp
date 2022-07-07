package com.example.celestialapp.domain.usecase;

import java.lang.System;

/**
 * получить детальную инфу небесного тела из БД для заданного nasaId
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/celestialapp/domain/usecase/GetFavouriteCelestialByIdUseCase;", "", "localDataRepository", "Lcom/example/celestialapp/domain/repository/LocalDataRepository;", "localDataMapper", "Lcom/example/celestialapp/data/repository/LocalDataMapper;", "(Lcom/example/celestialapp/domain/repository/LocalDataRepository;Lcom/example/celestialapp/data/repository/LocalDataMapper;)V", "invoke", "Lcom/example/celestialapp/domain/usecase/ResourceUseCase;", "Lcom/example/celestialapp/domain/models/FavouriteCelestialDataItem;", "nasaId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetFavouriteCelestialByIdUseCase {
    private final com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository = null;
    private final com.example.celestialapp.data.repository.LocalDataMapper localDataMapper = null;
    
    public GetFavouriteCelestialByIdUseCase(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.LocalDataMapper localDataMapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    java.lang.String nasaId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.domain.usecase.ResourceUseCase<com.example.celestialapp.domain.models.FavouriteCelestialDataItem>> continuation) {
        return null;
    }
}