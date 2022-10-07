package com.social.test.data.local.dao

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object Converters {
    @TypeConverter
    fun String.restoreList(): List<String> =
        Gson().fromJson(this, object : TypeToken<List<String>>() {}.type)


    @TypeConverter
    fun List<String>.saveList(): String = Gson().toJson(this)
}