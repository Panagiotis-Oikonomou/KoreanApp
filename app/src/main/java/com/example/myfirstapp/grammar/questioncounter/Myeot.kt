package com.example.myfirstapp.grammar.questioncounter

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Myeot() {
    LearningPage(
        title = "Limitation, Exclusiveness",
        description = "\"몇\" is a Korean word that primarily functions as an interrogative pronoun, meaning \"how many\".",
        examples = listOf(
            "몇 시에 만날 거예요?" to "What time are we meeting?",
            "그 사람은 몇 살이에요?" to "How old is that person?",
            "애완동물 몇 마리 키워요?" to "How many pets do you raise?"
        )
    )
}