package com.example.celestialapp.presentation.vm;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0017J\u0010\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020+2\b\u00101\u001a\u0004\u0018\u00010\u0017J\u0006\u0010\'\u001a\u00020+J\u0006\u0010)\u001a\u00020+J\u0010\u00102\u001a\u00020+2\u0006\u0010.\u001a\u00020/H\u0002J\u000e\u00103\u001a\u00020+2\u0006\u00104\u001a\u00020\u001dJ\u0016\u00105\u001a\u00020+2\u0006\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u000208R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001b0\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001b0\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001b0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010!R\u001d\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001b0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lcom/example/celestialapp/presentation/vm/DetailedViewModel;", "Landroidx/lifecycle/ViewModel;", "getFavouriteCelestialByIdUseCase", "Lcom/example/celestialapp/domain/usecase/GetFavouriteCelestialByIdUseCase;", "getDetailedDataUseCase", "Lcom/example/celestialapp/domain/usecase/GetDetailedDataUseCase;", "getTagsByNasaIdUseCase", "Lcom/example/celestialapp/domain/usecase/GetTagsByNasaIdUseCase;", "getKeywordsByNasaIdUseCase", "Lcom/example/celestialapp/domain/usecase/GetKeywordsByNasaIdUseCase;", "updateTagCelestialUseCase", "Lcom/example/celestialapp/domain/usecase/UpdateTagCelestialUseCase;", "addTagCelestialUseCase", "Lcom/example/celestialapp/domain/usecase/AddTagCelestialUseCase;", "deleteCrossRefDataUseCase", "Lcom/example/celestialapp/domain/usecase/DeleteCrossRefDataUseCase;", "updateCacheUseCase", "Lcom/example/celestialapp/domain/usecase/UpdateCacheUseCase;", "(Lcom/example/celestialapp/domain/usecase/GetFavouriteCelestialByIdUseCase;Lcom/example/celestialapp/domain/usecase/GetDetailedDataUseCase;Lcom/example/celestialapp/domain/usecase/GetTagsByNasaIdUseCase;Lcom/example/celestialapp/domain/usecase/GetKeywordsByNasaIdUseCase;Lcom/example/celestialapp/domain/usecase/UpdateTagCelestialUseCase;Lcom/example/celestialapp/domain/usecase/AddTagCelestialUseCase;Lcom/example/celestialapp/domain/usecase/DeleteCrossRefDataUseCase;Lcom/example/celestialapp/domain/usecase/UpdateCacheUseCase;)V", "_detailedData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/celestialapp/domain/models/FavouriteCelestialDataItem;", "_errorMessage", "", "_eventCelestial", "Lcom/example/celestialapp/presentation/CelestialEvent;", "_keywords", "", "_tags", "Lcom/example/celestialapp/domain/models/TagDataItem;", "detailedData", "Landroidx/lifecycle/LiveData;", "getDetailedData", "()Landroidx/lifecycle/LiveData;", "errorMessage", "getErrorMessage", "eventCelestial", "getEventCelestial", "keywords", "getKeywords", "tags", "getTags", "addFavouriteCelestial", "", "keywordName", "deleteFavouriteCelestial", "keywordId", "", "getData", "nasaIdNullable", "saveFavouriteCelestial", "tappedKeyword", "keyword", "updateCache", "nasaId", "bitmap", "Landroid/graphics/Bitmap;", "app_debug"})
public class DetailedViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.celestialapp.domain.usecase.GetFavouriteCelestialByIdUseCase getFavouriteCelestialByIdUseCase = null;
    private final com.example.celestialapp.domain.usecase.GetDetailedDataUseCase getDetailedDataUseCase = null;
    private final com.example.celestialapp.domain.usecase.GetTagsByNasaIdUseCase getTagsByNasaIdUseCase = null;
    private final com.example.celestialapp.domain.usecase.GetKeywordsByNasaIdUseCase getKeywordsByNasaIdUseCase = null;
    private final com.example.celestialapp.domain.usecase.UpdateTagCelestialUseCase updateTagCelestialUseCase = null;
    private final com.example.celestialapp.domain.usecase.AddTagCelestialUseCase addTagCelestialUseCase = null;
    private final com.example.celestialapp.domain.usecase.DeleteCrossRefDataUseCase deleteCrossRefDataUseCase = null;
    private final com.example.celestialapp.domain.usecase.UpdateCacheUseCase updateCacheUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.example.celestialapp.domain.models.FavouriteCelestialDataItem> _detailedData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.celestialapp.domain.models.FavouriteCelestialDataItem> detailedData = null;
    private final androidx.lifecycle.MutableLiveData<com.example.celestialapp.presentation.CelestialEvent> _eventCelestial = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.celestialapp.presentation.CelestialEvent> eventCelestial = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.celestialapp.domain.models.TagDataItem>> _tags = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.celestialapp.domain.models.TagDataItem>> tags = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> _keywords = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<java.lang.String>> keywords = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> errorMessage = null;
    
    @javax.inject.Inject()
    public DetailedViewModel(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.usecase.GetFavouriteCelestialByIdUseCase getFavouriteCelestialByIdUseCase, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.usecase.GetDetailedDataUseCase getDetailedDataUseCase, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.usecase.GetTagsByNasaIdUseCase getTagsByNasaIdUseCase, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.usecase.GetKeywordsByNasaIdUseCase getKeywordsByNasaIdUseCase, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.usecase.UpdateTagCelestialUseCase updateTagCelestialUseCase, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.usecase.AddTagCelestialUseCase addTagCelestialUseCase, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.usecase.DeleteCrossRefDataUseCase deleteCrossRefDataUseCase, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.usecase.UpdateCacheUseCase updateCacheUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.celestialapp.domain.models.FavouriteCelestialDataItem> getDetailedData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.celestialapp.presentation.CelestialEvent> getEventCelestial() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.celestialapp.domain.models.TagDataItem>> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.String>> getKeywords() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    /**
     * получить данные из БД\api
     */
    public final void getData(@org.jetbrains.annotations.Nullable()
    java.lang.String nasaIdNullable) {
    }
    
    /**
     * получить список привязок тегов для списка nasaId небесных тел
     */
    public final void getTags() {
    }
    
    /**
     * добавить тег, небесное тело и связь в БД
     */
    public final void addFavouriteCelestial(@org.jetbrains.annotations.NotNull()
    java.lang.String keywordName) {
    }
    
    /**
     * сохраним существующий тег, небесное тело и связь в БД
     */
    private final void saveFavouriteCelestial(int keywordId) {
    }
    
    /**
     * удалим связь тега и небесного тела
     */
    private final void deleteFavouriteCelestial(int keywordId) {
    }
    
    /**
     * тапнули по тэгу, нужно сменить картинку и привязать/отвязать тег к небесному телу
     */
    public final void tappedKeyword(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.models.TagDataItem keyword) {
    }
    
    /**
     * сохранить bitmap medium картинку в кэш БД
     */
    public final void updateCache(@org.jetbrains.annotations.NotNull()
    java.lang.String nasaId, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap) {
    }
    
    /**
     * получить список привязок ключевых слов для небесного тела
     */
    public final void getKeywords() {
    }
}