package com.inbyte.inbook.data.remote.repository


import com.inbyte.inbook.data.model.ApiResult
import com.inbyte.inbook.data.model.auth.LoginModel

interface LoginRepository {
    //need to pass input data
    suspend fun loginApi(input:LoginModel): ApiResult<String>
}