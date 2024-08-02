package com.fransbudikashira.androidexpertprojectmaster.core.domain.usecase

import com.fransbudikashira.androidexpertprojectmaster.core.data.Resource
import com.fransbudikashira.androidexpertprojectmaster.core.domain.model.Tourism
import kotlinx.coroutines.flow.Flow

interface TourismUseCase {
    fun getAllTourism(): Flow<Resource<List<Tourism>>>
    fun getFavoriteTourism(): Flow<List<Tourism>>
    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}