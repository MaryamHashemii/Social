package com.social.test.presentation.post;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001b"}, d2 = {"Lcom/social/test/presentation/post/PostFragment;", "Lcom/social/test/base/ObserverDataBindingFragment;", "Lcom/social/test/databinding/FragmentPostBinding;", "()V", "moreLoadAdapter", "Lcom/social/test/presentation/post/MainLoadStateAdapter;", "getMoreLoadAdapter", "()Lcom/social/test/presentation/post/MainLoadStateAdapter;", "setMoreLoadAdapter", "(Lcom/social/test/presentation/post/MainLoadStateAdapter;)V", "postAdapter", "Lcom/social/test/presentation/post/PostAdapter;", "getPostAdapter", "()Lcom/social/test/presentation/post/PostAdapter;", "setPostAdapter", "(Lcom/social/test/presentation/post/PostAdapter;)V", "postViewModel", "Lcom/social/test/presentation/post/PostViewModel;", "getPostViewModel", "()Lcom/social/test/presentation/post/PostViewModel;", "postViewModel$delegate", "Lkotlin/Lazy;", "observe", "", "observeVideoFromLocal", "setUpVideoRecyclerView", "setupViews", "app_prodDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PostFragment extends com.social.test.base.ObserverDataBindingFragment<com.social.test.databinding.FragmentPostBinding> {
    private final kotlin.Lazy postViewModel$delegate = null;
    @javax.inject.Inject()
    public com.social.test.presentation.post.PostAdapter postAdapter;
    @javax.inject.Inject()
    public com.social.test.presentation.post.MainLoadStateAdapter moreLoadAdapter;
    
    public PostFragment() {
        super(0);
    }
    
    private final com.social.test.presentation.post.PostViewModel getPostViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.social.test.presentation.post.PostAdapter getPostAdapter() {
        return null;
    }
    
    public final void setPostAdapter(@org.jetbrains.annotations.NotNull()
    com.social.test.presentation.post.PostAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.social.test.presentation.post.MainLoadStateAdapter getMoreLoadAdapter() {
        return null;
    }
    
    public final void setMoreLoadAdapter(@org.jetbrains.annotations.NotNull()
    com.social.test.presentation.post.MainLoadStateAdapter p0) {
    }
    
    @java.lang.Override()
    protected void setupViews() {
    }
    
    private final void setUpVideoRecyclerView() {
    }
    
    @java.lang.Override()
    protected void observe() {
    }
    
    private final void observeVideoFromLocal() {
    }
}