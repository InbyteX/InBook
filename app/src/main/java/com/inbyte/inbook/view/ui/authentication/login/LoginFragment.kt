package com.inbyte.inbook.view.ui.authentication.login

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.inbyte.inbook.R
import com.inbyte.inbook.databinding.FragmentLoginBinding
import com.inbyte.inbook.view.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : BaseFragment<FragmentLoginBinding>(), View.OnClickListener {

    val viewModel : LoginViewModel by viewModels()

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
            binding.loginBtn.id->{
                val validEmail = viewModel.checkEmail(binding.emailTextFiled.editText?.text.toString())
                val validPassword = viewModel.checkPassword(binding.passwordTextFiled.editText?.text.toString())
                if(validPassword && validEmail){
                    showBasicAlert("Login successful ")
                }
                else{
                    showBasicAlert("invalid Password or Email")

                }
            }
        }
    }


}