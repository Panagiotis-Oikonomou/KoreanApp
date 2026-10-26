package com.example.myfirstapp.grammar.particles

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstapp.layouts.ConversationLayout
import com.example.myfirstapp.layouts.ExamplesLayout
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun Subject() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Topic/Subject particles",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "은/는 Topic Markers",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Description",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "These particles are used to introduce a topic, or when you want to contrast or emphasize something.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "이/가 Subject Markers",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Description",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "These particles mark the subject of the sentence or focus on a specific element. It's typically used when you're providing new information or identifying something/someone for the first time. 이/가 focuses more on the subject itself without the contrastive or introductory nuance that 은/는 brings.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Examples",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(listOf("저는 한국어를 배웠어요." to "I am learning Korean."))

        Text(
            text = "Focus is on \"learning Korean\", what did you learn? Korean (nothing else).",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        ConversationLayout(
            a = listOf("누가 한국어를 배웠어요?" to "Who learned Korean?"),
            b = listOf("제가 했어요." to "I did.")
        )

        Text(
            text = "Focus is on \"I\". Imagine asking that to a room full of people. In order to emphasize that you (and not the other people) have learned Korean.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        ExamplesLayout(listOf("저는 한국어를 공부해요." to "I study Korean."))

        Text(
            text = "(as for me) is marking \"I\" as the topic, so the sentence is more about talking about what I do.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        ExamplesLayout(listOf("제가 한국어를 공부해요." to "I study Korean."))

        Text(
            text = "제가 marks \"I\" as the subject of the sentence, putting emphasis on who is performing the action.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}