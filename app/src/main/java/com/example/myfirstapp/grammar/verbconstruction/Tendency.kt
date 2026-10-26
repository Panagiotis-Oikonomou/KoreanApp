package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Tendency() {
    LearningPage(
        title = "Tendency",
        description = "This grammar pattern is used to express tendency. You're not saying something is absolutely a certain way, but that it's generally or relatively like that. It's based on the speaker's perception.",
        structure = listOf(
            "Verb stem-는 편이다",
            "Adjective stem-은/ㄴ 편이다"
        ),
        examples = listOf(
            "운동을 자주 하는 편이에요." to "I tend to exercise often.(I'm not a total gym rat, but I work out more than average.)",
            "일을 빨리 끝내는 편이에요." to "I tend to finish work quickly.",
            "저는 부끄러움을 잘 타는 편이에요." to "I am getting shy really easily.(It's not always like that but it happens a lot)",
            "이 음식은 매운 편이에요." to "This food is rather spicy.(Maybe not the spiciest, but spicier than average.)"
        )
    )


}