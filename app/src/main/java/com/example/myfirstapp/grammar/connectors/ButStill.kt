package com.example.myfirstapp.grammar.connectors

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun ButStill() {
    LearningPage(
        title = "그래도 conjunction",
        description = "그래도 is used to mean \"but still\", \"even if\" or \"regardless\". It's often used to indicate that something is true or continues to be the case despite a previous statement or expectation.\n" +
                "\n" +
                "You can use it just as 그래도 or the short version below.",
        structure = listOf(
            "Present tense: Present stem + 도",
            "이다: (1)이어도/여도 (2)이라도/라도\n",
            "The (2) is used more in spoken Korean."
        ),

        examples = listOf(
            "비가 와 그래도 기분이 좋아요." to "It's raining but still my mood is good.",
            "배가 안 불러도 그만 먹어요." to "Even if you are not full, stop eating.",
            "천재라도 이 문제는 못 풀 거예요." to "Even if you are a genius you won't solve this problem."
        )
    )
}