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

@Composable
fun PreamblePage(navController: NavController, modifier: Modifier = Modifier) {
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
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "ACM Ethics Handbook",
                fontSize = 24.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = "Preamble",
                fontSize = 16.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = """
                            Computing professionals' actions change the world. To act responsibly, they should reflect upon the wider impacts of their work, 
                            consistently supporting the public good. The ACM Code of Ethics and Professional Conduct ("the Code") expresses the conscience of the profession.
                            
                            The Code is designed to inspire and guide the ethical conduct of all computing professionals, including current and aspiring 
                            practitioners, instructors, students, influencers, and anyone who uses computing technology in an impactful way. Additionally, 
                            the Code serves as a basis for remediation when violations occur. The Code includes principles formulated as statements of responsibility, 
                            based on the understanding that the public good is always the primary consideration. Each principle is supplemented by guidelines, 
                            which provide explanations to assist computing professionals in understanding and applying the principle.
                            
                            Section 1 outlines fundamental ethical principles that form the basis for the remainder of the Code. 
                            Section 2 addresses additional, more specific considerations of professional responsibility. Section 3 guides individuals 
                            who have a leadership role, whether in the workplace or in a volunteer professional capacity. Commitment to ethical conduct 
                            is required of every ACM member, ACM SIG member, ACM award recipient, and ACM SIG award recipient. Principles involving 
                            compliance with the Code are given in Section 4.
                            
                            The Code as a whole is concerned with how fundamental ethical principles apply to a computing professional's conduct. 
                            The Code is not an algorithm for solving ethical problems; rather it serves as a basis for ethical decision-making. 
                            When thinking through a particular issue, a computing professional may find that multiple principles should be taken 
                            into account, and that different principles will have different relevance to the issue. Questions related to these kinds 
                            of issues can best be answered by thoughtful consideration of the fundamental ethical principles, understanding that 
                            the public good is the paramount consideration. The entire computing profession benefits when the ethical decision-making 
                            process is accountable to and transparent to all stakeholders. Open discussions about ethical issues promote this accountability and transparency.
                        """.trimIndent(),
                fontSize = 16.sp,
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(bottom = 16.dp)
            )


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
