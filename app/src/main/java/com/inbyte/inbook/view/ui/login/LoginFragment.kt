package com.inbyte.inbook.view.ui.login

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.inbyte.inbook.R
import com.inbyte.inbook.databinding.FragmentLoginBinding
import com.inbyte.inbook.view.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : BaseFragment<FragmentLoginBinding>(), View.OnClickListener {

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentLoginBinding.inflate(inflater, container, false)

    override fun observer() {}

    override fun init() {}

    override fun initCtrl() {
        binding.loginBtn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.loginBtn -> {

            }
        }
    }


}