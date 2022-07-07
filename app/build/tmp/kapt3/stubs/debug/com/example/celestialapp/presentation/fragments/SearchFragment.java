package com.example.celestialapp.presentation.fragments;

import java.lang.System;

/**
 * окно результата поиска небесных тел по заданным тэгам
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\"\u001a\u00020\u0014H\u0002J\b\u0010#\u001a\u00020\u0014H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006$"}, d2 = {"Lcom/example/celestialapp/presentation/fragments/SearchFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/example/celestialapp/presentation/adapters/CelestialAdapter;", "getAdapter", "()Lcom/example/celestialapp/presentation/adapters/CelestialAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "Lcom/example/celestialapp/databinding/FragmentSearchResultsBinding;", "keywords", "", "", "viewModel", "Lcom/example/celestialapp/presentation/vm/MainViewModel;", "getViewModel", "()Lcom/example/celestialapp/presentation/vm/MainViewModel;", "viewModel$delegate", "celestialItemTapped", "", "celestialDataItem", "Lcom/example/celestialapp/domain/models/CelestialDataItem;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setupUI", "setupViewModel", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SearchFragment extends androidx.fragment.app.Fragment {
    private com.example.celestialapp.databinding.FragmentSearchResultsBinding binding;
    private final java.util.List<java.lang.String> keywords = null;
    private final kotlin.Lazy adapter$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public SearchFragment() {
        super();
    }
    
    private final com.example.celestialapp.presentation.adapters.CelestialAdapter getAdapter() {
        return null;
    }
    
    private final com.example.celestialapp.presentation.vm.MainViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
     * тап по картинке небесного тела
     */
    private final void celestialItemTapped(com.example.celestialapp.domain.models.CelestialDataItem celestialDataItem) {
    }
    
    /**
     * настройка view model
     */
    private final void setupViewModel() {
    }
}