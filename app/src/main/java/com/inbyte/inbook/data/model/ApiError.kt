package com.inbyte.inbook.data.model

data class ApiError(
    val status_code: Int = 0,
    val status_message: String? = null
)