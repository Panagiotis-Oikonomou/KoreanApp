package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Recommendation() {
    LearningPage(
        title = "Suggestion, gentle Recommendation",
        description = "This grammar pattern is used to make suggestions or gentle recommendations, somewhat like saying: \"Why don't you?\", \"How about?\". It carries a friendly, soft, and conversational tone, and it's commonly used when giving advice or proposing an idea.",
        structure = listOf("Verb stem + 지 그래"),
        examples = listOf(
            "너무 피곤해 보여. 좀 쉬지 그래요?" to "You look really tired. Why don't you take a rest?",
            "그 영화 재미있대. 같이 보지 그래요?" to "They say that movie is fun. Why don't we watch it together?",
            "배고프면 뭐 좀 먹지 그래요?" to "If you're hungry, why don't you eat something?"
        )
    )
}