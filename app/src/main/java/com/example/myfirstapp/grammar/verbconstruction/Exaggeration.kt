package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Exaggeration() {
    LearningPage(
        title = "Exaggeration",
        description = "This grammar pattern is an exaggerated way to express strong emotion about something, typically negative feelings — though not always fatal or serious.",
        structure = listOf("Verb-아/어 죽겠다/죽겠네"),
        examples = listOf(
            "배고파 죽겠다." to "I'm so hungry I could die.",
            "아파 죽겠어." to "It hurts to death. (It really hurts)"
        )
    )
}