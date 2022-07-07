package com.example.celestialapp.domain.usecase;

import java.lang.System;

/**
 * сохраним картинку из сети в БД
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\'\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/celestialapp/domain/usecase/UpdateCacheUseCase;", "", "localDataRepository", "Lcom/example/celestialapp/domain/repository/LocalDataRepository;", "localDataMapper", "Lcom/example/celestialapp/data/repository/LocalDataMapper;", "utils", "Lcom/example/celestialapp/data/repository/Utils;", "(Lcom/example/celestialapp/domain/repository/LocalDataRepository;Lcom/example/celestialapp/data/repository/LocalDataMapper;Lcom/example/celestialapp/data/repository/Utils;)V", "invoke", "Lcom/example/celestialapp/domain/usecase/ResourceUseCase;", "Lcom/example/celestialapp/domain/models/FavouriteCelestialDataItem;", "nasaId", "", "bitmap", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UpdateCacheUseCase {
    private final com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository = null;
    private final com.example.celestialapp.data.repository.LocalDataMapper localDataMapper = null;
    private final com.example.celestialapp.data.repository.Utils utils = null;
    
    public UpdateCacheUseCase(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.LocalDataMapper localDataMapper, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.Utils utils) {
        super();
    }
    
    /**
     * извлечь данные о небесном теле
     * если данные есть в кэше, берем из кэша
     * если нет в кэше, берем из сети и сохраняем в кэш
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    java.lang.String nasaId, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.domain.usecase.ResourceUseCase<com.example.celestialapp.domain.models.FavouriteCelestialDataItem>> continuation) {
        return null;
    }
}