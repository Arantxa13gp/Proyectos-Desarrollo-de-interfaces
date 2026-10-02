package org.example.project.viewModels

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import org.example.project.states.GaleriaArteState

class GaleriaArteVM : ViewModel() {
    private val _uiState = MutableStateFlow GaleriaArteState
    val uiState: StateFlow<GaleriaArteState> = _uiState

}