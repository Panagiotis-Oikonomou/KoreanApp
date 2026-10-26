package com.example.myfirstapp.grammar.particles

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Cheoreom() {
    LearningPage(
        title = "-처럼, -같은 particles",
        description = "-처럼 is used when comparing actions or qualities and is often placed after a noun. It describes how something is (similar in nature or quality) to something else.\n\n" +
                "-같은 is used to describe things or people that are similar or identical to something else. It can be translated as \"the same as\", \"similar to\", or \"like\" in some contexts. -같은 can be used after a noun to indicate that something or someone is of the same kind or category as another.\n\n" +
                "-처럼 focuses more on comparing qualities or actions (e.g., \"like\" in terms of appearance, behavior, or characteristics). -같은 is used to show that something is exactly the same or similar in terms of category or class.",
        examples = listOf(
            "그는 고양이처럼 귀여워요." to "He is cute like a cat.",
            "이 영화는 제가 전에 본 영화와 같은 종류예요." to "This movie is the same type as the one I saw before.",
        )
    )
}