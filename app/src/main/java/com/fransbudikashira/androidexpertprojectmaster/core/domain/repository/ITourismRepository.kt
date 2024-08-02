package com.fransbudikashira.androidexpertprojectmaster.core.domain.repository

import com.fransbudikashira.androidexpertprojectmaster.core.data.Resource
import com.fransbudikashira.androidexpertprojectmaster.core.domain.model.Tourism
import kotlinx.coroutines.flow.Flow

interface ITourismRepository {

    fun getAllTourism(): Flow<Resource<List<Tourism>>>

    fun getFavoriteTourism(): Flow<List<Tourism>>

    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}