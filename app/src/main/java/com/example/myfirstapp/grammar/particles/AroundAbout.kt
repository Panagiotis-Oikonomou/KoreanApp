package com.example.myfirstapp.grammar.particles

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun AroundAbout() {
    LearningPage(
        title = "쯤/정도 particles",
        description = "Both mean \"around\" or \"about\" to indicate approximation, and they can used interchangeably. They are commonly used with counters and time expressions. 쯤is right directly attached to the noun and 정도 needs spacing.",
        examples = listOf(
            "2주쯤 됐어요." to "It's been about two weeks.",
            "오늘 카피를 두 잔 정도 마셨어요." to "I had around two caps of coffee today."
        )
    )
}