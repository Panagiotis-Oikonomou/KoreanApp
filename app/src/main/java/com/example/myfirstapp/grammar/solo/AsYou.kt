package com.example.myfirstapp.grammar.solo

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun AsYou() {
    LearningPage(
        title = "As you...",
        description = "This grammar point means \"as / like\", and the verb before it is usually in honorific or plain form depending on the subject, and it's specific verbs.",
        structure = listOf(
            "알다시피 -> \"As you know\"",
            "보다시피 -> \"As you can see\"",
            "들으시피 -> \"As you heard\"",
            "생각하시피 -> \"As you think / As you may be thinking\""
        ),
        examples = listOf(
            "보다시피 날씨가 정말 좋아요." to "As you can see the weather is really good.",
            "생각하시피 이 일은 쉬운 일이 아네에요." to "As you (may) think, this is not an easy task.",
            "들으시피이번 프로젝트는 성공적이었어요." to "As you heard, this project was a success."
        )
    )
}