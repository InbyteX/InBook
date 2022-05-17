package com.inbyte.inbook.view.ui

import com.inbyte.inbook.view.ui.base.BaseActivity
import com.inbyte.inbook.databinding.ActivityLandingBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LandingActivity : BaseActivity<ActivityLandingBinding>() {

    private lateinit var binding: ActivityLandingBinding

    override fun initViewBinding() {
        binding = ActivityLandingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initCtrl()
    }

    override fun observeViewModel() {}

    private fun initCtrl() {

    }
}
