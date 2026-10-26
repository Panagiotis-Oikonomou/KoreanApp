package com.example.myfirstapp.grammar.because

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Keure() {
    LearningPage(
        title = "Verb-아/어(해)서 그래",
        structure = listOf(
            "Verb-아/어(해)서 그래",
            "You use 해 when it's about other people and without it when it's about yourself."
        ),
        examples = listOf(
            "민지가 무서워해서 그래." to "It's because Minji is scared.",
            "내가 피곤해서 그래." to "It's because I'm tired.",
            "지수가 피곤해해서 그래." to "It's because Jisoo is tired."
        )
    )
}