package com.example.myfirstapp.grammar.makesentence

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Must() {
    LearningPage(
        title = "Must / Only If",
        description = "This grammar expresses a necessary condition: in order for something to happen, the action or condition must come first, meaning \"must / have to\" or \"only if…\"."
        + "The difference with -(으)려고 is this one means I’m doing A because I intend/want to do B, it expresses your intention or purpose, "
                + "where as the -아/어야 means A has to happen for B to be possible, it expresses a necessary condition.",
        structure = listOf("Verb/Adj-아/어야"),
        examples = listOf(
            "공부해야 시험을 잘 볼 수 있어요." to "You have to study to do well on the exam.",
            "일찍 일어나야 학교에 늦지 않아요." to "You have to wake up early so you’re not late for school.",
            "돈이 있어야 그 물건을 살 수 있어요." to "You need to have money to buy that item.",
            "한국어를 많이 연습해야 잘할 수 있어요." to "You have to practice Korean a lot to become good at it.",
            "날씨가 좋아야 여행을 갈 수 있어요." to "The weather has to be good for us to go on a trip."
        )
    )
}