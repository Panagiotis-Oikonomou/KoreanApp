package com.example.myfirstapp.grammar.solo

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Regret() {
    LearningPage(
        title = "Showing Regret",
        description = "The first grammar point is used to express regret or wish about something that should have been done in the past, but wasn't. It translates roughly to \"I should have [verb]\" or \"I wish I had [verb]\". It indicates that the speaker feels that it would have been better to take a particular action, but now it's too late.\n" +
                "            The second grammar point is used to show regret about a past action or situation.\n" +
                "            The third grammar point is used to express that something should have been done in the past, but wasn't. It conveys a sense of regret or necessity, implying that the speaker believes a certain action was required or should have been taken at a particular point in time, but wasn't.",
        structure = listOf(
            "(1) Verb stem-ㄹ/을 걸 그랬다",
            "(2) 괜히 + Verb",
            "(3) Verb-았/었어야 했다"
        ),
        examples = listOf(
            "괜히 기다렸어요." to "I regret waiting.",
            "그 사람에게 연락할 걸 그랬어요." to "I should have contacted that person.",
            "좀 더 공부할 걸 그랬어요." to "I regret studying more.",
            "그때 말할 걸 그랬어요." to "I should have said it at that time.",
            "그 사람을 만났어야 했어요." to "I should have met that person.",
            "더 많이 먹었어야 했어요." to "I should have eaten more."
        )
    )
}