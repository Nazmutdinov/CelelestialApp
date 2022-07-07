package com.example.celestialapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ+\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u000bH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/celestialapp/data/repository/MyPager;", "", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "remoteApiService", "Lcom/example/celestialapp/data/repository/RemoteApiService;", "remoteDataMapper", "Lcom/example/celestialapp/data/repository/RemoteDataMapper;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/example/celestialapp/data/repository/RemoteApiService;Lcom/example/celestialapp/data/repository/RemoteDataMapper;)V", "invoke", "Landroidx/paging/Pager;", "", "Lcom/example/celestialapp/domain/models/CelestialDataItem;", "keywords", "", "", "pageSize", "app_debug"})
public final class MyPager {
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    private final com.example.celestialapp.data.repository.RemoteApiService remoteApiService = null;
    private final com.example.celestialapp.data.repository.RemoteDataMapper remoteDataMapper = null;
    
    public MyPager(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.RemoteApiService remoteApiService, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.RemoteDataMapper remoteDataMapper) {
        super();
    }
    
    /**
     * извлечь данные о небесном теле
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.paging.Pager<java.lang.Integer, com.example.celestialapp.domain.models.CelestialDataItem> invoke(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> keywords, int pageSize) {
        return null;
    }
}