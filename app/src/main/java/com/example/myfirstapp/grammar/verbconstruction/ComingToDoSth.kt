package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun ComingToDoSth() {
    LearningPage(
        title = "Coming to Do Something",
        description = "It is often used when a situation or circumstances cause a change, rather than you simply deciding to do something yourself." +
        "\n1. implies the inevitability of the change\n2. natural development over time",
        structure = listOf("Verb stem + -게 되다"),
        examples = listOf(
            "한국어를 공부하게 됐어요." to "I came to study Korean. / I ended up studying Korean.",
            "새로운 사람들을 만나게 됐어요." to "I came to meet new people.",
            "한국 음식을 좋아하게 됐어요." to "I came to like Korean food."
        )
    )
}