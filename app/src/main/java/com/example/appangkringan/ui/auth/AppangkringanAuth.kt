package com.example.appangkringan.ui.auth

import android.content.Context
import com.example.appangkringan.data.model.ActionState
import com.example.appangkringan.data.repository.AuthRepository
import kotlinx.coroutines.*

object AppangkringanAuth {
    fun logout(context: Context, callback: ((ActionState<Boolean>)-> Unit)? = null){
        val repo = AuthRepository(context)
        CoroutineScope(Dispatchers.IO).launch {
            val resp = repo.logout()
            withContext(Dispatchers.Main) {
                if (callback != null) callback.invoke(resp)
            }
        }
    }
}