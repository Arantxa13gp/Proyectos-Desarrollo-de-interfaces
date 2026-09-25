package org.example.project

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import org.example.project.viewModels.UserHetalthVM
import org.example.project.views.UserHealthScreen

@Composable
fun App() {
    MaterialTheme {
        val viewModel: UserHetalthVM = viewModel { UserHetalthVM() }
        UserHealthScreen(viewModel = viewModel)
    }
}