package com.inbyte.inbook.view.ui

import android.os.Bundle
import androidx.activity.viewModels
import com.inbyte.inbook.R
import com.inbyte.inbook.view.ui.base.BaseActivity
import com.inbyte.inbook.databinding.ActivityLandingBinding
import com.inbyte.inbook.databinding.DialogLoaderBinding
import dagger.hilt.android.AndroidEntryPoint
import java.util.*

@AndroidEntryPoint
class LandingActivity() : BaseActivity<ActivityLandingBinding,LandingViewModel>() {

    override val viewModel: LandingViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)
    }

    override fun observeViewModel() {}

    override fun initViewBinding() {
        viewModel.screenTitle.value ="login page" // todo: need to get from string resource

    }


}
