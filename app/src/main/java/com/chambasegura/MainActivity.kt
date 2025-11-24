package com.chambasegura

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.chambasegura.ui.auth.LoginScreen
import com.chambasegura.ui.home.HomeScreen
import com.chambasegura.ui.service.ServiceRequestScreen
import com.chambasegura.ui.theme.ChambaSeguraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChambaSeguraTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ChambaSeguraApp()
                }
            }
        }
    }
}

@Composable
fun ChambaSeguraApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginScreen(onLoginSuccess = {
                navController.navigate("home") {
                    popUpTo("login") { inclusive = true }
                }
            })
        }
        composable("home") {
            HomeScreen(onServiceClick = { serviceName ->
                navController.navigate("service_request/$serviceName")
            })
        }
        composable("service_request/{serviceName}") { backStackEntry ->
            val serviceName = backStackEntry.arguments?.getString("serviceName") ?: "Servicio"
            ServiceRequestScreen(
                serviceName = serviceName,
                onBack = { navController.popBackStack() }
            )
        }
    }
}
