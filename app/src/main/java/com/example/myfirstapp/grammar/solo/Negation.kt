package com.example.myfirstapp.grammar.solo

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Negation() {
    LearningPage(
        title = "Negation of Verbs and Adjectives",
        structure = listOf(
            "(1)General: 안 Verb / Verb-지 않다",
            "(2)Negation of 'Noun' + 하다 Verb: First Verb part + 안 하다 / Verb-지 않다",
            "(3)Negation of &quot;Noun + 하다&quot; Adjective: 안 Adjective / Adjective-지 않다",
            "(4)Separate Negation words: 있다 / 없다, 알다 / 모르다",
            "(5)이다 negation: Noun + 아니에요"
        ),
        examples = listOf(
            "(1)매운 음식을 안 먹어요. / 매운 음식을 먹지 않아요." to "I don't eat spicy food.",
            "(2)어제 운동 안 했어요. / 어제 운동하지 않았요." to "I didn't work out yesterday.",
            "(3)저는 별로 안 똑똑해요. / 저는 별로 똑똑하지 않아요." to "I am not that smart.",
            "(4)저는 양말이 없어요." to "I don't have socks.",
            "(4)저는 이 단어를 몰라요." to "I don't know this word.",
            "(5)저는 학생이 아니에요." to "I am not a student.",
        )
    )
}