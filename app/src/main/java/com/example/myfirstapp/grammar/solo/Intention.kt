package com.example.myfirstapp.grammar.solo

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Intention() {
    LearningPage(
        title = "Saying your Intention",
        description = "You use this grammar points to make sentences that mean \"in order to Verb\". (으)러 is used for almost only motion verbs (가다, 오다, 들어가다,  etc) and when the sentence is in imperative form. (으)려고 is used for all other verbs. -게 and -도록 are used when the action verb is in imperative form.",
        structure = listOf(
            "Verb stem + (으)려고",
            "Verb stem + (으)러",
            "Verb stem + 게",
            "Verb stem + 도록"
        ),
        examples = listOf(
            "한국어를 잘하려고 매일 공부해요." to "In order to be good in Korean I study everyday.",
            "공부하러 도서관에 왔어요." to "In order to study I came to the library.",
            "내일 일찍 일어나게/도록 일찍 자요." to "Sleep early to get up early tomorrow."
        )
    )
}