package com.example.celestialapp.domain.usecase;

import java.lang.System;

/**
 * получить детальную инфу о небесном теле
 * извлечь данные о небесном теле
 * если данные есть в кэше, берем из кэша
 * если нет в кэше, берем из сети и сохраняем в кэш
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\nH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\'\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0018H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/example/celestialapp/domain/usecase/GetDetailedDataUseCase;", "", "localDataRepository", "Lcom/example/celestialapp/domain/repository/LocalDataRepository;", "remoteDataRepository", "Lcom/example/celestialapp/domain/repository/RemoteDataRepository;", "localDataMapper", "Lcom/example/celestialapp/data/repository/LocalDataMapper;", "(Lcom/example/celestialapp/domain/repository/LocalDataRepository;Lcom/example/celestialapp/domain/repository/RemoteDataRepository;Lcom/example/celestialapp/data/repository/LocalDataMapper;)V", "getImagePath", "", "resource", "Lcom/example/celestialapp/data/repository/Resource;", "Lcom/example/celestialapp/data/remote/imageDto/ImageDataInfo;", "invoke", "Lcom/example/celestialapp/domain/usecase/ResourceUseCase;", "Lcom/example/celestialapp/domain/models/FavouriteCelestialDataItem;", "nasaId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveKeywords", "", "celestialId", "", "keywordNames", "", "(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetDetailedDataUseCase {
    private final com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository = null;
    private final com.example.celestialapp.domain.repository.RemoteDataRepository remoteDataRepository = null;
    private final com.example.celestialapp.data.repository.LocalDataMapper localDataMapper = null;
    
    public GetDetailedDataUseCase(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.repository.RemoteDataRepository remoteDataRepository, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.LocalDataMapper localDataMapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    java.lang.String nasaId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.domain.usecase.ResourceUseCase<com.example.celestialapp.domain.models.FavouriteCelestialDataItem>> continuation) {
        return null;
    }
    
    /**
     * сохранить привязку ключевых слов к небесному телу в БД
     */
    private final java.lang.Object saveKeywords(int celestialId, java.util.List<java.lang.String> keywordNames, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * получить путь к картинке
     */
    private final java.lang.String getImagePath(com.example.celestialapp.data.repository.Resource<com.example.celestialapp.data.remote.imageDto.ImageDataInfo> resource) {
        return null;
    }
}