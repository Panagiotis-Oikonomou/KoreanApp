package com.example.myfirstapp.grammar.causative

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun ToMakeVerbFour() {
    LearningPage(
        title = "To make someone verb(게 해주다)",
        description = "This grammar pattern is used to express the idea of helping someone to do something (indicates direct helpful effect), it is interchangeable with -게 도와주다 but indicates less proactive help in comparison. It can also be used to give permission from the causer to the causee or to use it when making a wish (-게 주세요).",
        structure = listOf("Verb/Adjective stem + 게 주다"),
        examples = listOf(
            "이 책은 너무 재미있어서 잠을 깨게 해줬어요." to "This book is so fun that it (directly helps with=) wakes me up.",
            "오늘 일을 다 끝내서 사장님이 제가 일찍 퇴근하게 해줬어요." to "I finished today's work, so my boss let me get off work early.",
            "꿈이 잘 보게 해주세요." to "Please make my dream come true."
        )
    )
}