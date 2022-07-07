package com.example.celestialapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ#\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0010H\u0016\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J+\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/example/celestialapp/data/repository/PagingSourceFactory;", "Landroidx/paging/PagingSource;", "", "Lcom/example/celestialapp/domain/models/CelestialDataItem;", "keywords", "", "", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "remoteApiService", "Lcom/example/celestialapp/data/repository/RemoteApiService;", "remoteDataMapper", "Lcom/example/celestialapp/data/repository/RemoteDataMapper;", "(Ljava/util/List;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/example/celestialapp/data/repository/RemoteApiService;Lcom/example/celestialapp/data/repository/RemoteDataMapper;)V", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "isDataItemEmpty", "", "item", "Lcom/example/celestialapp/data/remote/generalDto/Item;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PagingSourceFactory extends androidx.paging.PagingSource<java.lang.Integer, com.example.celestialapp.domain.models.CelestialDataItem> {
    private final java.util.List<java.lang.String> keywords = null;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    private final com.example.celestialapp.data.repository.RemoteApiService remoteApiService = null;
    private final com.example.celestialapp.data.repository.RemoteDataMapper remoteDataMapper = null;
    
    public PagingSourceFactory(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> keywords, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.RemoteApiService remoteApiService, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.RemoteDataMapper remoteDataMapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.example.celestialapp.domain.models.CelestialDataItem>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getRefreshKey(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingState<java.lang.Integer, com.example.celestialapp.domain.models.CelestialDataItem> state) {
        return null;
    }
    
    /**
     * берем только непустые данные
     */
    private final boolean isDataItemEmpty(com.example.celestialapp.data.remote.generalDto.Item item) {
        return false;
    }
}