package com.social.test.domain.usecase

import com.social.test.di.coroutine.IoDispatcher
import com.social.test.domain.model.ItemPost
import com.social.test.domain.model.toItemPostRepositoryModel
import com.social.test.domain.repository.AppRepository
import com.social.test.domain.usecase.coroutin.FlowUseCase
import com.social.test.domain.usecase.coroutin.UseCase
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class UpdatePostUseCase @Inject constructor(
    private val appRepository: AppRepository,
    @IoDispatcher coroutineDispatcher: CoroutineDispatcher
) : FlowUseCase<ItemPost, Unit>(coroutineDispatcher) {

    override suspend fun execute(parameters: ItemPost): Flow<Unit> {
        return flowOf(appRepository.updatePostRepositories(parameters.toItemPostRepositoryModel()))

    }
}