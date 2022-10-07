package com.social.test.common.imageloading

import android.widget.ImageView

interface ImageLoadingService {

    fun loadImage(imageView: ImageView, url: String?)


}