package com.social.test.domain.model

import android.os.Parcelable
import com.social.test.data.local.dao.Converters.restoreList
import com.social.test.data.local.dao.Converters.saveList
import com.social.test.data.local.dto.ItemPostRepositoryModel
import kotlinx.parcelize.Parcelize

@Parcelize
data class ItemPost(
    val id: Int = 0,
    val likeCount: Int = 0,
    val isLiked: Boolean = false,
    val commentCount: Int = 0,
    val comments: List<String> = arrayListOf(),
    val imageUrl: String = ""
) : Parcelable

fun ItemPost.toItemPostRepositoryModel(): ItemPostRepositoryModel =
    ItemPostRepositoryModel(
        id = id,
        likeCount = likeCount,
        isLiked = isLiked,
        commentCount = commentCount,
        comments = comments.saveList(),
        imageUrl = imageUrl
    )

fun List<ItemPostRepositoryModel>.toItemPost(): List<ItemPost> {
    return map {
        ItemPost(
            id = it.id,
            likeCount = it.likeCount,
            isLiked = it.isLiked,
            commentCount = it.commentCount,
            comments = it.comments.restoreList(),
            imageUrl = it.imageUrl
        )
    }
}

