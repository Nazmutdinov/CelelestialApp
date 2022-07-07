package com.example.celestialapp.presentation.vm;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bJ\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001aJ\u0006\u0010\u0014\u001a\u00020\u0016R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lcom/example/celestialapp/presentation/vm/KeywordsManagerViewModel;", "Landroidx/lifecycle/ViewModel;", "getAllTagsUseCase", "Lcom/example/celestialapp/domain/usecase/GetAllTagsUseCase;", "insertTagDataUseCase", "Lcom/example/celestialapp/domain/usecase/InsertTagDataUseCase;", "deleteTagsDataUseCase", "Lcom/example/celestialapp/domain/usecase/DeleteTagsDataUseCase;", "(Lcom/example/celestialapp/domain/usecase/GetAllTagsUseCase;Lcom/example/celestialapp/domain/usecase/InsertTagDataUseCase;Lcom/example/celestialapp/domain/usecase/DeleteTagsDataUseCase;)V", "_errorMessage", "Landroidx/lifecycle/MutableLiveData;", "", "_keywords", "", "Lcom/example/celestialapp/domain/models/TagDataItem;", "errorMessage", "Landroidx/lifecycle/LiveData;", "getErrorMessage", "()Landroidx/lifecycle/LiveData;", "keywords", "getKeywords", "addKeyword", "", "name", "deleteKeyword", "keywordId", "", "getKeywordByPosition", "position", "app_debug"})
public final class KeywordsManagerViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.celestialapp.domain.usecase.GetAllTagsUseCase getAllTagsUseCase = null;
    private final com.example.celestialapp.domain.usecase.InsertTagDataUseCase insertTagDataUseCase = null;
    private final com.example.celestialapp.domain.usecase.DeleteTagsDataUseCase deleteTagsDataUseCase = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.celestialapp.domain.models.TagDataItem>> _keywords = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.celestialapp.domain.models.TagDataItem>> keywords = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> errorMessage = null;
    
    @javax.inject.Inject()
    public KeywordsManagerViewModel(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.usecase.GetAllTagsUseCase getAllTagsUseCase, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.usecase.InsertTagDataUseCase insertTagDataUseCase, @org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.usecase.DeleteTagsDataUseCase deleteTagsDataUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.celestialapp.domain.models.TagDataItem>> getKeywords() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    /**
     * получить список всех ключевых слов
     */
    public final void getKeywords() {
    }
    
    /**
     * добавить тег
     */
    public final void addKeyword(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    /**
     * удалить тег
     */
    public final void deleteKeyword(int keywordId) {
    }
    
    /**
     * получить ключевое слово по индексу массива
     */
    @org.jetbrains.annotations.Nullable()
    public final com.example.celestialapp.domain.models.TagDataItem getKeywordByPosition(int position) {
        return null;
    }
}