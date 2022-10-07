package com.social.test.data.local.dao

import androidx.paging.PagingData
import androidx.room.*
import com.social.test.data.local.dto.ItemPostRepositoryModel
import kotlinx.coroutines.flow.Flow

@Dao
interface AppDao {

    @Query("SELECT * FROM post ORDER BY id ASC LIMIT :limit OFFSET :offset")
    suspend fun getPostRepositories(limit: Int, offset: Int): List<ItemPostRepositoryModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun savePostRepositories(postList: List<ItemPostRepositoryModel>)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updatePostRepositories(post: ItemPostRepositoryModel)


}