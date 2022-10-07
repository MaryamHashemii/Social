package com.social.test.domain.usecase

import androidx.paging.PagingData
import com.social.test.di.coroutine.IoDispatcher
import com.social.test.domain.model.ItemPost
import com.social.test.domain.repository.AppRepository
import com.social.test.domain.usecase.coroutin.FlowUseCase
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetPagedPostUseCase @Inject constructor(
    private val appRepository: AppRepository,
    @IoDispatcher coroutineDispatcher: CoroutineDispatcher
) : FlowUseCase<Unit, PagingData<ItemPost>>(coroutineDispatcher) {
    override suspend fun execute(parameters: Unit): Flow<PagingData<ItemPost>> {
     return appRepository.getPagedPost()
    }
}