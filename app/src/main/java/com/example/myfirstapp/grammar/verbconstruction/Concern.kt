package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Concern() {
    LearningPage(
        title = "Expressing concern",
        description = "This grammar point expresses concern or fear about a possible future situation or outcome. It's often used when imagining possible negative outcomes.",
        structure = listOf("Verb stem-ㄹ/을까봐 걱정되다"),
        examples = listOf(
            "비가 올까봐 걱정돼요." to "I'm worried it might rain",
            "사람들이 나를 이상하게 볼까봐 걱정돼." to "I'm worried people might think I'm weird.",
            "늦을까봐 걱정됐어요." to "I was worried I might be late."
        )
    )
}