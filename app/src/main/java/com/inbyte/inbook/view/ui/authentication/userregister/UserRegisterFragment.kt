package com.inbyte.inbook.view.ui.authentication.userregister

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.inbyte.inbook.databinding.FragmentUserRegisterBinding
import com.inbyte.inbook.view.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class UserRegisterFragment : BaseFragment<FragmentUserRegisterBinding>(), View.OnClickListener {

    private val viewModel:UserRegisterViewModel by viewModels()

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentUserRegisterBinding.inflate(inflater, container, false)

    override fun init() {}

    override fun initCtrl() {
        binding.btnFinish.setOnClickListener(this)
    }

    override fun observer() {}
    override fun onClick(v: View?) {}

}