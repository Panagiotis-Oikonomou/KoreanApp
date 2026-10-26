package com.example.myfirstapp.grammar.makesentence

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun AdverbialClause() {
    LearningPage(
        title = "Adverbial Clause",
        description = "This grammar point is used to express the time or occasion when an action or event happens. It's similar to saying \"when\" or \"while\" in English, and it's used to indicate a specific time or moment during which something occurs.",
        structure = listOf("Verb stem-ㄹ/을 때"),
        examples = listOf(
            "영화를 볼 때 행복했어요." to "I was happy when I watched the movie.",
            "돈이 없어서 구경만 할 뿐이에요." to "I want to drink when I exercise.",
            "학교에 갈 때 만나자요." to "Let's meet when I go to school."
        )
    )
}