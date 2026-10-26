package com.example.myfirstapp.grammar.makesentence

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun BadChoices() {
    LearningPage(
        title = "Compare bad choices",
        description = "This grammar pattern shows a choice between two undesirable (or less preferred) actions, and emphasizes that the second option is better (or less bad) than the first.",
        structure = listOf(
            "Verb stem-느니 차라리 + Verb"
        ),
        examples = listOf(
            "혼자 있느니 차라리 집에 갈게요." to "Rather than staying alone, I'd rather go home.",
            "실패하느니 차라리 시도하지 않겠어요." to "Rather than failing, I'd rather not try at all.",
            "담배를 끊느니 차라리 죽겠어요." to "I prefer to die than to quit smoking."
        )
    )
}