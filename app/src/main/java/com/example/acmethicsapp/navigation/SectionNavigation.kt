package com.example.acmethicsapp.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavController
import androidx.navigation.compose.composable
import com.example.acmethicsapp.pages.SectionDetailsPage
import com.example.acmethicsapp.data.*

fun NavGraphBuilder.addSectionNavigation(navController: NavController) {
    composable("section/{sectionId}") { backStackEntry ->
        val sectionId = backStackEntry.arguments?.getString("sectionId") ?: ""
        val section = when {
            sectionId.startsWith("chapter1") -> Chapter1Repository.sections.find { it.id == sectionId }
            sectionId.startsWith("chapter2") -> Chapter2Repository.sections.find { it.id == sectionId }
            sectionId.startsWith("chapter3") -> Chapter3Repository.sections.find { it.id == sectionId }
            sectionId.startsWith("chapter4") -> Chapter4Repository.sections.find { it.id == sectionId }
            else -> null
        }

        section?.let {
            SectionDetailsPage(
                navController = navController,
                title = it.title,
                description = it.description,
                chapterId = it.id.split(".")[0] // Extract chapter ID from section ID
            )
        } ?: navController.popBackStack() // Handle invalid sectionId
    }
}
