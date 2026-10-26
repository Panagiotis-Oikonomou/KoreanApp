package com.example.myfirstapp.grammar.solo

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun CanDo() {
    LearningPage(
        title = "Ability, Possibility, Permission",
        description = "This grammar point it can express ability (physical or mental), possibility, and permission sometimes depending on the context and tone. This doesn't strictly mean permission by itself, but when used in polite questions or suggestions, it often implies asking or giving permission.",
        structure = listOf(
            "Verb stem-ㄹ/을 수 있다/없다"
        ),
        examples = listOf(
            "이 음식은 먹을 수 있어요." to "I can eat this.",
            "그건 이해할 수 없어요." to "I can't understand that.",
            "이 방에 들어갈 수 있어요?" to "Can I enter this room?"
        )
    )
}