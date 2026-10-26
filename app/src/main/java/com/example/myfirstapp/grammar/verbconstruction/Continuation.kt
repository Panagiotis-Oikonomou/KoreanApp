package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Continuation() {
    LearningPage(
        title = "Continuation/Progression",
        description = "This grammar point is used to express the idea of an action moving forward or progressing toward a goal, both physically and figuratively.",
        structure = listOf("Verb-아/어 가다"),
        examples = listOf(
            "영화가 끝나가요." to "The movies goes to the end.",
            "아이가 엄마를 닮아가요." to "The child it's becoming more like her mother."
        )
    )
}