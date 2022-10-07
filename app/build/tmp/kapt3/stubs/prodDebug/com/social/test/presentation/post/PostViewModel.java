package com.social.test.presentation.post;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/social/test/presentation/post/PostViewModel;", "Landroidx/lifecycle/ViewModel;", "updatePostUseCase", "Lcom/social/test/domain/usecase/UpdatePostUseCase;", "getPagedPostUseCase", "Lcom/social/test/domain/usecase/GetPagedPostUseCase;", "(Lcom/social/test/domain/usecase/UpdatePostUseCase;Lcom/social/test/domain/usecase/GetPagedPostUseCase;)V", "posts", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Lcom/social/test/domain/model/ItemPost;", "getPosts", "()Landroidx/lifecycle/LiveData;", "updatePost", "", "itemPost", "app_prodDebug"})
public final class PostViewModel extends androidx.lifecycle.ViewModel {
    private final com.social.test.domain.usecase.UpdatePostUseCase updatePostUseCase = null;
    private final com.social.test.domain.usecase.GetPagedPostUseCase getPagedPostUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.social.test.domain.model.ItemPost>> posts = null;
    
    @javax.inject.Inject()
    public PostViewModel(@org.jetbrains.annotations.NotNull()
    com.social.test.domain.usecase.UpdatePostUseCase updatePostUseCase, @org.jetbrains.annotations.NotNull()
    com.social.test.domain.usecase.GetPagedPostUseCase getPagedPostUseCase) {
        super();
    }
    
    public final void updatePost(@org.jetbrains.annotations.NotNull()
    com.social.test.domain.model.ItemPost itemPost) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.social.test.domain.model.ItemPost>> getPosts() {
        return null;
    }
}