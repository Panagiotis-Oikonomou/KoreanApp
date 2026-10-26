package com.example.myfirstapp.grammar.causative

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun ToMakeVerbThree() {
    LearningPage(
        title = "To make someone verb(게 만들다)",
        description = "This grammar pattern is the same with -게 하다 but when it's used with a verb, it adds the nuance of forcing somebody/something being bound to happen inevitable.",
        structure = listOf("Verb/Adjective stem + 게 만들다"),
        examples = listOf(
            "선생님께서 학생들을 집에 가게 만들셨어요." to "The teacher \"forced\" the students to go home.",
            "나는 그 사람이 나를 사랑하게 만들 거예요." to "I will make him fall in love with me.",
            "이 책은 저를 열심히 공부하게 만들어요." to "This book cannot but make me study hard."
        )
    )
}