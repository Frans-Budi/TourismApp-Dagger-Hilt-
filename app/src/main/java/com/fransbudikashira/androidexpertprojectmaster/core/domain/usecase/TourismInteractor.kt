package com.fransbudikashira.androidexpertprojectmaster.core.domain.usecase

import com.fransbudikashira.androidexpertprojectmaster.core.domain.model.Tourism
import com.fransbudikashira.androidexpertprojectmaster.core.domain.repository.ITourismRepository
import javax.inject.Inject

class TourismInteractor @Inject constructor(
    private val tourismRepository: ITourismRepository
): TourismUseCase {
    override fun getAllTourism() = tourismRepository.getAllTourism()

    override fun getFavoriteTourism() = tourismRepository.getFavoriteTourism()

    override fun setFavoriteTourism(tourism: Tourism, state: Boolean) =
        tourismRepository.setFavoriteTourism(tourism, state)
}