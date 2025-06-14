package com.necdetzr.loodoscrypto.presentation.ui.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.necdetzr.loodoscrypto.data.local.FirebaseAuthManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class AuthViewModel @Inject constructor(
    private val authManager:FirebaseAuthManager
) : ViewModel() {
    private val _registerState = MutableStateFlow<Result<Unit>?>(null)
    val registerState: StateFlow<Result<Unit>?> = _registerState
    private val _loginState = MutableStateFlow<Result<Unit>?>(null)
    val loginState: StateFlow<Result<Unit>?> = _loginState


    fun register(name: String, surname: String, email: String, password: String) {
        viewModelScope.launch {
            _registerState.value = authManager.register(name, surname, email, password)

        }
    }

    fun login(email: String, password: String) {
        viewModelScope.launch {
            _loginState.value = authManager.login(email, password)
        }
    }
}