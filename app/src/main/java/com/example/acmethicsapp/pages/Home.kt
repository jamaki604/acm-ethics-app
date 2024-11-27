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
        // Logo
        Image(
            painter = rememberAsyncImagePainter("file:///android_asset/acm_logo.jpg"),
            contentDescription = "ACM Code of Ethics Logo",
            modifier = Modifier
                .size(200.dp)
                .padding(bottom = 24.dp)
        )

        // Welcome Text
        Text(
            text = "Welcome to ACM Ethics App",
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(bottom = 8.dp)
        )
        Text(
            text = "Learn about ethical principles and explore frameworks!",
            fontSize = 12.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // ACM Code of Ethics Handbook Button
        Button(
            onClick = { navController.navigate("handbook") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Text(text = "ACM Code of Ethics Handbook")
        }

        // Explore Frameworks Button
        Button(
            onClick = { navController.navigate("frameworks") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Text(text = "Explore Frameworks")
        }

        // Credits Button
        Button(
            onClick = { navController.navigate("credits") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Text(text = "Credits")
        }
    }
}
