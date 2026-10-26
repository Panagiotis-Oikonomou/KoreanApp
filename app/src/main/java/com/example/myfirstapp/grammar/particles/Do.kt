package com.example.myfirstapp.grammar.particles

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Do() {
    LearningPage(
        title = "-도 particle",
        description = "-도 is used to mean \"also\", \"too\", or \"even\". It's used to indicate that something applies in addition to something else or to emphasize that something is included or involved in a certain situation.",
        examples = listOf(
            "저도 가고 싶어요." to "I want to go too.",
            "그 사람은 한국어도 잘해요." to "That person speaks Korean well too.",
            "그는 학생도 아니에요." to "He is not even a student.",
        )
    )
}