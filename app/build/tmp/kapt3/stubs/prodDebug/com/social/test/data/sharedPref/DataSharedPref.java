package com.social.test.data.sharedPref;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/social/test/data/sharedPref/DataSharedPref;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "editor", "Landroid/content/SharedPreferences$Editor;", "kotlin.jvm.PlatformType", "value", "", "isTableEmpty", "()Z", "setTableEmpty", "(Z)V", "sharedPref", "Landroid/content/SharedPreferences;", "UserSharedPrefKeys", "app_prodDebug"})
public final class DataSharedPref {
    private final android.content.SharedPreferences sharedPref = null;
    private final android.content.SharedPreferences.Editor editor = null;
    private boolean isTableEmpty = true;
    
    @javax.inject.Inject()
    public DataSharedPref(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    public final void setTableEmpty(boolean value) {
    }
    
    public final boolean isTableEmpty() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/social/test/data/sharedPref/DataSharedPref$UserSharedPrefKeys;", "", "()V", "IS_TABLE_EMPTY", "", "app_prodDebug"})
    public static final class UserSharedPrefKeys {
        @org.jetbrains.annotations.NotNull()
        public static final com.social.test.data.sharedPref.DataSharedPref.UserSharedPrefKeys INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IS_TABLE_EMPTY = "is_table_empty";
        
        private UserSharedPrefKeys() {
            super();
        }
    }
}