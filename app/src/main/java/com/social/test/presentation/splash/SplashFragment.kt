package com.social.test.presentation.splash

import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.social.test.R
import com.social.test.base.BaseDataBindingFragment
import com.social.test.databinding.FragmentSplashBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SplashFragment:BaseDataBindingFragment<FragmentSplashBinding>(R.layout.fragment_splash) {
    override fun setupViews() {
        lifecycleScope.launch {
            delay(2000L)
            findNavController().navigate(R.id.action_splashFragment_to_productFragment)
        }

    }
}