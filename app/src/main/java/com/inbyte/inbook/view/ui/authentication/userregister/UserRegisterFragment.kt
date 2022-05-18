package com.inbyte.inbook.view.ui.authentication.userregister

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.inbyte.inbook.databinding.FragmentUserRegisterBinding
import com.inbyte.inbook.view.ui.base.BaseFragment


class UserRegisterFragment : BaseFragment<FragmentUserRegisterBinding>(), View.OnClickListener {
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