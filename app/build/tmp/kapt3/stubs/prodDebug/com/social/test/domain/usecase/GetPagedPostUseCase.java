package com.social.test.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/social/test/domain/usecase/GetPagedPostUseCase;", "Lcom/social/test/domain/usecase/coroutin/FlowUseCase;", "", "Landroidx/paging/PagingData;", "Lcom/social/test/domain/model/ItemPost;", "appRepository", "Lcom/social/test/domain/repository/AppRepository;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/social/test/domain/repository/AppRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "parameters", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class GetPagedPostUseCase extends com.social.test.domain.usecase.coroutin.FlowUseCase<kotlin.Unit, androidx.paging.PagingData<com.social.test.domain.model.ItemPost>> {
    private final com.social.test.domain.repository.AppRepository appRepository = null;
    
    @javax.inject.Inject()
    public GetPagedPostUseCase(@org.jetbrains.annotations.NotNull()
    com.social.test.domain.repository.AppRepository appRepository, @org.jetbrains.annotations.NotNull()
    @com.social.test.di.coroutine.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    kotlin.Unit parameters, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.social.test.domain.model.ItemPost>>> continuation) {
        return null;
    }
}