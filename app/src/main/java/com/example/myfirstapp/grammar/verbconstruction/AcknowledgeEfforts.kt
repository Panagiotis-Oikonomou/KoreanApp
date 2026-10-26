package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun AcknowledgeEfforts() {
    LearningPage(
        title = "Acknowledge sm efforts",
        description = "This grammar is used to acknowledge someones efforts.",
        structure = listOf("Verb stem + 느라 수고하셨다/고생하셨다"),
        examples = listOf(
            "감사합니다. 요리하느라 고생하셨어요." to "Thank you. You went through hard time because you cooked.",
            "비행이 타느라 고생하셨어요." to "You went through a hard time riding the plane."
        )
    )
}