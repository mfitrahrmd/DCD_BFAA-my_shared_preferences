package com.mfitrahrmd.dicoding_belajar_fundamental_aplikasi_android

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserModel(
    var name: String? = null,
    var email: String? = null,
    var age: Int = 0,
    var phoneNumber: String? = null,
    var isLoveMU: Boolean = false
) : Parcelable