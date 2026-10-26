package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Hassle() {
    LearningPage(
        title = "It's a hassle to…",
        description = "This grammar it is used to say that you can’t be bothered to do something or that doing something feels annoying, troublesome, or like too much effort.",
        structure = listOf("Verb-기 귀찮다"),
        examples = listOf(
            "요리하기 귀찮아서 배달시켰어요." to "I couldn’t be bothered to cook, so I ordered delivery.",
            "밖에 나가기 귀찮아요." to "I can’t be bothered to go outside.",
            "친구한테 전화하기 귀찮아서 메시지를 보냈어요." to "I couldn’t be bothered to call my friend, so I sent a message."
        )
    )
}