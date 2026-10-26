package com.example.myfirstapp.grammar.verbtonoun
import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Ki() {
    LearningPage(
        title = "Verb/Adjective-기",
        description = "In Korean, the \"Verb + -기\" construction is one of the most common ways to turn a verb into a noun-like form. It takes the action described by the verb and treats it like a \"thing\" or \"concept\" rather than an action you're doing right now.",
        examples = listOf(
            "한국어 배우기 어려워요." to "Learning Korean is difficult.",
            "외국인이 한국어를 혼자 공부하기 어려워요." to "Foreigners studying Korean alone is difficult.",
            "저는 읽기를 잘하는데 듣기를 못해요." to "I am good at reading but I am not good at listening."
        )
    )
}