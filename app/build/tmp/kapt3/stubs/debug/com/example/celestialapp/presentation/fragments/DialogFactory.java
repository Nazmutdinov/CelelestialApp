package com.example.celestialapp.presentation.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\bJ*\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\b\u00a8\u0006\u000e"}, d2 = {"Lcom/example/celestialapp/presentation/fragments/DialogFactory;", "", "()V", "showAddKeywordDialog", "", "context", "Landroid/content/Context;", "callbackAddClick", "Lkotlin/Function1;", "", "showDeleteKeywordDialog", "keywordName", "callbackClick", "", "app_debug"})
public final class DialogFactory {
    
    public DialogFactory() {
        super();
    }
    
    /**
     * диалог для ввода названия нового ключевого слова
     */
    public final void showAddKeywordDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callbackAddClick) {
    }
    
    /**
     * диалог для удаления ключевого слова
     */
    public final void showDeleteKeywordDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String keywordName, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callbackClick) {
    }
}