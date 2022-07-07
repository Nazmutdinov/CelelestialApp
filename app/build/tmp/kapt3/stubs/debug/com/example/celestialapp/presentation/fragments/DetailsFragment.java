package com.example.celestialapp.presentation.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J$\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010\'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\"2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010)\u001a\u00020\u001bH\u0002J\b\u0010*\u001a\u00020\u001bH\u0002J\b\u0010+\u001a\u00020\u001bH\u0002J\u0010\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u0012H\u0002J\u0010\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u000200H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\b\u001a\u0004\b\u0017\u0010\u0018\u00a8\u00061"}, d2 = {"Lcom/example/celestialapp/presentation/fragments/DetailsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/example/celestialapp/presentation/adapters/KeywordAdapter;", "getAdapter", "()Lcom/example/celestialapp/presentation/adapters/KeywordAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "Lcom/example/celestialapp/databinding/FragmentDetailsBinding;", "dialog", "Lcom/example/celestialapp/presentation/fragments/DialogFactory;", "getDialog", "()Lcom/example/celestialapp/presentation/fragments/DialogFactory;", "setDialog", "(Lcom/example/celestialapp/presentation/fragments/DialogFactory;)V", "nasaId", "", "toolbarFragment", "Landroidx/appcompat/widget/Toolbar;", "viewModel", "Lcom/example/celestialapp/presentation/vm/DetailedViewModel;", "getViewModel", "()Lcom/example/celestialapp/presentation/vm/DetailedViewModel;", "viewModel$delegate", "keywordTapped", "", "item", "Lcom/example/celestialapp/domain/models/TagDataItem;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "searchSameCelestials", "setupUI", "setupViewModel", "sharePhoto", "imagePath", "updateUIData", "data", "Lcom/example/celestialapp/domain/models/FavouriteCelestialDataItem;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class DetailsFragment extends androidx.fragment.app.Fragment {
    private com.example.celestialapp.databinding.FragmentDetailsBinding binding;
    private androidx.appcompat.widget.Toolbar toolbarFragment;
    private final kotlin.Lazy adapter$delegate = null;
    @javax.inject.Inject()
    public com.example.celestialapp.presentation.fragments.DialogFactory dialog;
    private java.lang.String nasaId;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public DetailsFragment() {
        super();
    }
    
    private final com.example.celestialapp.presentation.adapters.KeywordAdapter getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.celestialapp.presentation.fragments.DialogFactory getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.presentation.fragments.DialogFactory p0) {
    }
    
    private final com.example.celestialapp.presentation.vm.DetailedViewModel getViewModel() {
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
    
    private final void setupUI() {
    }
    
    /**
     * отправить ссылку на фото другу
     */
    private final void sharePhoto(java.lang.String imagePath) {
    }
    
    /**
     * настройка view model
     */
    private final void setupViewModel() {
    }
    
    /**
     * обновить данные в окне
     */
    private final void updateUIData(com.example.celestialapp.domain.models.FavouriteCelestialDataItem data) {
    }
    
    /**
     * переход в окно поиска похожих небесных тел
     */
    private final void searchSameCelestials() {
    }
    
    /**
     * тап по тегу
     */
    private final void keywordTapped(com.example.celestialapp.domain.models.TagDataItem item) {
    }
}