package com.social.test.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/social/test/data/AppRepositoryImp;", "Lcom/social/test/domain/repository/AppRepository;", "appDao", "Lcom/social/test/data/local/dao/AppDao;", "sharedPref", "Lcom/social/test/data/sharedPref/DataSharedPref;", "(Lcom/social/test/data/local/dao/AppDao;Lcom/social/test/data/sharedPref/DataSharedPref;)V", "getPagedPost", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/social/test/domain/model/ItemPost;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveToLocalDB", "", "updatePostRepositories", "post", "Lcom/social/test/data/local/dto/ItemPostRepositoryModel;", "(Lcom/social/test/data/local/dto/ItemPostRepositoryModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class AppRepositoryImp implements com.social.test.domain.repository.AppRepository {
    private final com.social.test.data.local.dao.AppDao appDao = null;
    private final com.social.test.data.sharedPref.DataSharedPref sharedPref = null;
    
    @javax.inject.Inject()
    public AppRepositoryImp(@org.jetbrains.annotations.NotNull()
    com.social.test.data.local.dao.AppDao appDao, @org.jetbrains.annotations.NotNull()
    com.social.test.data.sharedPref.DataSharedPref sharedPref) {
        super();
    }
    
    private final java.lang.Object saveToLocalDB(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPagedPost(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.social.test.domain.model.ItemPost>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updatePostRepositories(@org.jetbrains.annotations.NotNull()
    com.social.test.data.local.dto.ItemPostRepositoryModel post, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}