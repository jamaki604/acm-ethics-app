package com.example.acmethicsapp.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.acmethicsapp.data.FrameworkRepository
import coil.compose.rememberAsyncImagePainter

@Composable
fun Home(navController: NavController, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = rememberAsyncImagePainter("file:///android_asset/acm_logo.jpg"),
            contentDescription = "ACM Code of Ethics Logo",
            modifier = Modifier
                .size(200.dp)
                .padding(bottom = 24.dp)
        )
        Text(
            text = "Welcome to ACM Ethics App",
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(bottom = 8.dp)
        )
        Text(
            text = "Select a framework to learn more!",
            fontSize = 12.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )


        // Dynamically generated buttons
        FrameworkRepository.frameworks.forEach { framework ->
            Button(
                onClick = { navController.navigate(framework.id) },
                modifier = Modifier
                    .width(200.dp) // Set a fixed width for the button
                    .align(Alignment.CenterHorizontally) // Aligns the button in the center
                    .padding(vertical = 4.dp) // Adds vertical spacing between buttons
            ) {
                Text(text = framework.title)
            }
        }
    }
}
