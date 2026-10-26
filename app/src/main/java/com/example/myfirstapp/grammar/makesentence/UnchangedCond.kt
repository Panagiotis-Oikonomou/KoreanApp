package com.example.myfirstapp.grammar.makesentence

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun UnchangedCond() {
    LearningPage(
        title = "An unchanged condition",
        description = "This grammar pattern is used when one action happens while another state or condition remains unchanged. Indicates that a certain state or action is maintained, while another action happens.",
        structure = listOf(
            "Verb stem-ㄴ/은 채"
        ),
        examples = listOf(
            "신발을 신은 채 방에 들어왔어요." to "He came into the room with his shoes still on.",
            "옷을 입은 채 수영장에 뛰어들었어요." to "He jumped into the pool with his clothes still on.",
            "불을 켠 채로 나갔어요." to "I went out leaving the lights on."
        )
    )
}