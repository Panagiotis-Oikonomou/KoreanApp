package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun HowAbout() {
    LearningPage(
        title = "How about…?",
        description = "This grammar is used to suggest an idea or ask someone what they think about doing something. It means \"How about…?\" / \"Why don’t we…?\"",
        structure = listOf("Verb-는 거 어때"),
        examples = listOf(
            "같이 영화 보는 거 어때?" to "How about watching a movie together?",
            "이 음식 먹어 보는 거 어때?" to "How about trying this food?",
            "오늘은 집에서 쉬는 거 어때?" to "How about resting at home today?",
            "한국어를 같이 공부하는 거 어때?" to "How about studying Korean together?"
        )
    )
}