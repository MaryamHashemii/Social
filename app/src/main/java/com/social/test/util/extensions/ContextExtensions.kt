package com.social.test.util.extensions

import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat

fun Context.toast(message: String) = Toast.makeText(this, message, Toast.LENGTH_LONG).show()

fun View.show() {
    visibility = View.VISIBLE
}

fun View.hide() {
    visibility = View.GONE
}


fun View.setBackground(item: Int) {
    this.background = ContextCompat.getDrawable(context, item)
}