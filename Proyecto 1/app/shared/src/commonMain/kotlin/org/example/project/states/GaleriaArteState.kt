package org.example.project.states


data class GaleriaArteState(
    val items: List<GaleriaArte> = emptyList(),
    val selectedItem: GaleriaArte? = null
)

