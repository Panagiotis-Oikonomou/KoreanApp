package com.example.myfirstapp.grammar.makesentence

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun NoMatterHow() {
    LearningPage(
        title = "No matter how much you Verb/Adjective",
        description = "This structure is used to show that no matter the effort or situation, the result doesn't change.",
        structure = listOf("아무리 + Verb/Adjective-아/어도"),
        examples = listOf(
            "아무리 공부해도 시험을 못 봐요." to "No matter how much I study, I do badly on the test.",
            "아무리 먹어도 배가 안 불러요." to "No matter how much I eat, I don't feel full.",
            "아무리 비싸도 사고 싶어요." to "Even if it's expensive, I want to buy it.",
            "아무리 똑똑해도 매일 연습하지 않으면 한국어를 잘 할 수 없어요." to "No matter how smart you are if you don't practice everyday you can't be good at Korean."
        )
    )
}