package com.social.test.base

import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding

abstract class ObserverDataBindingFragment<T : ViewDataBinding>(@LayoutRes layoutRes: Int) :
    BaseDataBindingFragment<T>(layoutRes) {

    override fun onStart() {
        super.onStart()
        observe()
    }

    protected abstract fun observe()

}