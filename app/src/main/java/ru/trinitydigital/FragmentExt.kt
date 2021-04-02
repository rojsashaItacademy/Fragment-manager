package ru.trinitydigital

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun Fragment.addFragment(fragment: Fragment, containerId: Int, stackTag: String? = null) {
    val manager = childFragmentManager.beginTransaction()
    manager.replace(containerId, fragment)
    stackTag?.let { manager.addToBackStack(stackTag) }
    manager.commit()
}

fun Fragment.replaceFragment(
    fragment: Fragment,
    containerId: Int,
    stackTag: String? = null
) {
    val manager = childFragmentManager.beginTransaction()
    manager.replace(containerId, fragment)
    stackTag?.let { manager.addToBackStack(stackTag) }
    manager.commit()
}