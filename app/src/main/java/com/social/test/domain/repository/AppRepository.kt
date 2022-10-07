package com.social.test.domain.repository

import androidx.paging.PagingData
import com.social.test.data.local.dto.ItemPostRepositoryModel
import com.social.test.domain.model.ItemPost
import kotlinx.coroutines.flow.Flow

interface AppRepository {
    suspend fun updatePostRepositories(post: ItemPostRepositoryModel)
    suspend fun getPagedPost():  Flow<PagingData<ItemPost>>
}