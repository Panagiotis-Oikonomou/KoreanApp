package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Limitation() {
    LearningPage(
        title = "Limitation, Exclusiveness",
        description = "This grammar pattern emphasizes limitation or exclusiveness, that there is nothing else except that one thing."
                +"It minimizes, undermines a certain situation/quality or to humbly expresess your own situation/ability.",
        structure = listOf(
            "Noun-뿐이다",
            "Verb-ㄹ/을 뿐이다"
        ),
        examples = listOf(
            "지금은 기다릴 뿐이에요." to "Right now, all we can do is wait.",
            "돈이 없어서 구경만 할 뿐이에요." to "I have no money, so I'm just looking around.",
            "집에 저뿐이에요." to "There is only me at home."
        )
    )
}