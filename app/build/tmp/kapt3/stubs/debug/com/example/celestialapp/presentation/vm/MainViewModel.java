package com.example.celestialapp.presentation.vm;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0014\u0010\u0014\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/celestialapp/presentation/vm/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "myPager", "Lcom/example/celestialapp/data/repository/MyPager;", "(Lcom/example/celestialapp/data/repository/MyPager;)V", "_keywords", "Landroidx/lifecycle/MutableLiveData;", "", "", "celestialsFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/celestialapp/domain/models/CelestialDataItem;", "getCelestialsFlow", "()Lkotlinx/coroutines/flow/Flow;", "setCelestialsFlow", "(Lkotlinx/coroutines/flow/Flow;)V", "initiateFlow", "", "initiateKeywords", "saveKeywords", "keywords", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.celestialapp.data.repository.MyPager myPager = null;
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.celestialapp.domain.models.CelestialDataItem>> celestialsFlow;
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> _keywords = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.data.repository.MyPager myPager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.celestialapp.domain.models.CelestialDataItem>> getCelestialsFlow() {
        return null;
    }
    
    public final void setCelestialsFlow(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.celestialapp.domain.models.CelestialDataItem>> p0) {
    }
    
    /**
     * зададим начальный поток небесных тел, который зависит от ключевых слов
     */
    private final void initiateFlow() {
    }
    
    /**
     * зададим начальный список ключевых слов. По умолчанию это первый элемент CelestialName
     */
    private final void initiateKeywords() {
    }
    
    /**
     * получить поток небесных тел, смена keywords поиска
     * по умолчанию keywords = moon
     * keywords задается или из пунктов меню в HomeFragment
     * или в detailed fragment из тегов небесного тела
     */
    public final void saveKeywords(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> keywords) {
    }
}