package com.example.myfirstapp.grammar.makesentence

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun AsSoonAs() {
    LearningPage(
        title = "As Soon As / Immediately After",
        description = "This grammar is used to express that one action happens immediately after another action. It emphasizes that there is almost no time between the two actions.",
        structure = listOf("Verb-자마자"),
        examples = listOf(
            "집에 도착하자마자 잠을 잤어요." to "As soon as I arrived home, I went to sleep.",
            "일어나자마자 엄마한테 전화했어요." to "I called my mom as soon as I woke up.",
            "그 사람을 만나자마자 사랑에 빠졌어요." to "I fell in love as soon as I met that person.",
            "아침에 눈을 뜨자마자 휴대폰을 확인해요." to "I check my phone as soon as I open my eyes in the morning."
        )
    )
}