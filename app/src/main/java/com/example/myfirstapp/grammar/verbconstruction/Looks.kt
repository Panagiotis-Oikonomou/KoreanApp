package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Looks() {
    LearningPage(
        title = "Looks / seems…",
        description = "The grammar is used to describe how someone or something looks, especially when its appearance gives a certain impression.",
        structure = listOf("Adj-게 생겼다"),
        examples = listOf(
            "그 사람은 정말 잘생기게 생겼어요." to "That person looks really handsome.",
            "강아지가 귀엽게 생겼어요." to "The puppy looks cute.",
            "그 사람은 무섭게 생겼지만 친절해요." to "That person looks scary, but they're kind."
        )
    )
}