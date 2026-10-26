package com.example.myfirstapp.grammar.solo

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Anything() {
    LearningPage(
        title = "How to say Anything, Anybody, Nothing, Nobody",
        structure = listOf(
            "(1)Any Noun: 아무 + Noun\n(2)Any Noun (in a sentence): 아무 + Noun + (이)나",
            "(3)Anything: 아무거나\n(4)Anyone/Anybody: 아무나",
            "(5)Nothing: 아무것도 + negative verb\n(6)No one/Nobody: 아무도 + negative verb",
            "(7)아무거나/아무나 + negative verb"
        ),
        examples = listOf(
            "(2)아무옷이나 입어도 돼요." to "You can wear any clothes.",
            "(3)아무거나 마실 수 있어요." to "I can drink anything.",
            "(4)아무나 한국어를 배울 수 있어요." to "Anyone can learn Korean.",
            "(5)엄마가 아무것도 안 줬어요." to "I didn't get anything from my mom.",
            "(5)아무걱정도없어요. / 안 해 요." to "I don't have any worries.",
            "(6)아무도 초대하지 않았어요." to "I didn't invite anyone.",
            "(7)저는 아무노래나 안 들어요." to "I don't listen to any songs.",
            "(7)아무거나 사지 마세요. 필요한 곳만 사세요." to "Don't buy just anything. Only buy what you need."
        )
    )
}