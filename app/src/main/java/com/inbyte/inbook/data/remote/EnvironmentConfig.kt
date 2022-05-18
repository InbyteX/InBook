package com.inbyte.inbook.data.remote

import com.inbyte.inbook.BuildConfig

object EnvironmentConfig {

    enum class Environment {
        DEV,
        QA,
        PROD
    }

    private var environment = Environment.PROD

      init {
         if (BuildConfig.DEBUG) {
             environment = Environment.DEV
         }
     }

    fun getInBookURl(): String =
        when (environment) {
            Environment.QA -> ""
            Environment.DEV -> "http://localhost:8080/api/"
            Environment.PROD -> ""
        }



}