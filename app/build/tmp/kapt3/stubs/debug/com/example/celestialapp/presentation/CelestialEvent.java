package com.example.celestialapp.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0013\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\f\r\u000e\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/example/celestialapp/presentation/CelestialEvent;", "", "stringId", "", "(Ljava/lang/Integer;)V", "getStringId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "Add", "Delete", "None", "Save", "Lcom/example/celestialapp/presentation/CelestialEvent$Add;", "Lcom/example/celestialapp/presentation/CelestialEvent$Delete;", "Lcom/example/celestialapp/presentation/CelestialEvent$None;", "Lcom/example/celestialapp/presentation/CelestialEvent$Save;", "app_debug"})
public abstract class CelestialEvent {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer stringId = null;
    
    private CelestialEvent(java.lang.Integer stringId) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStringId() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/celestialapp/presentation/CelestialEvent$Add;", "Lcom/example/celestialapp/presentation/CelestialEvent;", "stringId", "", "(I)V", "app_debug"})
    public static final class Add extends com.example.celestialapp.presentation.CelestialEvent {
        
        public Add() {
            super(null);
        }
        
        public Add(int stringId) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/celestialapp/presentation/CelestialEvent$Save;", "Lcom/example/celestialapp/presentation/CelestialEvent;", "stringId", "", "(I)V", "app_debug"})
    public static final class Save extends com.example.celestialapp.presentation.CelestialEvent {
        
        public Save() {
            super(null);
        }
        
        public Save(int stringId) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/celestialapp/presentation/CelestialEvent$Delete;", "Lcom/example/celestialapp/presentation/CelestialEvent;", "stringId", "", "(I)V", "app_debug"})
    public static final class Delete extends com.example.celestialapp.presentation.CelestialEvent {
        
        public Delete() {
            super(null);
        }
        
        public Delete(int stringId) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/celestialapp/presentation/CelestialEvent$None;", "Lcom/example/celestialapp/presentation/CelestialEvent;", "()V", "app_debug"})
    public static final class None extends com.example.celestialapp.presentation.CelestialEvent {
        
        public None() {
            super(null);
        }
    }
}