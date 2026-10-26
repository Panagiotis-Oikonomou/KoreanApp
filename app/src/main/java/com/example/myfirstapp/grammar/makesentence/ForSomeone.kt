package com.example.myfirstapp.grammar.makesentence

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun ForSomeone() {
    LearningPage(
        title = "Doing Something For Someone/Something",
        description = "It is used when you do something for the benefit or purpose of a person or thing.",
        structure = listOf("Noun-을/를 위해서"),
        examples = listOf(
            "가족을 위해서 열심히 일해요." to "I work hard for my family.",
            "건강을 위해서 매일 운동해요." to "I exercise every day for my health.",
            "미래를 위해서 돈을 저축하고 있어요." to "I’m saving money for my future.",
            "아이들을 위해서 요리했어요." to "I cooked for the children."
        )
    )
}