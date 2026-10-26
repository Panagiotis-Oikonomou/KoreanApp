package com.example.myfirstapp.grammar.particles

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Man() {
    LearningPage(
        title = "-만 particle",
        description = "-만 is a particle that typically means \"only\" or \"just\", and it's used to limit or emphasize something.",
        examples = listOf(
            "나만 몰랐어?" to "Was I the only one who didn't know?",
            "하루에 한 번만 운동해요." to "I exercise only once a day.",
            "저는 고기만 먹어요." to "I only eat meat.",
        )
    )
}