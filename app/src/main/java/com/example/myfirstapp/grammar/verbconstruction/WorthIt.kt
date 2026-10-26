package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun WorthIt() {
    LearningPage(
        title = "Worth it",
        description = "This grammar pattern is used to express that something is worth doing or deserves to be done."
                +"It often implies moderate praise — e.g., not amazing, but good enough to try."
                +"Often used in recommendations or reviews.",
        structure = listOf(
            "Verb-ㄹ/을 만하다"
        ),
        examples = listOf(
            "이 영화는 정말 볼 만해요." to "This movie is really worth watching.",
            "이 식당은 한 번 가볼 만해요." to "This restaurant is worth visiting at least once.",
            "이 정도 상처는 참을 만해요." to "This level of pain is bearable."
        )
    )
}