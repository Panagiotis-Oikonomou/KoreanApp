package com.example.myfirstapp.grammar.makesentence

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun SimilarSituations() {
    LearningPage(
        title = "Comparing similar situations",
        description = "This grammar is used to compare two situations by showing that one is similar to another in manner, logic or condition.",
        structure = listOf("Verb/Adj-듯(이)"),
        examples = listOf(
            "여러분도 알고 있듯이 꾸준함이 중요해요." to "Just as you guys know it's important to be consistent.",
            "한국 사람들이 영어를 배우는 게 쉽지 않듯이 영어 원어미 사람들이 한국어를 배우는 것도 쉽지 않아요." to "Just as it's not easy for Koreans to learn English, it's not easy for English native speakers to learn Korean."
        )
    )
}