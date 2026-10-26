package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Dependency() {
    LearningPage(
        title = "Dependency",
        description = "This is a grammar pattern used to express that something depends on (doing) something or hinges on (doing) something.",
        structure = listOf(
            "Verb-기에 달려 있다",
            "Verb-기 나름이다"
        ),
        examples = listOf(
            "아이의 인성은 부모가 가르치기에 달려 있어요." to "The child's character depends on how the parents teach them.",
            "시험성적은 공부하기에 달려 있어요." to "Your test grade depends on how much you study.",
            "인생은 살기 나름이에요." to "Life depends on how you live it."
        )
    )
}