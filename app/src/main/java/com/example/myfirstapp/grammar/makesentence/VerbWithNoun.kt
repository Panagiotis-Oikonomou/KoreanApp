package com.example.myfirstapp.grammar.makesentence

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun VerbWithNoun() {
    LearningPage(
        title = "To Verb without a Noun",
        description = "This grammar point negates the presence or use of something when doing the action that follows.",
        structure = listOf("Noun + 없이 + Negative Verb"),
        examples = listOf(
            "돈 없이 살 수 없어요." to "I can't live without money.",
            "너 없이 재미없어." to "I'm boring without you.",
            "허락 없이 들어오지 마세요." to "Don't come in without permission."
        )
    )
}