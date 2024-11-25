package com.example.acmethicsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.acmethicsapp.data.FrameworkRepository
import com.example.acmethicsapp.pages.FrameworkPage
import com.example.acmethicsapp.pages.Home
import com.example.acmethicsapp.ui.theme.ACMEthicsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ACMEthicsAppTheme {
                val navController = rememberNavController()
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = "home",
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable("home") { Home(navController = navController) }
                        //Dynamic Navigation
                        FrameworkRepository.frameworks.forEach { framework ->
                            composable(framework.id) {
                                FrameworkPage(
                                    title = framework.title,
                                    description = framework.description,
                                    onBackToHome = { navController.navigate("home") }
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
