package com.example.celestialapp.domain.usecase;

import java.lang.System;

/**
 * получить список небесных тел для заданного списка тегов
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J+\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/celestialapp/domain/usecase/GetFavouriteCelestialsByTagUseCase;", "", "localDataRepository", "Lcom/example/celestialapp/domain/repository/LocalDataRepository;", "localDataMapper", "Lcom/example/celestialapp/data/repository/LocalDataMapper;", "(Lcom/example/celestialapp/domain/repository/LocalDataRepository;Lcom/example/celestialapp/data/repository/LocalDataMapper;)V", "invoke", "Lcom/example/celestialapp/domain/usecase/ResourceUseCase;", "", "Lcom/example/celestialapp/domain/models/FavouriteCelestialDataItem;", "listTagId", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetFavouriteCelestialsByTagUseCase {
    private final com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository = null;
    private final com.example.celestialapp.data.repository.LocalDataMapper localDataMapper = null;
    
    public GetFavouriteCelestialsByTagUseCase(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.LocalDataMapper localDataMapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> listTagId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.domain.usecase.ResourceUseCase<java.util.List<com.example.celestialapp.domain.models.FavouriteCelestialDataItem>>> continuation) {
        return null;
    }
}