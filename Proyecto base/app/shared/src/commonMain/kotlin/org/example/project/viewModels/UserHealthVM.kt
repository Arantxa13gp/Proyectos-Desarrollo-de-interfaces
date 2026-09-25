package org.example.project.viewModels

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import org.example.project.models.UserHealth
import org.example.project.states.UserHealthState


class UserHetalthVM : ViewModel() {
    private val _uiState = MutableStateFlow(UserHealthState())
    val uiState: StateFlow<UserHealthState> = _uiState.asStateFlow()

    fun objetivo() : Boolean{
        val userHealth = _uiState.value.userHealth
        return userHealth !== null && userHealth.nPasos >= 10000
    }

    fun sumarPasos(pasos : Int) {
        val healthActual = _uiState.value.userHealth
        val nuevaSalud = healthActual?.copy(nPasos = healthActual.nPasos + pasos)

        _uiState.update { it.copy(userHealth = nuevaSalud) }
    }
}