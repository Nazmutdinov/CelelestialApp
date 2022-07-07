package com.example.celestialapp.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ+\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J+\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00110\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J+\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00110\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\u0006\u0010\u001e\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00110\u00032\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\"\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00110\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$JI\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,J\'\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\'\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u001e\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\"\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ)\u00104\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u00105\u001a\u0004\u0018\u00010\u001bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00106J\'\u00107\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020*H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00069"}, d2 = {"Lcom/example/celestialapp/domain/repository/LocalDataRepository;", "", "deleteCelestialTagsCrossRef", "Lcom/example/celestialapp/data/repository/Resource;", "", "celestialId", "", "tagId", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTagData", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCelestialByNasaId", "Lcom/example/celestialapp/data/local/entities/CelestialInfoEntity;", "nasaId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDataByListNasaId", "", "Lcom/example/celestialapp/data/local/relations/CelestialWithTags;", "listNasaId", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDataByListTagId", "Lcom/example/celestialapp/data/local/relations/TagWithCelestials;", "listTagId", "getExclusiveTags", "Lcom/example/celestialapp/data/local/entities/TagInfoEntity;", "getFavouriteDate", "", "getKeywordsByName", "Lcom/example/celestialapp/data/local/entities/KeywordInfoEntity;", "keywordName", "getKeywordsByNasaId", "Lcom/example/celestialapp/data/local/relations/CelestialWithKeywords;", "getTagIdByName", "tagName", "getTags", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCelestialData", "title", "date", "description", "image", "", "imagePath", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCelestialKeywordsCrossRef", "Lcom/example/celestialapp/data/local/entities/CelestialKeywordCrossRef;", "keywordId", "insertCelestialTagsCrossRef", "Lcom/example/celestialapp/data/local/entities/CelestialTagCrossRef;", "insertKeywordData", "insertTagData", "updateFavouriteDate", "dateFavouriteCreated", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateImageData", "(Ljava/lang/String;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface LocalDataRepository {
    
    /**
     * достать все небесные тела и теги для заданного списка nasaId небесных тел
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDataByListNasaId(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> listNasaId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<java.util.List<com.example.celestialapp.data.local.relations.CelestialWithTags>>> continuation);
    
    /**
     * достать все небесные тела и теги для заданного списка ключевых слов
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDataByListTagId(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> listTagId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<java.util.List<com.example.celestialapp.data.local.relations.TagWithCelestials>>> continuation);
    
    /**
     * достать все теги из БД
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTags(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<java.util.List<com.example.celestialapp.data.local.entities.TagInfoEntity>>> continuation);
    
    /**
     * достать все теги, которых нет в списке listTagId
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getExclusiveTags(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> listTagId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<java.util.List<com.example.celestialapp.data.local.entities.TagInfoEntity>>> continuation);
    
    /**
     * достать ссылку на тег в БД
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTagIdByName(@org.jetbrains.annotations.NotNull()
    java.lang.String tagName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<java.lang.Integer>> continuation);
    
    /**
     * достать ссылку на небесное тело в БД
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCelestialByNasaId(@org.jetbrains.annotations.NotNull()
    java.lang.String nasaId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<com.example.celestialapp.data.local.entities.CelestialInfoEntity>> continuation);
    
    /**
     * достать все небесные тела и api ключевые словаи для заданного nasaId
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getKeywordsByNasaId(@org.jetbrains.annotations.NotNull()
    java.lang.String nasaId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<java.util.List<com.example.celestialapp.data.local.relations.CelestialWithKeywords>>> continuation);
    
    /**
     * достать api ключевое слово для заданного keywordName
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getKeywordsByName(@org.jetbrains.annotations.NotNull()
    java.lang.String keywordName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<com.example.celestialapp.data.local.entities.KeywordInfoEntity>> continuation);
    
    /**
     * достать дату сохранения небесного тела в избранное
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFavouriteDate(@org.jetbrains.annotations.NotNull()
    java.lang.String nasaId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<java.lang.Long>> continuation);
    
    /**
     * сохранить данные по небесному телу в БД
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertCelestialData(@org.jetbrains.annotations.NotNull()
    java.lang.String nasaId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    byte[] image, @org.jetbrains.annotations.NotNull()
    java.lang.String imagePath, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<com.example.celestialapp.data.local.entities.CelestialInfoEntity>> continuation);
    
    /**
     * сохранить картинку небесноого тела в БД
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateImageData(@org.jetbrains.annotations.NotNull()
    java.lang.String nasaId, @org.jetbrains.annotations.NotNull()
    byte[] image, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<com.example.celestialapp.data.local.entities.CelestialInfoEntity>> continuation);
    
    /**
     * сохранить дату избранного небесноого тела в БД
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateFavouriteDate(@org.jetbrains.annotations.NotNull()
    java.lang.String nasaId, @org.jetbrains.annotations.Nullable()
    java.lang.Long dateFavouriteCreated, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<com.example.celestialapp.data.local.entities.CelestialInfoEntity>> continuation);
    
    /**
     * сохранить данные по тегу в БД, получить tagId
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertTagData(@org.jetbrains.annotations.NotNull()
    java.lang.String tagName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<java.lang.Integer>> continuation);
    
    /**
     * сохранить привязку тега и небесного тела в БД
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertCelestialTagsCrossRef(int celestialId, int tagId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<com.example.celestialapp.data.local.entities.CelestialTagCrossRef>> continuation);
    
    /**
     * сохранить данные по api ключевому слово в БД, получить keywordId
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertKeywordData(@org.jetbrains.annotations.NotNull()
    java.lang.String keywordName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<java.lang.Integer>> continuation);
    
    /**
     * сохранить привязку api ключевого слова и небесного тела в БД
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertCelestialKeywordsCrossRef(int celestialId, int keywordId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<com.example.celestialapp.data.local.entities.CelestialKeywordCrossRef>> continuation);
    
    /**
     * удалить тег
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteTagData(int tagId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<java.lang.Boolean>> continuation);
    
    /**
     * удалить привязку тега и небесного тела в БД
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteCelestialTagsCrossRef(int celestialId, int tagId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.celestialapp.data.repository.Resource<java.lang.Boolean>> continuation);
}