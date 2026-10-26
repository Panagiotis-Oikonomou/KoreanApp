package com.example.myfirstapp.grammar.particles

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Bakke() {
    LearningPage(
        title = "-밖에 particle",
        description = "-밖에 is used to indicate a limitation or restriction, meaning \"only\" or \"nothing but\". It often implies that there is nothing else or nothing more than what is being mentioned. You need to use -밖에 only with negative verbs.",
        examples = listOf(
            "돈이 10,000원밖에 없어요." to "I have only 10,000 won.",
            "한국어밖에 못 해요." to "I can only speak Korean.",
            "그 영화밖에 안 봤어요." to "I only watched that movie.",
        )
    )
}