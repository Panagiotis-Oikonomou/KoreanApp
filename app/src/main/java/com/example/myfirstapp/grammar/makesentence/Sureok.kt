package com.example.myfirstapp.grammar.makesentence

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Sureok() {
    LearningPage(
        title = "Comparative expression",
        description = "This grammar point is used to indicate a situation where the more something happens, the more something else is true or happens. It's used to express a correlation where one action or condition intensifies another. It translates roughly as \"the more (verb), the more (something else)\".",
        structure = listOf("Verb stem-ㄹ/을 수록"),
        examples = listOf(
            "공부할수록 실력이 늘어요." to "The more I study, the more my skills improve.",
            "이 영화를 볼수록 재미있어요." to "The more I watch this movie, the more interesting it becomes.",
            "시간이 갈수록 먹고 싶어요." to "The more the time passes, the more I want to eat."
        )
    )
}