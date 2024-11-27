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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.text.ClickableText
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString

@Composable
fun CreditsPage(navController: NavController, modifier: Modifier = Modifier) {
    val context = LocalContext.current
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
            // About This App Section
            Text(
                text = "About This App",
                fontSize = 24.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = "Developed by Jacob King",
                fontSize = 16.sp,
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            ClickableText(text = AnnotatedString("Website: JK Codes"), onClick = {
                    val intent =
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://jamaki604.github.io/"))
                    context.startActivity(intent)
                }, modifier = Modifier.padding(bottom = 16.dp), style = androidx.compose.ui.text.TextStyle(
                    color = Color.Blue,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Start
                ))

            Spacer(modifier = Modifier.height(16.dp))

            // Acknowledgments Section
            Text(
                text = "Acknowledgments",
                fontSize = 24.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = "Data Source: ACM Code of Ethics",
                fontSize = 16.sp,
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = "The Code and guidelines were developed by the ACM Code 2018 Task Force: "
                        + "Executive Committee Don Gotterbarn (Chair), Bo Brinkman, Catherine Flick, "
                        + "Michael S Kirkpatrick, Keith Miller, Kate Varansky, and Marty J Wolf.\n\n"
                        + "Members: Eve Anderson, Ron Anderson, Amy Bruckman, Karla Carter, Michael Davis, "
                        + "Penny Duquenoy, Jeremy Epstein, Kai Kimppa, Lorraine Kisselburgh, Shrawan Kumar, "
                        + "Andrew McGettrick, Natasa Milic-Frayling, Denise Oram, Simon Rogerson, David Shamma, "
                        + "Janice Sipior, Eugene Spafford, and Les Waguespack.\n\n"
                        + "The Task Force was organized by the ACM Committee on Professional Ethics. "
                        + "Significant contributions to the Code were also made by the broader international ACM membership. "
                        + "This Code and its guidelines were adopted by the ACM Council on June 22nd, 2018.",
                fontSize = 16.sp,
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = "This Code may be published without permission as long as it is not changed in any way "
                        + "and it carries the copyright notice. Copyright (c) 2018 by the Association for Computing Machinery.",
                fontSize = 16.sp,
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }

        if (isAtBottom.value) {
            Button(
                onClick = { navController.navigate("home") }, // Navigate back to Home
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(16.dp)
            ) {
                Text(text = "Back to Home")
            }
        }
    }
}
