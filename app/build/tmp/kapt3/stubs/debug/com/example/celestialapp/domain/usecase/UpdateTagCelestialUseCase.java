package com.example.celestialapp.domain.usecase;

import java.lang.System;

/**
 * привязать небесное тело к тегу
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/celestialapp/domain/usecase/UpdateTagCelestialUseCase;", "", "localDataRepository", "Lcom/example/celestialapp/domain/repository/LocalDataRepository;", "(Lcom/example/celestialapp/domain/repository/LocalDataRepository;)V", "invoke", "Lcom/example/celestialapp/domain/usecase/ResourceUseCase;", "", "tagId", "", "favouriteCelestialDataItem", "Lcom/example/celestialapp/domain/models/FavouriteCelestialDataItem;", "(ILcom/example/celestialapp/domain/models/FavouriteCelestialDataItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFavouriteDate", "", "nasaId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UpdateTagCelestialUseCase {
    private final com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository = null;
    
    public UpdateTagCelestialUseCase(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(int tagId, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.models.FavouriteCelestialDataItem favouriteCelestialDataItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.domain.usecase.ResourceUseCase<java.lang.Boolean>> continuation) {
        return null;
    }
    
    /**
     * обновление даты сохранения тела в избранном
     */
    private final java.lang.Object updateFavouriteDate(java.lang.String nasaId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}