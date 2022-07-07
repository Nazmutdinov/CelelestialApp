package com.example.celestialapp.presentation.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/example/celestialapp/presentation/adapters/KeywordsManagerAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/celestialapp/domain/models/TagDataItem;", "Lcom/example/celestialapp/presentation/adapters/KeywordsManagerAdapter$Holder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Holder", "ItemDiffCallback", "app_debug"})
public final class KeywordsManagerAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.celestialapp.domain.models.TagDataItem, com.example.celestialapp.presentation.adapters.KeywordsManagerAdapter.Holder> {
    
    public KeywordsManagerAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.celestialapp.presentation.adapters.KeywordsManagerAdapter.Holder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.presentation.adapters.KeywordsManagerAdapter.Holder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/celestialapp/presentation/adapters/KeywordsManagerAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/celestialapp/databinding/ManagerKeywordItemBinding;", "(Lcom/example/celestialapp/databinding/ManagerKeywordItemBinding;)V", "getBinding", "()Lcom/example/celestialapp/databinding/ManagerKeywordItemBinding;", "app_debug"})
    public static final class Holder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.celestialapp.databinding.ManagerKeywordItemBinding binding = null;
        
        public Holder(@org.jetbrains.annotations.NotNull()
        com.example.celestialapp.databinding.ManagerKeywordItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.celestialapp.databinding.ManagerKeywordItemBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/celestialapp/presentation/adapters/KeywordsManagerAdapter$ItemDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/celestialapp/domain/models/TagDataItem;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class ItemDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.celestialapp.domain.models.TagDataItem> {
        
        public ItemDiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.celestialapp.domain.models.TagDataItem oldItem, @org.jetbrains.annotations.NotNull()
        com.example.celestialapp.domain.models.TagDataItem newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.celestialapp.domain.models.TagDataItem oldItem, @org.jetbrains.annotations.NotNull()
        com.example.celestialapp.domain.models.TagDataItem newItem) {
            return false;
        }
    }
}