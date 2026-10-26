package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun ItSuits() {
    LearningPage(
        title = "To Fit, Suit, or Be Appropriate for Something",
        description = "The Korean expression -에 맞다 means that something fits, suits, matches, or is appropriate for a particular person, situation, standard, or purpose.",
        structure = listOf("Noun-에 맞다"),
        examples = listOf(
            "이 옷은 제 스타일에 맞아요." to "These clothes suit my style.",
            "이 일은 제 성격에 맞아요." to "This job suits my personality.",
            "상황에 맞게 행동해야 해요." to "You should act according to the situation.",
            "이 계획은 우리의 목적에 맞아요." to "This plan fits our purpose."
        )
    )
}