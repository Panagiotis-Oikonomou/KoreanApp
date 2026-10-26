package com.example.myfirstapp.grammar.makesentence

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun VerbMankeum() {
    LearningPage(
        title = "만큼 with Verbs and Adjectives",
        description = "This grammar pattern shows the degree or extent of an action or state, often linking two related actions or descriptions by showing how much one affects or relates to the other.",
        structure = listOf("Verb/Adjective stem-ㄹ/을 만큼 + Verb"),
        examples = listOf(
            "배가 터질 만큼 먹었어요." to "I ate to the point my stomach might burst.",
            "필요할 만큼만 가져가세요." to "Take only as much as you need.",
            "한국 음식을 매일 먹을 만큼 좋아해요." to "I like Korean food so much that I have it everyday.",
            "원어민들과 대화할 수 있을 만큼 한국어 실력이 늘었어요." to "My Korean improved to an extent where I can converse with native speakers."
        )
    )
}