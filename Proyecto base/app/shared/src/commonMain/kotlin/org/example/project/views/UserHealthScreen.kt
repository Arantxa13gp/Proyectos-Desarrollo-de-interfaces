package org.example.project.views

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState

import org.example.project.viewModels.UserHetalthVM


@Composable
fun UserHealthScreen(viewModel: UserHetalthVM) {
    val (userHealth) = viewModel.uiState.collectAsState().value

    Column {
        Text(text = "Altura: ${userHealth?.altura}")
        Text(text = "Peso: ${userHealth?.peso}")
        Text(text = "Pasos: ${userHealth?.nPasos}")
        Text(text = "IMC: ${userHealth?.imc()}")

        if (viewModel.objetivo()) {
            Text(text = "Objetivo conseguido")
        } else {
            Text(text = "Sigue andando")
            Button(onClick = { viewModel.sumarPasos(1000) }) {
                Text("Sumar pasos")
            }
        }
    }
}