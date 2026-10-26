package com.example.myfirstapp.grammar.makesentence

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Manyak() {
    LearningPage(
        title = "Assuming a hypothetical situation",
        description = "This expression is a hypothetical conditional, often used to speculate about situations that aren't real yet, or are imagined.",
        structure = listOf(
            "(만약) Verb stem-ㄴ/는다면",
            "(만약) Adjective stem + 다면"
        ),
        examples = listOf(
            "(만약) 두 개중 하나만 골라야 한다면요?" to "What if you have to choose only one among two choices?",
            "(만약) 모르는 사람이 말을 건다면요?" to "What if a stranger comes to talk to you?",
            "(만약) 똑똑하다면요?" to "What if you are not smart?"
        )
    )
}