package com.inbyte.inbook.view.ui.authentication.register

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.inbyte.inbook.R
import com.inbyte.inbook.databinding.FragmentRegisterBinding
import com.inbyte.inbook.view.ui.base.BaseFragment


class RegisterFragment : BaseFragment<FragmentRegisterBinding>(), View.OnClickListener {

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentRegisterBinding.inflate(inflater, container, false)


    override fun init() {}

    override fun initCtrl() {
        binding.nextBtn.setOnClickListener(this)
    }

    override fun observer() {}

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.nextBtn.id -> {
                findNavController().navigate(R.id.action_registerFragment_to_userRegisterFragment)
            }
        }
    }

}