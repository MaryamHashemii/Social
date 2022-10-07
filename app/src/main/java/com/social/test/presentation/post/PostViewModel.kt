package com.social.test.presentation.post

import androidx.lifecycle.*
import androidx.paging.*
import com.social.test.domain.model.ItemPost
import com.social.test.domain.usecase.GetPagedPostUseCase
import com.social.test.domain.usecase.UpdatePostUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlinx.coroutines.flow.*

@HiltViewModel
class PostViewModel @Inject constructor(
    private val updatePostUseCase: UpdatePostUseCase,
    private val getPagedPostUseCase: GetPagedPostUseCase,
) : ViewModel() {

    fun updatePost(itemPost: ItemPost) {
        viewModelScope.launch {
            updatePostUseCase(itemPost)
        }
    }

    val posts= liveData {
        getPagedPostUseCase(Unit).cachedIn(viewModelScope).collectLatest {
           emit(it)
        }
    }

}