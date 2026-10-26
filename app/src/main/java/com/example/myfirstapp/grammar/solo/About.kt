package com.example.myfirstapp.grammar.solo

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun About() {
    LearningPage(
        title = "About / Regarding…",
        description = "-에 대한 is used when one noun modifies another noun, meaning \"a Noun about/regarding Noun\"."
        + "\n-에 대해서 is used when you want to talk, ask, learn, or think about a particular topic.",
        structure = listOf("Noun-에 대한(modifier) + Noun", "Noun-에 대해서(adverb) + Verb"),
        examples = listOf(
            "한국에 대한 책을 읽고 있어요." to "I'm reading a book about Korea.",
            "한국 문화에 대한 관심이 많아요." to "I have a lot of interest in Korean culture.",
            "그 영화는 사랑에 대한 이야기예요." to "That movie is a story about love.",
            "한국어에 대한 질문이 있어요." to "I have a question about Korean.",
            "한국에 대해서 알고 싶어요." to "I want to know about Korea.",
            "한국 음식에 대해서 공부하고 있어요." to "I am studying about Korean food.",
            "그 사람에 대해서 잘 몰라요." to "I don't know much about that person.",
            "환경 문제에 대해서 이야기해 봅시다." to "Let's talk about environmental problems.",
            "이 영화에 대해서 어떻게 생각해요?" to "What do you think about this movie?"
        )
    )
}