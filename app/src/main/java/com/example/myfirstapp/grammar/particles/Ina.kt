package com.example.myfirstapp.grammar.particles

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Ina() {
    LearningPage(
        title = "-(이)나 particle",
        description = "-(이)나  is used to mean \"or\", \"or something\", \"at least\" or \"even\". This grammar it's not used in questions that ask you to choose two specific options.",
        examples = listOf(
            "책이나 신문을 읽을 거예요." to "I'll read a book or a newspaper.",
            "저는 집에 가서 밥이나 먹을 거예요." to "I am going to go home and eat rice or something.",
            "사과나 하나 주세요." to "Please give me at least one apple.",
            "이것은 5,000원이나 해요." to "This costs as much as 5,000 won.",
            "한국어 단어를 백 개나 알아요." to "I know (as many as) 100 Korean words."
        )
    )
}