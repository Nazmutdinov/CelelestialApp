package com.example.celestialapp.presentation.vm;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0011\u001a\u00020\u00172\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u000eR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/example/celestialapp/presentation/vm/FavouriteViewModel;", "Landroidx/lifecycle/ViewModel;", "getAllTagsUseCase", "Lcom/example/celestialapp/domain/usecase/GetAllTagsUseCase;", "getFavouriteCelestialsByTagUseCase", "Lcom/example/celestialapp/domain/usecase/GetFavouriteCelestialsByTagUseCase;", "(Lcom/example/celestialapp/domain/usecase/GetAllTagsUseCase;Lcom/example/celestialapp/domain/usecase/GetFavouriteCelestialsByTagUseCase;)V", "_celestials", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/celestialapp/domain/models/FavouriteCelestialDataItem;", "_errorMessage", "", "_keywords", "Lcom/example/celestialapp/domain/models/TagDataItem;", "celestials", "Landroidx/lifecycle/LiveData;", "getCelestials", "()Landroidx/lifecycle/LiveData;", "errorMessage", "getErrorMessage", "keywords", "getKeywords", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tappedKeyword", "keyword", "app_debug"})
public final class FavouriteViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.celestialapp.domain.usecase.GetAllTagsUseCase getAllTagsUseCase = null;
    private final com.example.celestialapp.domain.usecase.GetFavouriteCelestialsByTagUseCase getFavouriteCelestialsByTagUseCase = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.celestialapp.domain.models.TagDataItem>> _keywords = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.celestialapp.domain.models.TagDataItem>> keywords = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.celestialapp.domain.models.FavouriteCelestialDataItem>> _celestials = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.celestialapp.domain.models.FavouriteCelestialDataItem>> celestials = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> errorMessage = null;
    
    @javax.inject.Inject()
    public FavouriteViewModel(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.usecase.GetAllTagsUseCase getAllTagsUseCase, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.usecase.GetFavouriteCelestialsByTagUseCase getFavouriteCelestialsByTagUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.celestialapp.domain.models.TagDataItem>> getKeywords() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.celestialapp.domain.models.FavouriteCelestialDataItem>> getCelestials() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    /**
     * получить список всех ключевых слов для списка nasaId небесных тел
     */
    public final void getKeywords() {
    }
    
    /**
     * тапнули по тегу
     * нужно сменить состояние тега (включен\выключен)
     * заново получить список небесных тел для включенных тегов
     */
    public final void tappedKeyword(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.models.TagDataItem keyword) {
    }
    
    /**
     * получить список небесных тел для заданного списка ключевых слов
     */
    private final java.lang.Object getCelestials(java.util.List<com.example.celestialapp.domain.models.TagDataItem> keywords, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}