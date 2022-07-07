package com.example.celestialapp.domain.usecase;

import java.lang.System;

/**
 * добавить новое ключевое слово
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/celestialapp/domain/usecase/InsertTagDataUseCase;", "", "context", "Landroid/content/Context;", "localDataRepository", "Lcom/example/celestialapp/domain/repository/LocalDataRepository;", "(Landroid/content/Context;Lcom/example/celestialapp/domain/repository/LocalDataRepository;)V", "invoke", "Lcom/example/celestialapp/domain/usecase/ResourceUseCase;", "", "tagName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isTagExisting", "name", "app_debug"})
public final class InsertTagDataUseCase {
    private final android.content.Context context = null;
    private final com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository = null;
    
    public InsertTagDataUseCase(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.repository.LocalDataRepository localDataRepository) {
        super();
    }
    
    /**
     * сохранить ключевое слово
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    java.lang.String tagName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.domain.usecase.ResourceUseCase<java.lang.Boolean>> continuation) {
        return null;
    }
    
    /**
     * проверяем, есть уже такой тэг?
     */
    private final java.lang.Object isTagExisting(java.lang.String name, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
}