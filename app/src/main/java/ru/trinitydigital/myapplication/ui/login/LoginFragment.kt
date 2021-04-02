package ru.trinitydigital.myapplication.ui.login

import android.os.Bundle
import ru.trinitydigital.myapplication.R
import ru.trinitydigital.myapplication.common.BaseFragment
import ru.trinitydigital.myapplication.databinding.FragmentLoginBinding
import ru.trinitydigital.myapplication.ui.main.NavigationHandler

class LoginFragment : BaseFragment<FragmentLoginBinding>() {

    override val resID = R.layout.fragment_login

    override fun onViewCreated(binding: FragmentLoginBinding, savedInstanceState: Bundle?) {
        setupListeners(binding)
    }

    private fun setupListeners(binding: FragmentLoginBinding) {
        binding.btnLogin.setOnClickListener {
            if (!binding.etLogin.text.isNullOrEmpty() && !binding.etPassword.text.isNullOrEmpty()) {
                openMainFragment()
            }
        }
    }

    private fun openMainFragment() {
        (activity as NavigationHandler).openMainScreen()
    }


}