package com.social.test.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0003J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/social/test/util/NetworkConnectivity;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isInternetOn", "", "postAndroidMInternetCheck", "connectivityManager", "Landroid/net/ConnectivityManager;", "preAndroidMInternetCheck", "app_prodDebug"})
public final class NetworkConnectivity {
    private final android.content.Context context = null;
    
    @javax.inject.Inject()
    public NetworkConnectivity(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    public final boolean isInternetOn() {
        return false;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    private final boolean postAndroidMInternetCheck(android.net.ConnectivityManager connectivityManager) {
        return false;
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    private final boolean preAndroidMInternetCheck(android.net.ConnectivityManager connectivityManager) {
        return false;
    }
}