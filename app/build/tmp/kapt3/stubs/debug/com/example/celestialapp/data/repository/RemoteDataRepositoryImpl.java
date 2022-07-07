package com.example.celestialapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/celestialapp/data/repository/RemoteDataRepositoryImpl;", "Lcom/example/celestialapp/domain/repository/RemoteDataRepository;", "remoteApiService", "Lcom/example/celestialapp/data/repository/RemoteApiService;", "(Lcom/example/celestialapp/data/repository/RemoteApiService;)V", "getDetailedData", "Lcom/example/celestialapp/data/repository/Resource;", "Lcom/example/celestialapp/data/remote/detailedDto/DetailedInfoDto;", "nasaId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getImagePath", "Lcom/example/celestialapp/data/remote/imageDto/ImageDataInfo;", "app_debug"})
public final class RemoteDataRepositoryImpl implements com.example.celestialapp.domain.repository.RemoteDataRepository {
    private final com.example.celestialapp.data.repository.RemoteApiService remoteApiService = null;
    
    public RemoteDataRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.RemoteApiService remoteApiService) {
        super();
    }
    
    /**
     * подробные данные по небесному телу nasa_id
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getDetailedData(@org.jetbrains.annotations.NotNull()
    java.lang.String nasaId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<com.example.celestialapp.data.remote.detailedDto.DetailedInfoDto>> continuation) {
        return null;
    }
    
    /**
     * ссылка на json с картинками medium и thumbnail
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getImagePath(@org.jetbrains.annotations.NotNull()
    java.lang.String nasaId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<com.example.celestialapp.data.remote.imageDto.ImageDataInfo>> continuation) {
        return null;
    }
}