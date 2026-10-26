package com.example.myfirstapp.grammar.makesentence

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Hypothetical() {
    LearningPage(
        title = "Hypothetical",
        description = "This grammar pattern is used to talk about hypothetical situations, or concessions, where even if something happens or is true, the result or action will remain unchanged.",
        structure = listOf("Verb stem-더라도"),
        examples = listOf(
            "돈이 없더라도 행복할 수 있어요." to "Even if you don't have money, you can still be happy.",
            "다시 태어나더라도 널 사랑할 거예요." to "Even if I were born again, I would still love you.",
            "혼자 가더라도 여행을 포기하지 않을 거예요." to "Even if I have to go alone, I won't give up on the trip."
        )
    )
}