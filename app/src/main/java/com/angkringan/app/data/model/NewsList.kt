package com.angkringan.app.data.model

import android.speech.RecognizerResultsIntent

data class NewsList(
    val status: Int =0,
    val totalResults: Int =0,
    val articles: List<News> = arrayListOf()
)
