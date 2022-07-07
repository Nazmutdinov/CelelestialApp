package com.example.celestialapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\'\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J+\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ+\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00180\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ+\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00180\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\n2\u0006\u0010%\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J%\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\u00180\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010)\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u001d\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00180\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+JI\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00152\b\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J\'\u00104\u001a\b\u0012\u0004\u0012\u0002050\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u00106\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\'\u00107\u001a\b\u0012\u0004\u0012\u0002080\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u00109\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010%\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u001f\u0010:\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010)\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J)\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010<\u001a\u0004\u0018\u00010\"H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010=J\'\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u00100\u001a\u000201H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010?R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006@"}, d2 = {"Lcom/example/celestialapp/data/repository/LocalDataRepositoryImpl;", "Lcom/example/celestialapp/domain/repository/LocalDataRepository;", "context", "Landroid/content/Context;", "db", "Lcom/example/celestialapp/data/local/CelestialDatabase;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Landroid/content/Context;Lcom/example/celestialapp/data/local/CelestialDatabase;Lkotlinx/coroutines/CoroutineDispatcher;)V", "deleteCelestialTagsCrossRef", "Lcom/example/celestialapp/data/repository/Resource;", "", "celestialId", "", "tagId", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTagData", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCelestialByNasaId", "Lcom/example/celestialapp/data/local/entities/CelestialInfoEntity;", "nasaId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDataByListNasaId", "", "Lcom/example/celestialapp/data/local/relations/CelestialWithTags;", "listNasaId", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDataByListTagId", "Lcom/example/celestialapp/data/local/relations/TagWithCelestials;", "listTagId", "getExclusiveTags", "Lcom/example/celestialapp/data/local/entities/TagInfoEntity;", "getFavouriteDate", "", "getKeywordsByName", "Lcom/example/celestialapp/data/local/entities/KeywordInfoEntity;", "keywordName", "getKeywordsByNasaId", "Lcom/example/celestialapp/data/local/relations/CelestialWithKeywords;", "getTagIdByName", "tagName", "getTags", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCelestialData", "title", "date", "description", "image", "", "imagePath", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCelestialKeywordsCrossRef", "Lcom/example/celestialapp/data/local/entities/CelestialKeywordCrossRef;", "keywordId", "insertCelestialTagsCrossRef", "Lcom/example/celestialapp/data/local/entities/CelestialTagCrossRef;", "insertKeywordData", "insertTagData", "updateFavouriteDate", "dateFavouriteCreated", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateImageData", "(Ljava/lang/String;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LocalDataRepositoryImpl implements com.example.celestialapp.domain.repository.LocalDataRepository {
    private final android.content.Context context = null;
    private final com.example.celestialapp.data.local.CelestialDatabase db = null;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    
    public LocalDataRepositoryImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.local.CelestialDatabase db, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super();
    }
    
    /**
     * сохранить небесное тело в БД
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertCelestialData(@org.jetbrains.annotations.NotNull()
    java.lang.String nasaId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    byte[] image, @org.jetbrains.annotations.NotNull()
    java.lang.String imagePath, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<com.example.celestialapp.data.local.entities.CelestialInfoEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateImageData(@org.jetbrains.annotations.NotNull()
    java.lang.String nasaId, @org.jetbrains.annotations.NotNull()
    byte[] image, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<com.example.celestialapp.data.local.entities.CelestialInfoEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateFavouriteDate(@org.jetbrains.annotations.NotNull()
    java.lang.String nasaId, @org.jetbrains.annotations.Nullable()
    java.lang.Long dateFavouriteCreated, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<com.example.celestialapp.data.local.entities.CelestialInfoEntity>> continuation) {
        return null;
    }
    
    /**
     * сохранить данные по ключевому слову в БД, получить keywordId
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertTagData(@org.jetbrains.annotations.NotNull()
    java.lang.String tagName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<java.lang.Integer>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertCelestialTagsCrossRef(int celestialId, int tagId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<com.example.celestialapp.data.local.entities.CelestialTagCrossRef>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertKeywordData(@org.jetbrains.annotations.NotNull()
    java.lang.String keywordName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<java.lang.Integer>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertCelestialKeywordsCrossRef(int celestialId, int keywordId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<com.example.celestialapp.data.local.entities.CelestialKeywordCrossRef>> continuation) {
        return null;
    }
    
    /**
     * достать все ключи и небесные тела из БД для заданного списка nasaId
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getDataByListNasaId(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> listNasaId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<java.util.List<com.example.celestialapp.data.local.relations.CelestialWithTags>>> continuation) {
        return null;
    }
    
    /**
     * достать все небесные тела и ключи для заданного списка ключевых слов
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getDataByListTagId(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> listTagId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<java.util.List<com.example.celestialapp.data.local.relations.TagWithCelestials>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTags(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<java.util.List<com.example.celestialapp.data.local.entities.TagInfoEntity>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getExclusiveTags(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> listTagId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<java.util.List<com.example.celestialapp.data.local.entities.TagInfoEntity>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTagIdByName(@org.jetbrains.annotations.NotNull()
    java.lang.String tagName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<java.lang.Integer>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCelestialByNasaId(@org.jetbrains.annotations.NotNull()
    java.lang.String nasaId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<com.example.celestialapp.data.local.entities.CelestialInfoEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getKeywordsByNasaId(@org.jetbrains.annotations.NotNull()
    java.lang.String nasaId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<java.util.List<com.example.celestialapp.data.local.relations.CelestialWithKeywords>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getKeywordsByName(@org.jetbrains.annotations.NotNull()
    java.lang.String keywordName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<com.example.celestialapp.data.local.entities.KeywordInfoEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFavouriteDate(@org.jetbrains.annotations.NotNull()
    java.lang.String nasaId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<java.lang.Long>> continuation) {
        return null;
    }
    
    /**
     * удалить ключевое слово
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteTagData(int tagId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<java.lang.Boolean>> continuation) {
        return null;
    }
    
    /**
     * удалить связь ключевого слова и небесного тела в БД
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteCelestialTagsCrossRef(int celestialId, int tagId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<java.lang.Boolean>> continuation) {
        return null;
    }
}