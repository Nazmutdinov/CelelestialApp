package com.example.celestialapp.domain.usecase;

import java.lang.System;

/**
 * получить список всех ключевых слов для заданного списка небесных тел
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J+\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/celestialapp/domain/usecase/GetTagsByNasaIdUseCase;", "", "localDataRepository", "Lcom/example/celestialapp/domain/repository/LocalDataRepository;", "(Lcom/example/celestialapp/domain/repository/LocalDataRepository;)V", "invoke", "Lcom/example/celestialapp/domain/usecase/ResourceUseCase;", "", "Lcom/example/celestialapp/domain/models/TagDataItem;", "listNasaId", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetTagsByNasaIdUseCase {
    private final com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository = null;
    
    public GetTagsByNasaIdUseCase(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> listNasaId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.domain.usecase.ResourceUseCase<java.util.List<com.example.celestialapp.domain.models.TagDataItem>>> continuation) {
        return null;
    }
}