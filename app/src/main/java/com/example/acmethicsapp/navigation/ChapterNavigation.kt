package com.example.acmethicsapp.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavController
import androidx.navigation.compose.composable
import com.example.acmethicsapp.pages.SectionPage
import com.example.acmethicsapp.data.*

fun NavGraphBuilder.addChapterNavigation(navController: NavController) {
    composable("chapter/{chapterId}") { backStackEntry ->
        val chapterId = backStackEntry.arguments?.getString("chapterId") ?: ""
        when (chapterId) {
            "chapter1" -> SectionPage(
                navController = navController,
                title = "1. General Ethical Principles",
                sections = Chapter1Repository.sections
            )
            "chapter2" -> SectionPage(
                navController = navController,
                title = "2. Professional Responsibilities",
                sections = Chapter2Repository.sections
            )
            "chapter3" -> SectionPage(
                navController = navController,
                title = "3. Professional Leadership Principles",
                sections = Chapter3Repository.sections
            )
            "chapter4" -> SectionPage(
                navController = navController,
                title = "4. Compliance with the Code",
                sections = Chapter4Repository.sections
            )
            else -> navController.popBackStack() // Handle invalid chapterId
        }
    }
}
