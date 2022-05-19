package com.inbyte.inbook.data.model.auth.request

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class CompanyModel(
    val companyName: String = "",
    val companyType: String = ""
) : Parcelable