package ru.trinitydigital.myapplication.data

import android.content.Context
import android.content.SharedPreferences

object PreferenceHelper {
    private var preferece: SharedPreferences? = null
    private val name = "MY_PREFS"

    fun init(context: Context) {
        preferece = context.getSharedPreferences(name, Context.MODE_PRIVATE)
    }
}