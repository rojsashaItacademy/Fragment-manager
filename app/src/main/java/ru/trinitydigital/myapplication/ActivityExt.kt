package ru.trinitydigital.myapplication

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

fun AppCompatActivity.addFragment(fragment: Fragment, containerId: Int, stackTag: String? = null) {
    supportFragmentManager.inTransaction(stackTag) {
        add(containerId, fragment)
    }
}

fun AppCompatActivity.replaceFragment(
    fragment: Fragment,
    containerId: Int,
    stackTag: String? = null
) {
    supportFragmentManager.inTransaction(stackTag) {
        replace(containerId, fragment)
    }
}

fun FragmentManager.inTransaction(stackTag: String? = null, func: FragmentTransaction.() -> Unit) {
    val transaction = beginTransaction()
    transaction.func()
    stackTag?.let { transaction.addToBackStack(stackTag) }
    transaction.commit()
}