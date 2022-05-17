package com.inbyte.inbook.data.remote

import java.io.IOException

class NoConnectivityException : IOException() {
    override val message: String get() = "No Internet Connection"
}
