package com.social.test.presentation.post_detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0014J\b\u0010\'\u001a\u00020%H\u0002J\b\u0010(\u001a\u00020%H\u0002J\b\u0010)\u001a\u00020%H\u0002J\u0010\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020\u0011H\u0002J\b\u0010,\u001a\u00020%H\u0002J\b\u0010-\u001a\u00020%H\u0014J\b\u0010.\u001a\u00020%H\u0002J.\u0010/\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u001400H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!\u00a8\u00061"}, d2 = {"Lcom/social/test/presentation/post_detail/FragmentPostDetail;", "Lcom/social/test/base/ObserverDataBindingFragment;", "Lcom/social/test/databinding/FragmentPostDetailBinding;", "()V", "args", "Lcom/social/test/presentation/post_detail/FragmentPostDetailArgs;", "getArgs", "()Lcom/social/test/presentation/post_detail/FragmentPostDetailArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "commentAdapter", "Lcom/social/test/presentation/post_detail/CommentAdapter;", "getCommentAdapter", "()Lcom/social/test/presentation/post_detail/CommentAdapter;", "setCommentAdapter", "(Lcom/social/test/presentation/post_detail/CommentAdapter;)V", "commentCount", "", "comments", "Ljava/util/ArrayList;", "", "imageLoadingService", "Lcom/social/test/common/imageloading/ImageLoadingService;", "getImageLoadingService", "()Lcom/social/test/common/imageloading/ImageLoadingService;", "setImageLoadingService", "(Lcom/social/test/common/imageloading/ImageLoadingService;)V", "isLike", "", "likeCount", "postViewModel", "Lcom/social/test/presentation/post/PostViewModel;", "getPostViewModel", "()Lcom/social/test/presentation/post/PostViewModel;", "postViewModel$delegate", "Lkotlin/Lazy;", "initial", "", "observe", "observeOnLikeClick", "observeOnSendClick", "setHeartBackground", "setScrollViewDown", "position", "setUpCommentRV", "setupViews", "showLoading", "updateData", "", "app_prodDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FragmentPostDetail extends com.social.test.base.ObserverDataBindingFragment<com.social.test.databinding.FragmentPostDetailBinding> {
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    @javax.inject.Inject()
    public com.social.test.common.imageloading.ImageLoadingService imageLoadingService;
    @javax.inject.Inject()
    public com.social.test.presentation.post_detail.CommentAdapter commentAdapter;
    private final kotlin.Lazy postViewModel$delegate = null;
    private boolean isLike = false;
    private final java.util.ArrayList<java.lang.String> comments = null;
    private int commentCount = 0;
    private int likeCount = 0;
    
    public FragmentPostDetail() {
        super(0);
    }
    
    private final com.social.test.presentation.post_detail.FragmentPostDetailArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.social.test.common.imageloading.ImageLoadingService getImageLoadingService() {
        return null;
    }
    
    public final void setImageLoadingService(@org.jetbrains.annotations.NotNull()
    com.social.test.common.imageloading.ImageLoadingService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.social.test.presentation.post_detail.CommentAdapter getCommentAdapter() {
        return null;
    }
    
    public final void setCommentAdapter(@org.jetbrains.annotations.NotNull()
    com.social.test.presentation.post_detail.CommentAdapter p0) {
    }
    
    private final com.social.test.presentation.post.PostViewModel getPostViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void setupViews() {
    }
    
    private final void initial() {
    }
    
    private final void setHeartBackground() {
    }
    
    private final void setUpCommentRV() {
    }
    
    @java.lang.Override()
    protected void observe() {
    }
    
    private final void observeOnLikeClick() {
    }
    
    private final void observeOnSendClick() {
    }
    
    private final void setScrollViewDown(int position) {
    }
    
    private final void showLoading() {
    }
    
    private final void updateData(boolean isLike, int likeCount, int commentCount, java.util.List<java.lang.String> comments) {
    }
}