package com.example.celestialapp.presentation.fragments;

import java.lang.System;

/**
 * окно избранных небесных тел
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010&\u001a\u00020\u0016H\u0002J\b\u0010\'\u001a\u00020\u0016H\u0002J\b\u0010(\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006)"}, d2 = {"Lcom/example/celestialapp/presentation/fragments/FavouriteFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/celestialapp/databinding/FragmentFavouriteBinding;", "celestialsAdapter", "Lcom/example/celestialapp/presentation/adapters/FavouriteCelestialAdapter;", "getCelestialsAdapter", "()Lcom/example/celestialapp/presentation/adapters/FavouriteCelestialAdapter;", "celestialsAdapter$delegate", "Lkotlin/Lazy;", "keywordsAdapter", "Lcom/example/celestialapp/presentation/adapters/KeywordAdapter;", "getKeywordsAdapter", "()Lcom/example/celestialapp/presentation/adapters/KeywordAdapter;", "keywordsAdapter$delegate", "viewModel", "Lcom/example/celestialapp/presentation/vm/FavouriteViewModel;", "getViewModel", "()Lcom/example/celestialapp/presentation/vm/FavouriteViewModel;", "viewModel$delegate", "celestialItemTapped", "", "favouriteCelestialDataItem", "Lcom/example/celestialapp/domain/models/FavouriteCelestialDataItem;", "keywordTapped", "item", "Lcom/example/celestialapp/domain/models/TagDataItem;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setupToolbar", "setupUI", "setupViewModel", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FavouriteFragment extends androidx.fragment.app.Fragment {
    private com.example.celestialapp.databinding.FragmentFavouriteBinding binding;
    private final kotlin.Lazy keywordsAdapter$delegate = null;
    private final kotlin.Lazy celestialsAdapter$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public FavouriteFragment() {
        super();
    }
    
    private final com.example.celestialapp.presentation.adapters.KeywordAdapter getKeywordsAdapter() {
        return null;
    }
    
    private final com.example.celestialapp.presentation.adapters.FavouriteCelestialAdapter getCelestialsAdapter() {
        return null;
    }
    
    private final com.example.celestialapp.presentation.vm.FavouriteViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * настройка UI элементов окна
     */
    private final void setupUI() {
    }
    
    /**
     * настройка toolbar
     */
    private final void setupToolbar() {
    }
    
    /**
     * тап по тегу
     */
    private final void keywordTapped(com.example.celestialapp.domain.models.TagDataItem item) {
    }
    
    /**
     * переход в детальную инфу небесного тела
     */
    private final void celestialItemTapped(com.example.celestialapp.domain.models.FavouriteCelestialDataItem favouriteCelestialDataItem) {
    }
    
    /**
     * настройка view model
     */
    private final void setupViewModel() {
    }
}