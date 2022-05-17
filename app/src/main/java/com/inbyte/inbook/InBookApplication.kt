package com.inbyte.inbook

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import java.util.*

@HiltAndroidApp
class InBookApplication : Application() {

    companion object {
        lateinit var INSTANCE: InBookApplication
    }

    override fun onCreate() {
        INSTANCE = this@InBookApplication
        super.onCreate()
    }


}