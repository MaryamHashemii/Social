package com.social.test.data

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.social.test.data.local.dao.AppDao
import com.social.test.data.local.dao.Converters.saveList
import com.social.test.data.local.dto.ItemPostRepositoryModel
import com.social.test.data.sharedPref.DataSharedPref
import com.social.test.domain.model.ItemPost
import com.social.test.domain.repository.AppRepository
import com.social.test.presentation.PostPagingSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class AppRepositoryImp @Inject constructor(
    private val appDao: AppDao,
    private val sharedPref: DataSharedPref
) : AppRepository {
    private suspend fun saveToLocalDB() {
        //mock the data
        if (sharedPref.isTableEmpty) {
            val result = arrayListOf<ItemPostRepositoryModel>()
            for (i in 1..100) {
                result.add(
                    ItemPostRepositoryModel(
                        id = i,
                        likeCount = i +1,
                        isLiked = false,
                        commentCount = i + 10,
                        comments = listOf("a", "b", "c").saveList(),
                        imageUrl = "https://static.cdn.asset.aparat.com/avt/48040142-3889-b__8927.jpg"
                    )
                )

            }

            appDao.savePostRepositories(
                result
            )
            sharedPref.isTableEmpty = false
        }
    }

    override suspend fun getPagedPost(): Flow<PagingData<ItemPost>> {
        saveToLocalDB()
        return (
                Pager(
                    PagingConfig(
                        pageSize = 5,
                        enablePlaceholders = false,
                        initialLoadSize = 10
                    ),
                ) {
                    PostPagingSource(appDao)
                }.flow
                )
    }

    override suspend fun updatePostRepositories(post: ItemPostRepositoryModel) {
        appDao.updatePostRepositories(post)
    }
}

