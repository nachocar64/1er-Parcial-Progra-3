package com.example.libreria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.libreria.ui.navigation.AppNavigation
import com.example.libreria.ui.theme.LibreriaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LibreriaTheme {
                AppNavigation()
            }
        }
    }
}
