package com.example.myfirstapp.grammar.endings

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Ra() {
    LearningPage(
        title = "-라 Ending",
        description = "-라 is used to form informal commands or imperatives — basically telling someone to do something in a casual and sometimes authoritative tone.",
        structure = listOf(
            "Verb-아/어 + 라"
        ),
        examples = listOf(
            "이웃을 보면 인사 좀 해라." to "If you came across your neighbor greet them.",
            "조용히 해라!" to "Be quiet!",
            "이 책을 읽어라." to "Read this book.",
            "집에 가라." to "Go home."
        )
    )
}