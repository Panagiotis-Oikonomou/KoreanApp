package com.example.myfirstapp.grammar.makesentence

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Jidweta() {
    LearningPage(
        title = "Time since then",
        description = "This grammar point is used in Korean to describe how much time has passed since an event occurred or since an action was completed. It translates roughly to \"It has been (time) since [verb]\".",
        structure = listOf("Verb stem-ㄴ/은 지 + [time](이) 됬다"),
        examples = listOf(
            "한국에 온 지 3년이 됐어요." to "It has been 3 years since I came to Korea.",
            "운전한 지 5개월이 됐어요." to "It has been 5 months since I started driving.",
            "이 영화를 본 지 오래됐어요." to "It has been a long time since I watched this movie.",
            "그 사람을 만난 지 한 달이 됐어요." to "It has been one month since I met that person."
        )
    )
}