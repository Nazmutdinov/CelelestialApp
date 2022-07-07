package com.example.celestialapp.presentation.vm;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/example/celestialapp/presentation/vm/ZoomViewModel;", "Landroidx/lifecycle/ViewModel;", "getFavouriteCelestialByIdUseCase", "Lcom/example/celestialapp/domain/usecase/GetFavouriteCelestialByIdUseCase;", "(Lcom/example/celestialapp/domain/usecase/GetFavouriteCelestialByIdUseCase;)V", "_errorMessage", "Landroidx/lifecycle/MutableLiveData;", "", "_image", "", "errorMessage", "Landroidx/lifecycle/LiveData;", "getErrorMessage", "()Landroidx/lifecycle/LiveData;", "image", "getImage", "", "id", "app_debug"})
public final class ZoomViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.celestialapp.domain.usecase.GetFavouriteCelestialByIdUseCase getFavouriteCelestialByIdUseCase = null;
    private final androidx.lifecycle.MutableLiveData<byte[]> _image = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<byte[]> image = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> errorMessage = null;
    
    @javax.inject.Inject()
    public ZoomViewModel(@org.jetbrains.annotations.NotNull()
    com.example.celestialapp.domain.usecase.GetFavouriteCelestialByIdUseCase getFavouriteCelestialByIdUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<byte[]> getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    /**
     * получить картинку из БД для заддного nasaId
     */
    public final void getImage(@org.jetbrains.annotations.Nullable()
    java.lang.String id) {
    }
}