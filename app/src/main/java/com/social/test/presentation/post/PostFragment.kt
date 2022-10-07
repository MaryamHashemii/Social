package com.social.test.presentation.post

import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import com.social.test.base.ObserverDataBindingFragment
import javax.inject.Inject
import com.social.test.R
import com.social.test.databinding.FragmentPostBinding
import kotlinx.coroutines.launch

@AndroidEntryPoint
class PostFragment :
    ObserverDataBindingFragment<FragmentPostBinding>(R.layout.fragment_post) {
    private val postViewModel: PostViewModel by viewModels()

    @Inject
    lateinit var postAdapter: PostAdapter

    @Inject
    lateinit var moreLoadAdapter: MainLoadStateAdapter

    override fun setupViews() {
        setUpVideoRecyclerView()
    }

    private fun setUpVideoRecyclerView() {
        binding.rvPosts.adapter = postAdapter.withLoadStateFooter(
            moreLoadAdapter
        )
        postAdapter.onItemClick = {
            findNavController().navigate(
                PostFragmentDirections.actionVideoFragmentToVideoDetailFragment(
                    it
                )
            )
        }
    }


    override fun observe() {
        observeVideoFromLocal()

    }

    private fun observeVideoFromLocal() {
        postViewModel.posts.observe(this) { result ->
            lifecycleScope.launch {
                postAdapter.submitData(result)
            }

        }

    }




}