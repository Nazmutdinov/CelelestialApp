package com.example.celestialapp.presentation.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u0011B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/celestialapp/presentation/adapters/FavouriteCelestialAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/celestialapp/domain/models/FavouriteCelestialDataItem;", "Lcom/example/celestialapp/presentation/adapters/FavouriteCelestialAdapter$Holder;", "callbackItemClick", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffCallback", "Holder", "app_debug"})
public final class FavouriteCelestialAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.celestialapp.domain.models.FavouriteCelestialDataItem, com.example.celestialapp.presentation.adapters.FavouriteCelestialAdapter.Holder> {
    private final kotlin.jvm.functions.Function1<com.example.celestialapp.domain.models.FavouriteCelestialDataItem, kotlin.Unit> callbackItemClick = null;
    
    public FavouriteCelestialAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.celestialapp.domain.models.FavouriteCelestialDataItem, kotlin.Unit> callbackItemClick) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.celestialapp.presentation.adapters.FavouriteCelestialAdapter.Holder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.presentation.adapters.FavouriteCelestialAdapter.Holder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/celestialapp/presentation/adapters/FavouriteCelestialAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/celestialapp/databinding/CelestialItemBinding;", "(Lcom/example/celestialapp/databinding/CelestialItemBinding;)V", "getBinding", "()Lcom/example/celestialapp/databinding/CelestialItemBinding;", "app_debug"})
    public static final class Holder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.celestialapp.databinding.CelestialItemBinding binding = null;
        
        public Holder(@org.jetbrains.annotations.NotNull()
        com.example.celestialapp.databinding.CelestialItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.celestialapp.databinding.CelestialItemBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/celestialapp/presentation/adapters/FavouriteCelestialAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/celestialapp/domain/models/FavouriteCelestialDataItem;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.celestialapp.domain.models.FavouriteCelestialDataItem> {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.celestialapp.presentation.adapters.FavouriteCelestialAdapter.DiffCallback INSTANCE = null;
        
        private DiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.celestialapp.domain.models.FavouriteCelestialDataItem oldItem, @org.jetbrains.annotations.NotNull()
        com.example.celestialapp.domain.models.FavouriteCelestialDataItem newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.celestialapp.domain.models.FavouriteCelestialDataItem oldItem, @org.jetbrains.annotations.NotNull()
        com.example.celestialapp.domain.models.FavouriteCelestialDataItem newItem) {
            return false;
        }
    }
}