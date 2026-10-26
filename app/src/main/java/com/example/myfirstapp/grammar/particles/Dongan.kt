package com.example.myfirstapp.grammar.particles

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Dongan() {
    LearningPage(
        title = "-동안 particle",
        description = "This grammar it is used with duration counts, such as 년, 개월, 주일, 일, 시간, 분, 초, 달. It can often be omitted when used with duration counter, because a duration counter itself already indicates that you are talking about duration. It can also be used with tie period nouns.",
        examples = listOf(
            "한국어를 1년 동안 배웠어요." to "I learned Korean for a year.",
            "여기에서 7겨월 동안 일했어요." to "I worked here for 7 months.",
            "방학 덩안 여행을 했어요." to "I travelled during school vacation.",
        )
    )
}