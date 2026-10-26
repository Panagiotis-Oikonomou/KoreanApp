package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun SomethingNew() {
    LearningPage(
        title = "Getting/Having Something New",
        description = "This grammar point mean to \"to get/have something\" or \"something comes into existence\".",
        structure = listOf("Noun-이/가 + 생기다"),
        examples = listOf(
            "친구가 생겼어요." to "I made a friend / I have a new friend.",
            "새로운 취미가 생겼어요." to "I got a new hobby.",
            "질문이 생겼어요." to "I have a question. / A question came up."
        )
    )
}