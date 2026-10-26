package com.example.myfirstapp.grammar.indirectquotation
import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun IndirectQuot1() {
    LearningPage(
        title = "Indirect Quotation",
        description = "This grammar point is a quotative form, used when you're quoting or referring to what someone said or thinks — specifically for verbs.",
        structure = listOf(
            "Present tense:",
            "Verb stem-ㄴ/는다고 했다",
            "Adjective stem + 다고 했다",
            "Noun-(이)라고 했다\n",
            "Past tense:",
            "Verb/Adjective-았/었다고 했다",
            "Noun-이었/였다고 했다\n",
            "Future tense:",
            "Verb/Adjective-ㄹ/을 거라고 했다"
        ),
        examples = listOf(
            "엄마는 매일 약을 먹는다고 했어요." to "Mom said she takes medicine everyday.",
            "지수가 한국에 가고 싶다고 했어요." to "Jisoo said she wants to go to Korea.",
            "엄마는 아빠가 잠이 들었다고 했어요." to "Mom said that Dad had fallen asleep.",
            "지수가 앞으로 공부를 열심히 할 거라고 했어요." to "Jisoo said she will study hard from now on."
        )
    )
}