package com.example.acmethicsapp.pages

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
fun SectionDetailsPage(
    navController: NavController,
    title: String,
    description: String,
    chapterId: String,
    modifier: Modifier = Modifier
) {
    val scrollState = rememberScrollState()
    val isAtBottom = remember { derivedStateOf { scrollState.value == scrollState.maxValue } }

    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .padding(bottom = 64.dp), // Leave space for the button
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = title,
                fontSize = 24.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Text(
                text = description,
                fontSize = 16.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }

        if (isAtBottom.value) {
            Button(
                onClick = { navController.navigate("chapter/$chapterId") },
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(16.dp)
            ) {
                Text(text = "Back to Chapter")
            }
        }
    }
}
