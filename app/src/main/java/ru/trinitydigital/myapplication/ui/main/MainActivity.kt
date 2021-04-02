package ru.trinitydigital.myapplication.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import ru.trinitydigital.myapplication.R
import ru.trinitydigital.myapplication.Sample
import ru.trinitydigital.myapplication.addFragment
import ru.trinitydigital.myapplication.replaceFragment
import ru.trinitydigital.myapplication.ui.bottom_nav.BottomNavFragment
import ru.trinitydigital.myapplication.ui.login.LoginFragment

class MainActivity : AppCompatActivity(), NavigationHandler {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openLoginScreen()

        val teams = listOf<Sample>()
        val favourite = listOf<Sample>()

        teams.forEach { team ->
            team.isFavourite = favourite.find { it.id == team.id } != null
        }
    }

    override fun openLoginScreen() {
        replaceFragment(LoginFragment(), R.id.container)
    }

    override fun openMainScreen() {
        replaceFragment(BottomNavFragment(), R.id.container)
    }
}