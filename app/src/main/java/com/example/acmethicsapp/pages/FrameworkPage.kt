package com.example.acmethicsapp.pages

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

@Composable
fun FrameworkPage(
    title: String,
    description: String,
    onBackToHome: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()), // Makes the entire page scrollable
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        // Title
        Text(
            text = title,
            fontSize = 24.sp,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        // Description
        Text(
            text = description,
            fontSize = 16.sp,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        // Optional Textbox
//        val textState = remember { TextFieldValue("Enter your text here...") }
//        BasicTextField(
//            value = textState,
//            onValueChange = { /* Handle input changes if needed */ },
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(16.dp)
//                .height(100.dp)
//        )

        // Button to return to Home
        Button(
            onClick = onBackToHome,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 24.dp)
        ) {
            Text(text = "Return to Home")
        }
    }
}
