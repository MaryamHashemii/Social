package com.social.test.presentation

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.social.test.data.local.dao.AppDao
import com.social.test.domain.model.ItemPost
import com.social.test.domain.model.toItemPost
import kotlinx.coroutines.delay


class PostPagingSource(
    private val dao: AppDao
) : PagingSource<Int, ItemPost>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ItemPost> {
        val page = params.key ?: 0

        return try {
            Log.d("niloo","page$page")
            val entities = dao.getPostRepositories(params.loadSize, page * params.loadSize)
            if (page != 0) delay(1000)
          return  LoadResult.Page(
                data = entities.toItemPost(),
                prevKey = if (page == 0) null else page - 1,
                nextKey = if (entities.isEmpty()) null else page + 1
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, ItemPost>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }
}