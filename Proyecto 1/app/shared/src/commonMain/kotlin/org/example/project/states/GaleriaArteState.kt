package org.example.project.states

import org.example.project.models.GaleriaArte

data class GaleriaArteState(
    val items: List<GaleriaArte> = emptyList(),
    val selectedItem: GaleriaArte? = null
)