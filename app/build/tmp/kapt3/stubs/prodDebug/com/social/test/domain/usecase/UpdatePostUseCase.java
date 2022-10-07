package com.social.test.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/social/test/domain/usecase/UpdatePostUseCase;", "Lcom/social/test/domain/usecase/coroutin/FlowUseCase;", "Lcom/social/test/domain/model/ItemPost;", "", "appRepository", "Lcom/social/test/domain/repository/AppRepository;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/social/test/domain/repository/AppRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "parameters", "(Lcom/social/test/domain/model/ItemPost;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class UpdatePostUseCase extends com.social.test.domain.usecase.coroutin.FlowUseCase<com.social.test.domain.model.ItemPost, kotlin.Unit> {
    private final com.social.test.domain.repository.AppRepository appRepository = null;
    
    @javax.inject.Inject()
    public UpdatePostUseCase(@org.jetbrains.annotations.NotNull()
    com.social.test.domain.repository.AppRepository appRepository, @org.jetbrains.annotations.NotNull()
    @com.social.test.di.coroutine.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    com.social.test.domain.model.ItemPost parameters, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<kotlin.Unit>> continuation) {
        return null;
    }
}