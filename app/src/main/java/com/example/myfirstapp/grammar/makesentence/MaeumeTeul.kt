package com.example.myfirstapp.grammar.makesentence

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun MaeumeTeul() {
    LearningPage(
        title = "Liking something",
        description = "This grammar point means \"to like\" or \"to be pleased with\" something. It expresses that something is to your liking or that you find something appealing or enjoyable.",
        structure = listOf("Noun-이/가 마음에 들다"),
        examples = listOf(
            "이 영화가 마음에 들어요." to "I like this movie.",
            "저는 그 노래가 마음에 들어요." to "I like that song.",
            "이 옷이 마음에 들어요." to "I like this outfit."
        )
    )
}