package com.example.celestialapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/celestialapp/data/repository/LocalDataMapper;", "", "utils", "Lcom/example/celestialapp/data/repository/Utils;", "(Lcom/example/celestialapp/data/repository/Utils;)V", "mapCelestialInfoEntityToModel", "Lcom/example/celestialapp/domain/models/FavouriteCelestialDataItem;", "celestialInfoEntity", "Lcom/example/celestialapp/data/local/entities/CelestialInfoEntity;", "mapListCelestialInfoEntityToModel", "", "listCelestialInfoEntity", "mapTagInfoEntityToModel", "Lcom/example/celestialapp/domain/models/TagDataItem;", "tagInfoEntity", "Lcom/example/celestialapp/data/local/entities/TagInfoEntity;", "app_debug"})
public final class LocalDataMapper {
    private final com.example.celestialapp.data.repository.Utils utils = null;
    
    public LocalDataMapper(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.Utils utils) {
        super();
    }
    
    /**
     * маппинг тега KeywordInfoEntity из БД в модель KeywordDataItem
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.celestialapp.domain.models.TagDataItem mapTagInfoEntityToModel(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.local.entities.TagInfoEntity tagInfoEntity) {
        return null;
    }
    
    /**
     * маппинг небесного тела CelestialInfoEntity из БД в модель FavouriteCelestialDataItem
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.celestialapp.domain.models.FavouriteCelestialDataItem mapCelestialInfoEntityToModel(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.local.entities.CelestialInfoEntity celestialInfoEntity) {
        return null;
    }
    
    /**
     * маппинг списка небесных тел CelestialInfoEntity из БД в список моделей FavouriteCelestialDataItem
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.celestialapp.domain.models.FavouriteCelestialDataItem> mapListCelestialInfoEntityToModel(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.celestialapp.data.local.entities.CelestialInfoEntity> listCelestialInfoEntity) {
        return null;
    }
}