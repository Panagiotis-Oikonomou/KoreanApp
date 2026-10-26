package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Completion() {
    LearningPage(
        title = "Completion",
        description = "This grammar point is used to indicate completing or finishing an action, often with the nuance of something being done completely or irreversibly. It can also convey a sense of regret, relief or unexpected results depending on the context.",
        structure = listOf("Verb-아/어 버리다"),
        examples = listOf(
            "빚을 다 갚아버렸어요." to "I paid off all my debt. (you feel relief about it)",
            "음식을 다 먹어버렸어요." to "I ate all the food. (you feel regret about it)."
        )
    )
}