package com.example.myfirstapp.grammar.solo

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun TheMost() {
    LearningPage(
        title = "가장/제일 The Most",
        description = "These are two adverbs in Korean that mean \"the most\", and they are always interchangeable. They modify adjectives and adverbs and are naturally placed directly after them.",
        examples = listOf(
            "여름이 가장 더워요." to "Summer is the hottest.",
            "지호가 우리 반에서 키가 제일 커요." to "Jiho is the tallest in our class.",
            "비빔밥을 가장 좋아해요." to "I like bibimbap the most.",
        )
    )
}