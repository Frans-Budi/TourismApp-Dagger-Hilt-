package com.fransbudikashira.androidexpertprojectmaster.core.di

import com.fransbudikashira.androidexpertprojectmaster.core.data.TourismRepository
import com.fransbudikashira.androidexpertprojectmaster.core.domain.repository.ITourismRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [NetworkModule::class, DatabaseModule::class])
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(tourismRepository: TourismRepository): ITourismRepository

}