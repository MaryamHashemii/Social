package com.social.test.presentation.post_detail

import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import dagger.hilt.android.AndroidEntryPoint
import com.social.test.R
import com.social.test.base.ObserverDataBindingFragment
import com.social.test.common.imageloading.ImageLoadingService
import com.social.test.databinding.FragmentPostDetailBinding
import com.social.test.domain.model.ItemPost
import com.social.test.presentation.post.PostViewModel
import com.social.test.util.extensions.hide
import com.social.test.util.extensions.setBackground
import com.social.test.util.extensions.show
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class FragmentPostDetail :
    ObserverDataBindingFragment<FragmentPostDetailBinding>(R.layout.fragment_post_detail) {
    private val args: FragmentPostDetailArgs by navArgs()

    @Inject
    lateinit var imageLoadingService: ImageLoadingService

    @Inject
    lateinit var commentAdapter: CommentAdapter

    private val postViewModel: PostViewModel by viewModels()

    private var isLike = false

    private val comments = arrayListOf<String>()

    private var commentCount = 0

    private var likeCount = 0


    override fun setupViews() {
        setUpCommentRV()
        initial()
        setHeartBackground()

    }

    private fun initial() {
        imageLoadingService.loadImage(binding.imgPost, args.postInfo.imageUrl)
        comments.addAll(args.postInfo.comments)
        likeCount = args.postInfo.likeCount
        commentCount = args.postInfo.commentCount
    }

    private fun setHeartBackground() {
        when (args.postInfo.isLiked) {
            true -> binding.imgLike.setBackground(R.drawable.ic_heart_red)
            else -> binding.imgLike.setBackground(R.drawable.ic_heart_black)

        }
    }

    private fun setUpCommentRV() {
        binding.rcyComment.adapter = commentAdapter
        commentAdapter.submitList(args.postInfo.comments)
        setScrollViewDown(commentAdapter.itemCount - 1)
    }

    override fun observe() {
        observeOnLikeClick()
        observeOnSendClick()
    }

    private fun observeOnLikeClick() {
        binding.imgLike.setOnClickListener {
            isLike = true
            likeCount += 1
            binding.imgLike.setBackground(R.drawable.ic_heart_red)
            updateData(isLike, likeCount, commentCount, comments)
            showLoading()
        }
    }

    private fun observeOnSendClick() {
        binding.btnSend.setOnClickListener {
            comments.add(binding.edtComment.text.toString())
            commentCount += 1
            updateData(isLike, likeCount, commentCount, comments)
            commentAdapter.add(binding.edtComment.text.toString())
            setScrollViewDown(commentAdapter.itemCount)
            binding.edtComment.setText("")
            showLoading()
        }
    }

    private fun setScrollViewDown(position: Int) {
        binding.rcyComment.smoothScrollToPosition(position)

    }

    private fun showLoading() {
        lifecycleScope.launch {
            binding.progress.show()
            delay(3500)
            binding.progress.hide()
        }
    }

    private fun updateData(
        isLike: Boolean,
        likeCount: Int,
        commentCount: Int,
        comments: List<String>
    ) {
        postViewModel.updatePost(
            args.postInfo.let {
                ItemPost(
                    id = it.id,
                    likeCount = likeCount,
                    isLiked = isLike,
                    commentCount = commentCount,
                    comments = comments,
                    imageUrl = it.imageUrl
                )
            }

        )
    }

}