package com.example.myfirstapp.grammar.solo

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun ClarifyingSth() {
    LearningPage(
        title = "Explaining, Emphasizing, or Clarifying Something",
        description = "The Korean grammar point -는/ㄴ/은 것이다 is used to explain or clarify a situation, emphasize a fact, or give an explanation for something. Depending on the context, it can mean:"
                        +"\"It is that...\", \"The reason is that...\", \"What this means is...\", \"It’s because...\"."
                        +"In everyday Korean, you will often see the shortened form -ㄴ/은 거예요. The formal written form is -는/ㄴ/은 것이다.",
        structure = listOf("Verb/Adj-는/ㄴ/은 것이다"),
        examples = listOf(
            "이것은 내가 원하는 것이다." to "This is what I want.",
            "내가 말한 것은 바로 이것이다." to "This is exactly what I was talking about."
        )
    )
}