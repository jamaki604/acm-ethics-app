package com.example.acmethicsapp.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.NavController
import com.example.acmethicsapp.pages.FrameworkPage
import com.example.acmethicsapp.pages.FrameworksPage
import com.example.acmethicsapp.data.FrameworkRepository

fun NavGraphBuilder.addFrameworkNavigation(navController: NavController) {
    // Framework List Page
    composable("frameworks") {
        FrameworksPage(navController = navController)
    }

    // Individual Framework Details Page
    FrameworkRepository.frameworks.forEach { framework ->
        composable("framework/${framework.id}") {
            FrameworkPage(
                title = framework.title,
                description = framework.description,
                onBackToFrameworks = { navController.popBackStack("frameworks", inclusive = false) }
            )
        }
    }
}

