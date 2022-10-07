package com.social.test.presentation.post_detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.social.test.databinding.ItemCommentBinding
import javax.inject.Inject

class CommentAdapter @Inject constructor() :
    RecyclerView.Adapter<CommentAdapter.ProductViewHolder>() {

    private val diffCallback = object : DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean =
            oldItem == newItem

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean =
            oldItem == newItem
    }

    private val differ = AsyncListDiffer<String>(this, diffCallback)
    private val comments= arrayListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemCommentBinding.inflate(inflater, parent, false)
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(differ.currentList[position])
    }

    override fun getItemCount() = differ.currentList.size

    fun submitList(data: List<String>) {
        comments.addAll(data)
        differ.submitList(data)
    }

    fun add(item: String) {
        comments.add(item)
        differ.submitList(comments)
        notifyItemInserted(comments.size-1)
    }

    class ProductViewHolder(
        private val binding: ItemCommentBinding
    ) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: String) {
            binding.txtComment.text = data

        }
    }

}