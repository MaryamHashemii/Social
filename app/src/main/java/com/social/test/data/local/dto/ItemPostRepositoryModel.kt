package com.social.test.data.local.dto

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.social.test.data.local.dao.Converters.restoreList
import com.social.test.domain.model.ItemPost
import kotlinx.parcelize.Parcelize

@Entity(tableName = "post")
@Parcelize
data class ItemPostRepositoryModel(
    @PrimaryKey
    val id: Int,
    val likeCount: Int,
    val isLiked: Boolean,
    val commentCount: Int,
    val comments: String,
    val imageUrl: String
) : Parcelable


fun ItemPostRepositoryModel.toItemPost2(): ItemPost =
    ItemPost(
        id = id,
        likeCount = likeCount,
        isLiked = isLiked,
        commentCount = commentCount,
        comments = comments.restoreList(),
        imageUrl = imageUrl
    )


