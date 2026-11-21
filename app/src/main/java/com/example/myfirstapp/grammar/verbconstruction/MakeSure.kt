package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun MakeSure() {
    LearningPage(
        title = "Please Make Sure to... / Try to...",
        description = "This grammar is used to give advice, instructions, recommendations, or polite commands."
                    + "In English, it can mean \"Please make sure to...\", \"Try to...\", \"Be sure to...\" or \"Please do...\"."
                    + "It is commonly used by teachers, doctors, parents, and people giving instructions.",
        structure = listOf("Verb-도록 하세요"),
        examples = listOf(
            "매일 한국어를 공부하도록 하세요." to "Please make sure to study Korean every day.",
            "건강을 위해서 매일 운동하도록 하세요." to "Please make sure to exercise every day for your health.",
            "내일은 늦지 않도록 일찍 오도록 하세요." to "Please make sure to come early tomorrow so that you're not late.",
            "길을 건널 때 조심하도록 하세요." to "Please be careful when crossing the street.",
            "다음 주까지 이 책을 읽도록 하세요." to "Please make sure to read this book by next week."
        )
    )
}