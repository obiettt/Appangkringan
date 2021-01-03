package com.angkringan.app.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class News (
    val link: String = "",
    val judul: String = "",
    val waktu: String = "",
    val tipe: String = "",
    val kutipan: String = "",
    val poster: String = ""
        ) : Parcelable
