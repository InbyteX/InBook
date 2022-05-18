package com.inbyte.inbook.view.ui

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.inbyte.inbook.data.model.ApiResult
import com.inbyte.inbook.data.model.auth.LoginModel
import com.inbyte.inbook.data.remote.repository.LoginRepository
import com.inbyte.inbook.view.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject


@HiltViewModel
class LandingViewModel @Inject constructor(
    val app: Application
) : BaseViewModel(app) {





}