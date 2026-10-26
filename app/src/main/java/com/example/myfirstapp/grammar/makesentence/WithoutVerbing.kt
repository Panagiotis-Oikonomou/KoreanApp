package com.example.myfirstapp.grammar.makesentence

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun WithoutVerbing() {
    LearningPage(
        title = "Without doing",
        description = "The grammar is used to say that someone does something without doing another action first. It can often be translated as \"without…\" or \"without having…\".",
        structure = listOf("Verb-지 않고서"),
        examples = listOf(
            "아침을 먹지 않고서 학교에 갔어요." to "I went to school without eating breakfast.",
            "공부하지 않고서 시험을 잘 볼 수 없어요." to "You can't do well on a test without studying.",
            "부모님에게 말하지 않고서 여행을 갔어요." to "I went on a trip without telling my parents.",
            "생각하지 않고서 대답하면 안 돼요." to "You shouldn't answer without thinking.",
            "준비하지 않고서 시작했어요." to "I started without preparing."
        )
    )
}