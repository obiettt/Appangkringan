package com.example.appangkringan.data.repository

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.example.appangkringan.data.local.AuthPref
import com.example.appangkringan.data.model.ActionState
import com.example.appangkringan.data.model.AuthUser

class AuthRepository(val context: Context) {
    private val authPref: AuthPref by lazy { AuthPref(context) }

    val authUser = MutableLiveData<AuthUser>(authPref.authUser)
    val isLogin = MutableLiveData<Boolean>(authPref.isLogin)

    suspend fun login(email: String, password: String) : ActionState<AuthUser>{
        return authPref.login(email, password)
    }

    suspend fun register(user: AuthUser) : ActionState<AuthUser>{
        return authPref.register(user)
    }
    suspend fun logout() : ActionState<Boolean>{
        return authPref.logout()
    }
}