package com.example.celestialapp.presentation.fragments;

import java.lang.System;

/**
 * главное окно, здесь будет лист небесных тел
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010\'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u0017H\u0002J\b\u0010+\u001a\u00020\u0017H\u0002J\b\u0010,\u001a\u00020\u0017H\u0002J\b\u0010-\u001a\u00020\u0017H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006."}, d2 = {"Lcom/example/celestialapp/presentation/fragments/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/example/celestialapp/presentation/adapters/CelestialAdapter;", "getAdapter", "()Lcom/example/celestialapp/presentation/adapters/CelestialAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "Lcom/example/celestialapp/databinding/FragmentHomeBinding;", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "navigationView", "Lcom/google/android/material/navigation/NavigationView;", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "viewModel", "Lcom/example/celestialapp/presentation/vm/MainViewModel;", "getViewModel", "()Lcom/example/celestialapp/presentation/vm/MainViewModel;", "viewModel$delegate", "celestialItemTapped", "", "celestialDataItem", "Lcom/example/celestialapp/domain/models/CelestialDataItem;", "navigationViewItemTapped", "menuItemId", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "refreshCelestialData", "celestialName", "Lcom/example/celestialapp/presentation/CelestialName;", "setupNavigationView", "setupToolbar", "setupUI", "setupViewModel", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private com.example.celestialapp.databinding.FragmentHomeBinding binding;
    private androidx.appcompat.widget.Toolbar toolbar;
    private androidx.drawerlayout.widget.DrawerLayout drawerLayout;
    private com.google.android.material.navigation.NavigationView navigationView;
    private final kotlin.Lazy adapter$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public HomeFragment() {
        super();
    }
    
    private final com.example.celestialapp.presentation.adapters.CelestialAdapter getAdapter() {
        return null;
    }
    
    private final com.example.celestialapp.presentation.vm.MainViewModel getViewModel() {
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
     * настройка бокового меню Navigation view
     */
    private final void setupNavigationView() {
    }
    
    /**
     * обработка бокового меню
     */
    private final void navigationViewItemTapped(int menuItemId) {
    }
    
    /**
     * обновить данные о небесных телах
     */
    private final void refreshCelestialData(com.example.celestialapp.presentation.CelestialName celestialName) {
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