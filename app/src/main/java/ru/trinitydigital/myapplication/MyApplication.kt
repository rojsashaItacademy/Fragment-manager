package ru.trinitydigital.myapplication

import android.app.Application
import ru.trinitydigital.myapplication.data.PreferenceHelper

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        PreferenceHelper.init(this)
    }
}