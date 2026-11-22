package com.example.myfirstapp.grammar.compare

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun DalagoVsJulago() {
    LearningPage(
        title = "달라고 하다 vs 주라고 하다",
        description = "This grammar is used to tell someone to give something. 달라고 하다 is used to tell someone to give themselves(the asker) something. 주라고 하다 is used to tell someone to give the third party something.",
        structure = listOf("Verb-아/어 + 달라고 하다/주라고 하다"),
        examples = listOf(
            "엄마가 고양이한테 물을 주라고 했어요." to "Mom told me to give the cat some water.",
            "엄마가 물을 달라고 했어요." to "Mom told me to give her some water.",
            "엄마한테 이불을 바꿔 달라고 했어요." to "I told mom to change the blankets(for me, because it's my blanket).",
            "엄마가 저한테 남동생 숙제를 도와주라고 했어요." to "Mom told me to help my little brother with his homework."
        )
    )
}