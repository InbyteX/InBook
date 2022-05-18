package com.inbyte.inbook.data.remote.repository_impl


import com.inbyte.inbook.data.model.ApiResult
import com.inbyte.inbook.data.model.auth.LoginModel
import com.inbyte.inbook.data.remote.api.ApiService
import com.inbyte.inbook.data.remote.repository.LoginRepository
import com.inbyte.inbook.utils.response.RetrofitUtlis
import javax.inject.Inject

class LoginRepositoryImpl @Inject constructor(private val apiService: ApiService) :
    LoginRepository {
    override suspend fun loginApi(input: LoginModel): ApiResult<String> {

        return RetrofitUtlis.getResponse({
            apiService.getLogin(input)
        }, "SomeThing went wrong")
    }

}