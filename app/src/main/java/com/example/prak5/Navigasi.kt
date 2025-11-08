package com.example.prak5

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.prak5.view.FormInput
import com.example.prak5.view.Home
import com.example.prak5.view.ListPeserta

enum class Navigasi {
    Home,
    Daftar,
    Formulir
}

@OptIn (ExperimentalMaterial3Api::class)
@Composable

fun DataApp(
    navController: NavHostController = rememberNavController()
) {
    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Home.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = Navigasi.Home.name) {
                Home(
                    OnMasukBtnClick = {
                        navController.navigate(Navigasi.Daftar.name)
                    }
                )
            }

            composable(route = Navigasi.Daftar.name) {
                ListPeserta(
                    OnFormulirClick = {
                        navController.navigate(Navigasi.Formulir.name)
                    },
                    OnBerandaClick = {
                        cancelAndBackToHome(navController)
                    }
                )
            }

            composable(route = Navigasi.Formulir.name) {
                FormInput(
                    OnBackClick = {
                        navController.popBackStack(route = Navigasi.Daftar.name, inclusive = false)
                    },
                    OnSubmitClick = {
                        navController.popBackStack(route = Navigasi.Daftar.name, inclusive = false)
                    }
                )
            }
        }
    }
}

private fun cancelAndBackToHome(
    navController: NavHostController
) {
    navController.popBackStack(route = Navigasi.Home.name, inclusive = false)
}