package com.inbyte.inbook.data.remote.api

import com.inbyte.inbook.data.model.auth.LoginModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiService {

    @POST("login")
    suspend fun getLogin(
        @Header("company") companyName:String,
        @Body input:LoginModel
    ):Response<String>

}