package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun WhyBusy() {
    LearningPage(
        title = "Why you are busy",
        description = "This grammar point is often used to explain why you are busy.",
        structure = listOf("Verb stem + 느라 비쁘다"),
        examples = listOf(
            "요즘 시험 준비하느라 바빠요." to "I was busy these days studying for the exams.",
            "아빠는 일하느라 바쁘세요." to "My dad is busy working."
        )
    )
}