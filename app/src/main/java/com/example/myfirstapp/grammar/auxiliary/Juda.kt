package com.example.myfirstapp.grammar.auxiliary

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Juda() {
    LearningPage(
        title = "-주다 Auxiliary Verb",
        description = "-주다 in Korean is used to indicate that an action is done for the benefit of someone else or to express that the speaker is doing something for someone. It generally carries the nuance of providing help, assistance, or favor.",
        structure = listOf(
            "V-아/어 + 주다 (informal, neutral tone)",
            "V-아/어 + 드리다 (polite, formal version)"
        ),
        examples = listOf(
            "요리해주세요." to "Please cook (for me).",
            "제가 저를 용서해주면 뭐든 다 할게." to "If you forgive me I will do anything.",
            "저는 하루 종일 할머니를 돌봐드렸어요." to "I looked after my grandmother all day long."
        )
    )
}