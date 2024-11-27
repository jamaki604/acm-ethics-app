package com.example.acmethicsapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.acmethicsapp.navigation.addChapterNavigation
import com.example.acmethicsapp.navigation.addFrameworkNavigation
import com.example.acmethicsapp.navigation.addSectionNavigation
import com.example.acmethicsapp.pages.*

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        // Home Page
        composable("home") { Home(navController) }

        // Handbook Page (List of Chapters)
        composable("handbook") { ChaptersPage(navController) }

        // Frameworks Page
        composable("frameworks") { FrameworksPage(navController) }

        // Credits Page
        composable("credits") { CreditsPage(navController) }

        // Chapter Navigation
        addChapterNavigation(navController)

        // Framework Navigation
        addFrameworkNavigation(navController)

        // Section Navigation
        addSectionNavigation(navController)
    }
}
