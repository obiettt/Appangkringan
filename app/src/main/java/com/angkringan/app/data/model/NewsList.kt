package com.angkringan.app.data.model

import android.speech.RecognizerResultsIntent

data class NewsList(
    val data: List<News> = arrayListOf(),
    val jumlah: Int =0,
    val status: Int =0
)
