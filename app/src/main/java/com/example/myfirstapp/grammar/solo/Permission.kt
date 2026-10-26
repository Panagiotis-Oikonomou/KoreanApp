package com.example.myfirstapp.grammar.solo

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Permission() {
    LearningPage(
        title = "Giving and Asking Permission/Prohibition",
        description = "-도 돼 is used to express permission or asking for permission.  -도 안 돼 is used to express prohibition or that it doesn't work even if you verb. -(으)면 돼 is used to express that something is enough or is all you need to do in order to achieve a particular result or solve a problem. -(으)면 안 돼 is used to express prohibition or to say that something is not allowed or isn't okay to do. \n -(으)면 안 돼 is used for plead, suggestion (we)\n -도 돼 is used to ask something that you are really curious if that's allowed or not",
        structure = listOf(
            "Verb-아/어 + 도 돼", "Verb-아/어 + 도 안 돼",
            "Verb stem + (으)면 돼", "Verb stem + (으)면 안 돼"
        ),
        examples = listOf(
            "공부를 많이 안 해도 돼요." to "It's okay not to study too much.",
            "엄마, 오늘 조금 늦게 자도 돼요?" to "Mom is it okay for me to sleep a little late today?",
            "이 컴퓨터는 고쳐봐도 안 돼요." to "As for this computer even if I try to fix it, it doesn't work.",
            "저희 동네에서는 밤에 떠들어도 안 돼요." to "It's not allowed to raise an animal in my neighborhood.",
            "그 고객한테 내일까지 이매일을 보내시면 돼요." to "You can send that customer an email by tomorrow.",
            "오늘 피자 먹으면 안 돼요?" to "Can I eat pizza today?",
        )
    )
}