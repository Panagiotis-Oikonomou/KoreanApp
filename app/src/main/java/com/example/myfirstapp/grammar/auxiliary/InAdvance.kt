package com.example.myfirstapp.grammar.auxiliary

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun InAdvance() {
    LearningPage(
        title = "Doing Something in Advance and Leaving It That Way",
        description = "This grammar is used when you do something and leave it in that state, or when you do something in advance so that it is ready for later use.",
        structure = listOf("Verb-아/어 놓다"),
        examples = listOf(
            "저녁을 미리 준비해 놓았어요." to "I prepared dinner in advance.",
            "불을 켜 놓았어요." to "I turned on the light and left it on.",
            "여행 가기 전에 표를 사 놓았어요." to "I bought the tickets before going on the trip.",
            "음식을 냉장고에 넣어 놓았어요." to "I put the food in the refrigerator and left it there."
        )
    )
}