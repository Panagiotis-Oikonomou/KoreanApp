package com.example.myfirstapp.grammar.solo

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun IndirectQuestion() {
    LearningPage(
        title = "Expressing your Opinion",
        description = "This grammar point is used to express the idea of \"whether\" or \"if\", and it typically appears in contexts where you're talking about something uncertain or questioning whether something happens or is the case. In the end you add some \"special verbs\" to complete the expression like (알다, 모르다, 알고 싶다, 궁금하다, 물어보다 etc).",
        structure = listOf(
            "(1)Present tense: Verb stem-는지 + [sv]\n(2)Present tense: Adjective stem-ㄴ/은지 + [sv]\n(3)Present tense: Noun stem + 인지 + [sv]",
            "(4)Past tense: Verb/Adjective-았/었는지 + [sv]\n(5)Past tense: Noun Past-이었/였는지 + [sv]",
            "(6)Future tense: Verb stem-ㄹ/을지 + [sv]"
        ),
        examples = listOf(
            "(1)지수가 한국어를 하는지 알아요?" to "Do you know if Jisoo speaks Korean?",
            "(1)지수가 몇 시에 일어나는지 궁금해요." to "I am curious when Jisoo wakes up.",
            "(2)한국어가 얼마나 어려운지 궁금해요." to "I am curious how difficult Korean is.",
            "(2)지수가 요즘 바쁜지 모르겠어요." to "I am not sure if Jisoo is busy these days.",
            "(3)은행이 어디인지 아세요?" to "Do you know where the bank is?",
            "(4)엄마가 젊었을 때 얼마나 예뻤는지 알아요?" to "Do you know how pretty my mom was when she was young?",
            "(4)우리 누나가 언제 도착했는지 알고 싶어요." to "I want to know when my sister arrived.",
            "(5)저 사람이 누구였는지 기억나요?" to "Do you remember who that person was?",
            "(6)아빠가 뭐를 가져올지 잘 모르겠어요." to "I am not sure what dad will bring",
            "(6)승자가 누구일지 잘 모르겠어요." to "I am not sure who the winner will be.",
            "(6)내일 비가 올지 잘 모르겠어요." to "I am not sure if it will rain tomorrow.",
        )
    )
}