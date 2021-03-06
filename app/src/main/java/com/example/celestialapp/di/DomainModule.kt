package com.example.celestialapp.di

import android.content.Context
import com.example.celestialapp.data.repository.LocalDataMapper
import com.example.celestialapp.data.repository.Utils
import com.example.celestialapp.domain.repository.LocalDataRepository
import com.example.celestialapp.domain.repository.RemoteDataRepository
import com.example.celestialapp.domain.usecase.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {
    @Provides
    @ViewModelScoped
    fun provideAddTagCelestialUseCase(
        @ApplicationContext context: Context,
        localDataRepository: LocalDataRepository
    ): AddTagCelestialUseCase =
        AddTagCelestialUseCase(context, localDataRepository)

    @Provides
    @ViewModelScoped
    fun provideDeleteCrossRefDataUseCase(localDataRepository: LocalDataRepository): DeleteCrossRefDataUseCase =
        DeleteCrossRefDataUseCase(localDataRepository)

    @Provides
    @ViewModelScoped
    fun provideDeleteTagsDataUseCase(localDataRepository: LocalDataRepository): DeleteTagsDataUseCase =
        DeleteTagsDataUseCase(localDataRepository)

    @Provides
    @ViewModelScoped
    fun provideGetAllTagsUseCase(
        localDataRepository: LocalDataRepository,
        localDataMapper: LocalDataMapper
    ): GetAllTagsUseCase =
        GetAllTagsUseCase(localDataRepository, localDataMapper)

    @Provides
    @ViewModelScoped
    fun provideGetDetailedDataUseCase(
        localDataRepository: LocalDataRepository,
        remoteDataRepository: RemoteDataRepository,
        localDataMapper: LocalDataMapper
    ): GetDetailedDataUseCase =
        GetDetailedDataUseCase(localDataRepository, remoteDataRepository, localDataMapper)

    @Provides
    @ViewModelScoped
    fun provideGetFavouriteCelestialByIdUseCase(
        localDataRepository: LocalDataRepository,
        localDataMapper: LocalDataMapper
    ): GetFavouriteCelestialByIdUseCase =
        GetFavouriteCelestialByIdUseCase(localDataRepository, localDataMapper)

    @Provides
    @ViewModelScoped
    fun provideGetFavouriteCelestialsByTagUseCase(
        localDataRepository: LocalDataRepository,
        localDataMapper: LocalDataMapper
    ): GetFavouriteCelestialsByTagUseCase =
        GetFavouriteCelestialsByTagUseCase(localDataRepository, localDataMapper)

    @Provides
    @ViewModelScoped
    fun provideGetKeywordsByNasaIdUseCase(localDataRepository: LocalDataRepository): GetKeywordsByNasaIdUseCase =
        GetKeywordsByNasaIdUseCase(localDataRepository)

    @Provides
    @ViewModelScoped
    fun provideGetTagsByNasaIdUseCase(localDataRepository: LocalDataRepository): GetTagsByNasaIdUseCase =
        GetTagsByNasaIdUseCase(localDataRepository)

    @Provides
    @ViewModelScoped
    fun provideInsertTagDataUseCase(
        @ApplicationContext context: Context,
        localDataRepository: LocalDataRepository): InsertTagDataUseCase =
        InsertTagDataUseCase(context, localDataRepository)

    @Provides
    @ViewModelScoped
    fun provideUpdateCacheUseCase(
        localDataRepository: LocalDataRepository,
        localDataMapper: LocalDataMapper,
        utils: Utils
    ): UpdateCacheUseCase =
        UpdateCacheUseCase(localDataRepository, localDataMapper, utils)

    @Provides
    @ViewModelScoped
    fun provideUpdateTagCelestialUseCase(localDataRepository: LocalDataRepository): UpdateTagCelestialUseCase =
        UpdateTagCelestialUseCase(localDataRepository)

}