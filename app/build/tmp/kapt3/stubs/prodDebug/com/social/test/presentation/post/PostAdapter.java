package com.social.test.presentation.post;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0016\u0017B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/social/test/presentation/post/PostAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/social/test/domain/model/ItemPost;", "Lcom/social/test/presentation/post/PostAdapter$ProductViewHolder;", "imageLoadingService", "Lcom/social/test/common/imageloading/ImageLoadingService;", "(Lcom/social/test/common/imageloading/ImageLoadingService;)V", "onItemClick", "Lkotlin/Function1;", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "PostDiffCallback", "ProductViewHolder", "app_prodDebug"})
public final class PostAdapter extends androidx.paging.PagingDataAdapter<com.social.test.domain.model.ItemPost, com.social.test.presentation.post.PostAdapter.ProductViewHolder> {
    private final com.social.test.common.imageloading.ImageLoadingService imageLoadingService = null;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.social.test.domain.model.ItemPost, kotlin.Unit> onItemClick;
    
    @javax.inject.Inject()
    public PostAdapter(@org.jetbrains.annotations.NotNull()
    com.social.test.common.imageloading.ImageLoadingService imageLoadingService) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.social.test.domain.model.ItemPost, kotlin.Unit> getOnItemClick() {
        return null;
    }
    
    public final void setOnItemClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.social.test.domain.model.ItemPost, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.social.test.presentation.post.PostAdapter.ProductViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.social.test.presentation.post.PostAdapter.ProductViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/social/test/presentation/post/PostAdapter$PostDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/social/test/domain/model/ItemPost;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_prodDebug"})
    public static final class PostDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.social.test.domain.model.ItemPost> {
        
        public PostDiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.social.test.domain.model.ItemPost oldItem, @org.jetbrains.annotations.NotNull()
        com.social.test.domain.model.ItemPost newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.social.test.domain.model.ItemPost oldItem, @org.jetbrains.annotations.NotNull()
        com.social.test.domain.model.ItemPost newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/social/test/presentation/post/PostAdapter$ProductViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/social/test/databinding/ItemPostBinding;", "imageLoadingService", "Lcom/social/test/common/imageloading/ImageLoadingService;", "onItemClick", "Lkotlin/Function1;", "Lcom/social/test/domain/model/ItemPost;", "", "(Lcom/social/test/databinding/ItemPostBinding;Lcom/social/test/common/imageloading/ImageLoadingService;Lkotlin/jvm/functions/Function1;)V", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "bind", "data", "app_prodDebug"})
    public static final class ProductViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.social.test.databinding.ItemPostBinding binding = null;
        private final com.social.test.common.imageloading.ImageLoadingService imageLoadingService = null;
        @org.jetbrains.annotations.Nullable()
        private kotlin.jvm.functions.Function1<? super com.social.test.domain.model.ItemPost, kotlin.Unit> onItemClick;
        
        public ProductViewHolder(@org.jetbrains.annotations.NotNull()
        com.social.test.databinding.ItemPostBinding binding, @org.jetbrains.annotations.NotNull()
        com.social.test.common.imageloading.ImageLoadingService imageLoadingService, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super com.social.test.domain.model.ItemPost, kotlin.Unit> onItemClick) {
            super(null);
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function1<com.social.test.domain.model.ItemPost, kotlin.Unit> getOnItemClick() {
            return null;
        }
        
        public final void setOnItemClick(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super com.social.test.domain.model.ItemPost, kotlin.Unit> p0) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.social.test.domain.model.ItemPost data) {
        }
    }
}