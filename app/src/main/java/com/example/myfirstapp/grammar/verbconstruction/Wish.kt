package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Wish() {
    LearningPage(
        title = "Expressing ones Wish",
        description = "This grammar point is a polite way to express a wish, suggestion, or desire for something to happen, similar to saying \"I would appreciate it if\" or \"It would be good if\"",
        structure = listOf("Verb stem-(으)면 좋겠습니다"),
        examples = listOf(
            "가면 좋겠습니다." to "I hope I can go.",
            "한국어를 잘하면 좋겠습니다." to "I wish I get good at Korean.",
            "먹으면 좋겠습니다." to "It would be good if I eat."
        )
    )
}