package com.example.libreria.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.libreria.ui.screens.AutoresScreen
import com.example.libreria.ui.screens.LibrosScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route ?: "libros"

    val title = when (currentRoute) {
        "autores" -> "Librería - Autores Registrados"
        else -> "Librería - Catálogo de Libros"
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = title) }
            )
        },
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = currentRoute == "libros",
                    onClick = {
                        if (currentRoute != "libros") {
                            navController.navigate("libros") {
                                popUpTo(navController.graph.startDestinationId) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    },
                    icon = { Icon(imageVector = Icons.Default.Home, contentDescription = "Libros") },
                    label = { Text("Libros") }
                )
                NavigationBarItem(
                    selected = currentRoute == "autores",
                    onClick = {
                        if (currentRoute != "autores") {
                            navController.navigate("autores") {
                                popUpTo(navController.graph.startDestinationId) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    },
                    icon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Autores") },
                    label = { Text("Autores") }
                )
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "libros",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("libros") {
                LibrosScreen()
            }
            composable("autores") {
                AutoresScreen()
            }
        }
    }
}
