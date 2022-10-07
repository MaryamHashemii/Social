package com.social.test.presentation.post

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.social.test.common.imageloading.ImageLoadingService
import com.social.test.databinding.ItemPostBinding
import com.social.test.domain.model.ItemPost
import javax.inject.Inject

class PostAdapter @Inject constructor(
    private val imageLoadingService: ImageLoadingService
) : PagingDataAdapter<ItemPost, PostAdapter.ProductViewHolder>(PostDiffCallback()) {
    var onItemClick: ((ItemPost) -> Unit)? = null

    class PostDiffCallback : DiffUtil.ItemCallback<ItemPost>() {
        override fun areItemsTheSame(oldItem: ItemPost, newItem: ItemPost): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ItemPost, newItem: ItemPost): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemPostBinding.inflate(inflater, parent, false)
        return ProductViewHolder(binding, imageLoadingService, onItemClick)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        getItem(position)?.let { holder.bind(it) }
    }

    class ProductViewHolder(
        private val binding: ItemPostBinding,
        private val imageLoadingService: ImageLoadingService,
        var onItemClick: ((ItemPost) -> Unit)?
    ) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: ItemPost) {
            Log.d("niloo",data.imageUrl)
            imageLoadingService.loadImage(binding.ivPic, data.imageUrl)
            binding.likeNumber.text = "Liked by ${data.likeCount} people"
            binding.commentNumber.text = "Count Of Comments : ${data.commentCount}"
            binding.lastComment.text = "Last Comment : ${data.comments.last()}"
            binding.ivPic.setOnClickListener {
                onItemClick?.let { callback ->
                    callback(data)

                }
            }
        }

    }
}