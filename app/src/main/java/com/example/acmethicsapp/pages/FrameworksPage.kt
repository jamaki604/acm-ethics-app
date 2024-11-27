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
import com.example.acmethicsapp.data.FrameworkRepository

@Composable
fun FrameworksPage(navController: NavController, modifier: Modifier = Modifier) {
    val frameworks = FrameworkRepository.frameworks
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
                .padding(bottom = 64.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Explore Frameworks",
                fontSize = 24.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            frameworks.forEach { framework ->
                Button(
                    onClick = { navController.navigate("framework/${framework.id}") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                ) {
                    Text(text = framework.title)
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
