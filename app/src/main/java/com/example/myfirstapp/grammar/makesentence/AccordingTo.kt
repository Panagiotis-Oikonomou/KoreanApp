package com.example.myfirstapp.grammar.makesentence

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun AccordingTo() {
    LearningPage(
        title = "Depending on / According to / In accordance with",
        description = "The Korean grammar point -에 따라 is used to express that something changes depending on a condition, situation, or factor."
                        +"It can also mean \"according to\" or \"in accordance with\" a rule, standard, or source.",
        structure = listOf("Noun-에 따라"),
        examples = listOf(
            "사람에 따라 생각이 달라요." to "Thoughts differ depending on the person.",
            "날씨에 따라 기분이 달라져요." to "My mood changes depending on the weather.",
            "나이에 따라 취미가 달라질 수 있어요." to "Hobbies can differ depending on age.",
            "계획에 따라 일을 진행할 거예요." to "I will proceed with the work according to the plan.",
            "의사 선생님의 지시에 따라 약을 먹으세요." to "Take the medicine according to the doctor's instructions."
        )
    )
}