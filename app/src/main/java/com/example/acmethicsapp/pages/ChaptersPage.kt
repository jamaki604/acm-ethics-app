package com.example.acmethicsapp.pages

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ChaptersPage(navController: NavController, modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()
    val isAtBottom = remember { derivedStateOf { scrollState.value == scrollState.maxValue } }

    val chapters = listOf(
        "chapter1" to "1. General Ethical Principles",
        "chapter2" to "2. Professional Responsibilities",
        "chapter3" to "3. Professional Leadership Principles",
        "chapter4" to "4. Compliance with the Code"
    )

    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .padding(bottom = 64.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "ACM Ethics Handbook",
                fontSize = 24.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = "Chapters",
                fontSize = 16.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            chapters.forEach { (id, title) ->
                Button(
                    onClick = {
                        Log.d("NavigationDebug", "Navigating to Chapter: $id")
                        navController.navigate("chapter/$id")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                ) {
                    Text(text = title)
                }
            }
        }

        if (isAtBottom.value) {
            Button(
                onClick = { navController.navigate("home") },
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(16.dp)
            ) {
                Text(text = "Back to Home")
            }
        }
    }
}
