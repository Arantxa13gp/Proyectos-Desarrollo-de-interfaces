package org.example.project.views

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import org.example.project.models.UserHealth
import org.example.project.viewModels.UserHetalthVM


@Composable
fun UserHealthScreen(viewModel: UserHetalthVM) {
    val (userHealth)  = viewModel.uiState.collectAsState().value

    Column(
    ){
        Text(text = "Altura: ${userHealth?.altura}")
        Text(text = "Peso: ${userHealth?.peso}")
        Text(text = "Pasos: ${userHealth?.nPasos}")
        Text(text = "IMC: ${userHealth?.imc()}")

        if(viewModel.objetivo()) {
            Text(text = "Objetivo conseguido")
        } else {
            Text(text = "sigue andando")
            Button(onClick = { viewModel.sumarPasos(1000) }) {
                Text("Sumar pasos")
            }
        }
    }
}

