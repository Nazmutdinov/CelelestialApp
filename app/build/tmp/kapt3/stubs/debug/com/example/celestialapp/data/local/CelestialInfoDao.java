package com.example.celestialapp.data.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\'J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\'J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\'J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\'J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000b\u001a\u00020\fH\'\u00a2\u0006\u0002\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\fH\'J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\u0006\u0010\u000b\u001a\u00020\fH\'J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001d\u001a\u00020\fH\'\u00a2\u0006\u0002\u0010\u001eJ\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH\'J\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\'J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\nH\'J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&H\'J\u0010\u0010\'\u001a\u00020\u00032\u0006\u0010%\u001a\u00020(H\'J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0018H\'J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0012H\'J\u001f\u0010-\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010\u0015H\'\u00a2\u0006\u0002\u0010/J\u0018\u00100\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00101\u001a\u000202H\'\u00a8\u00063"}, d2 = {"Lcom/example/celestialapp/data/local/CelestialInfoDao;", "", "deleteCelestialTagsCrossRef", "", "celestialId", "", "tagId", "deleteTag", "deleteTagCrossRef", "getCelestialByNasaId", "Lcom/example/celestialapp/data/local/entities/CelestialInfoEntity;", "nasaId", "", "getCelestialWithTags", "", "Lcom/example/celestialapp/data/local/relations/CelestialWithTags;", "listNasaId", "getExclusiveTags", "Lcom/example/celestialapp/data/local/entities/TagInfoEntity;", "listTagId", "getFavouriteDate", "", "(Ljava/lang/String;)Ljava/lang/Long;", "getKeywordByName", "Lcom/example/celestialapp/data/local/entities/KeywordInfoEntity;", "keywordName", "getKeywordsByNasaId", "Lcom/example/celestialapp/data/local/relations/CelestialWithKeywords;", "getTagIdByName", "tagName", "(Ljava/lang/String;)Ljava/lang/Integer;", "getTags", "getTagsByListTagId", "Lcom/example/celestialapp/data/local/relations/TagWithCelestials;", "insertCelestial", "celestialInfoEntity", "insertCelestialKeywordCrossRef", "crossRef", "Lcom/example/celestialapp/data/local/entities/CelestialKeywordCrossRef;", "insertCelestialTagCrossRef", "Lcom/example/celestialapp/data/local/entities/CelestialTagCrossRef;", "insertKeyword", "keywordInfoEntity", "insertTag", "tagInfoEntity", "updateDateFavouriteCreated", "dateFavouriteCreated", "(Ljava/lang/String;Ljava/lang/Long;)V", "updateImage", "image", "", "app_debug"})
public abstract interface CelestialInfoDao {
    
    /**
     * проверить есть ли небесное тело в списке избранных для данного nasaId
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM celestialinfoentity WHERE nasa_id = :nasaId")
    public abstract com.example.celestialapp.data.local.entities.CelestialInfoEntity getCelestialByNasaId(@org.jetbrains.annotations.NotNull()
    java.lang.String nasaId);
    
    /**
     * получить все теги, которых нет в заданном списке исключения
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM taginfoentity WHERE tagId not IN (:listTagId)")
    public abstract java.util.List<com.example.celestialapp.data.local.entities.TagInfoEntity> getExclusiveTags(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> listTagId);
    
    /**
     * получить все теги
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM taginfoentity")
    public abstract java.util.List<com.example.celestialapp.data.local.entities.TagInfoEntity> getTags();
    
    /**
     * получить id тега по имени
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT tagId FROM taginfoentity WHERE name = :tagName")
    public abstract java.lang.Integer getTagIdByName(@org.jetbrains.annotations.NotNull()
    java.lang.String tagName);
    
    /**
     * получить все теги с привязкой к небесным телам для заданного списка nasaId
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM celestialinfoentity WHERE nasa_id IN(:listNasaId)")
    @androidx.room.Transaction()
    public abstract java.util.List<com.example.celestialapp.data.local.relations.CelestialWithTags> getCelestialWithTags(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> listNasaId);
    
    /**
     * получить все привязки тел\тегов для заданного списка keywordId
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM taginfoentity WHERE tagId IN(:listTagId)")
    @androidx.room.Transaction()
    public abstract java.util.List<com.example.celestialapp.data.local.relations.TagWithCelestials> getTagsByListTagId(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> listTagId);
    
    /**
     * получить все api ключевые слова и небесные тела для заданного nasaId
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM celestialinfoentity WHERE nasa_id = :nasaId")
    @androidx.room.Transaction()
    public abstract java.util.List<com.example.celestialapp.data.local.relations.CelestialWithKeywords> getKeywordsByNasaId(@org.jetbrains.annotations.NotNull()
    java.lang.String nasaId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM keywordinfoentity WHERE name = :keywordName")
    public abstract com.example.celestialapp.data.local.entities.KeywordInfoEntity getKeywordByName(@org.jetbrains.annotations.NotNull()
    java.lang.String keywordName);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT dateFavouriteCreated FROM celestialinfoentity WHERE nasa_id = :nasaId")
    public abstract java.lang.Long getFavouriteDate(@org.jetbrains.annotations.NotNull()
    java.lang.String nasaId);
    
    /**
     * сохранить небесное тело
     */
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertCelestial(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.local.entities.CelestialInfoEntity celestialInfoEntity);
    
    /**
     * сохранить картинку небесного тела
     */
    @androidx.room.Query(value = "UPDATE celestialinfoentity SET image = :image WHERE nasa_id = :nasaId")
    public abstract void updateImage(@org.jetbrains.annotations.NotNull()
    java.lang.String nasaId, @org.jetbrains.annotations.NotNull()
    byte[] image);
    
    /**
     * сохранить дату сохранения небесного тела в избранных
     */
    @androidx.room.Query(value = "UPDATE celestialinfoentity SET dateFavouriteCreated = :dateFavouriteCreated WHERE nasa_id = :nasaId")
    public abstract void updateDateFavouriteCreated(@org.jetbrains.annotations.NotNull()
    java.lang.String nasaId, @org.jetbrains.annotations.Nullable()
    java.lang.Long dateFavouriteCreated);
    
    /**
     * сохранить тег
     */
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertTag(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.local.entities.TagInfoEntity tagInfoEntity);
    
    /**
     * сохранить привязку тега и небесного тела
     */
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertCelestialTagCrossRef(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.local.entities.CelestialTagCrossRef crossRef);
    
    /**
     * сохранить api ключевое слово
     */
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertKeyword(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.local.entities.KeywordInfoEntity keywordInfoEntity);
    
    /**
     * сохранить привязку api ключевого слова и небесного тела
     */
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertCelestialKeywordCrossRef(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.local.entities.CelestialKeywordCrossRef crossRef);
    
    /**
     * удалить тег из БД
     */
    @androidx.room.Query(value = "DELETE FROM taginfoentity WHERE tagId = :tagId")
    public abstract void deleteTag(int tagId);
    
    /**
     * удалить привязку тега для заданного tagId
     */
    @androidx.room.Query(value = "DELETE FROM celestialtagcrossref WHERE tagId = :tagId")
    public abstract void deleteTagCrossRef(int tagId);
    
    /**
     * удалить привязку тега и небесного тела
     */
    @androidx.room.Query(value = "DELETE FROM celestialtagcrossref WHERE celestialId = :celestialId AND tagId = :tagId")
    public abstract void deleteCelestialTagsCrossRef(int celestialId, int tagId);
}