package com.example.celestialapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\u00020\u00032\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\f\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/celestialapp/data/repository/RemoteApiService;", "", "getDataInfoDto", "Lcom/example/celestialapp/data/remote/generalDto/GeneralInfoDto;", "keywords", "", "", "page", "", "(Ljava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDetailedDataInfoDto", "Lcom/example/celestialapp/data/remote/detailedDto/DetailedInfoDto;", "nasaId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getImageDataInfoDto", "Lcom/example/celestialapp/data/remote/imageDto/ImageDataInfo;", "app_debug"})
public abstract interface RemoteApiService {
    
    /**
     * получить типовые данные о небесных телах
     */
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "search?media_type=image")
    public abstract java.lang.Object getDataInfoDto(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "keywords")
    java.util.List<java.lang.String> keywords, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.remote.generalDto.GeneralInfoDto> continuation);
    
    /**
     * получить данные о небесном теле
     */
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "search?media_type=image")
    public abstract java.lang.Object getDetailedDataInfoDto(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "nasa_id")
    java.lang.String nasaId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.remote.detailedDto.DetailedInfoDto> continuation);
    
    /**
     * получить данные о заданном небесном теле
     */
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "asset/{nasa_id}")
    public abstract java.lang.Object getImageDataInfoDto(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "nasa_id")
    java.lang.String nasaId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.remote.imageDto.ImageDataInfo> continuation);
}