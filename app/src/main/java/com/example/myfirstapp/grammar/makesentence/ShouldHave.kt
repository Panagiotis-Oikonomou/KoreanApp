package com.example.myfirstapp.grammar.makesentence

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun ShouldHave() {
    LearningPage(
        title = "I Should Verb and I Have to Verb",
        description = "The first grammar point expresses the speaker's realization or intention to do something based on the current situation or reflection it is something like \"I should\" or \"I guess I have to\". The second grammar point describes a general obligation, rule, or requirement it can be used to mean \"I have to\".",
        structure = listOf("(1)Verb-아/어 야겠다 / 야되겠다", "(2)Verb-아/어 + 야 되다 / 야 하다"
        ),
        examples = listOf(
            "(1)냄새가 심해서 환기를 해야겠어요." to "It smells bad, so I should ventilate.",
            "(2)학생은 숙제를 해야 해요." to "Students have to do homework.",
            "(2)운전할 때 조심해야 돼요." to "You have to be careful when driving."
        )
    )
}