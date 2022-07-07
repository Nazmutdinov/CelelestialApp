package com.example.celestialapp.domain.usecase

sealed class ResourceUseCase<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T): ResourceUseCase<T>(data)
    class EmptyData<T>(message: String): ResourceUseCase<T>(message = message)
    class Error<T>(message: String, data: T? = null): ResourceUseCase<T>(data ,message)
}
