package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun ComingToPresent() {
    LearningPage(
        title = "Action continuing from the past",
        description = "This grammar point conveys the idea of action continuing from the past to the present or movement toward the speaker while performing an action. It';s often used when talking about actions or events that have been happening over time and up to the present moment.",
        structure = listOf("Verb-아/어 오다"),
        examples = listOf(
            "지금까지 잘 살아왔어요." to "I have been living well so far.",
            "사장님이 회사를 잘 운영해왔어요." to "The boss has been managing the company well."
        )
    )
}