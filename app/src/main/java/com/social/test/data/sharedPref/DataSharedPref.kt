package com.social.test.data.sharedPref

import android.content.Context
import androidx.core.content.edit
import com.social.test.data.sharedPref.DataSharedPref.UserSharedPrefKeys.IS_TABLE_EMPTY
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class DataSharedPref @Inject constructor(@ApplicationContext context: Context) {

    object UserSharedPrefKeys {
        const val IS_TABLE_EMPTY = "is_table_empty"
    }

    private val sharedPref = context.getSharedPreferences("DATA", Context.MODE_PRIVATE)
    private val editor = sharedPref.edit()

    var isTableEmpty: Boolean = true
        set(value) {
            sharedPref.edit {
                putBoolean(IS_TABLE_EMPTY, value)
            }
            field = value
        }
        get() = sharedPref.getBoolean(IS_TABLE_EMPTY, true)


}