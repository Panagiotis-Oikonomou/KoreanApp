package com.example.myfirstapp.grammar.makesentence

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun WhileDoing() {
    LearningPage(
        title = "While / at the same time / whereas",
        description = "The grammar point is used when two actions happen at the same time intentionally. It can also be used to contrast two facts or actions, similar to \"while\" or \"whereas\".",
        structure = listOf("-(으)면서"),
        examples = listOf(
            "음악을 들으면서 공부해요." to "I study while listening to music.",
            "밥을 먹으면서 이야기를 했어요." to "We talked while eating.",
            "걸으면서 전화했어요." to "I talked on the phone while walking.",
            "일하면서 한국어를 배워요." to "I learn Korean while working."
        )
    )
}