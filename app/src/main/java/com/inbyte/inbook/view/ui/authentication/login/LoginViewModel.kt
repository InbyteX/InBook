package com.inbyte.inbook.view.ui.authentication.login

import android.app.Application
import com.inbyte.inbook.utils.common.Utils
import com.inbyte.inbook.view.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    app:Application
):BaseViewModel(app) {


    fun checkEmail(email:String):Boolean{
       return Utils.isEmailValid(email)
    }

    fun checkPassword(password:String):Boolean{
        return Utils.isPasswordValid(password)
    }

}