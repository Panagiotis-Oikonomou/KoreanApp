package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun AssumptionSkill() {
    LearningPage(
        title = "Assumption, Skill or Ability",
        description = "The first grammar point means \"to know how to [do something]\" or \"to be able to [do something]\". It expresses ability or knowledge about how to do something. The second grammar point has two meanings:\n" +
                "a. I knew that would happen (I knew it, stress the 알았다, it works only with future tense)\n" +
                "b. I thought that would happen (but it turns out not)",
        structure = listOf(
            "(1)Verb stem-ㄹ/을 줄 알다",
            "(2)Present Tense\nVerb/Adjective,이다-는, ㄴ/은, 인 줄 알았다/몰랐다",
            "(2)Past Tense\nVerb/Adjective/이다-ㄴ/은, 인 줄 알았다/몰랐다",
            "(2)Future Tense\nVerb/Adjective/이다-ㄹ/을 줄 알았다/몰랐다"
        ),
        examples = listOf(
            "먹을 줄 알았어요." to "I knew you would eat it.",
            "너무 어려 보여서 학생인 줄 알았어요." to "You look so young so I thought you were a student.",
            "한글을 배울 때는 한국어가 쉬운 줄 알았어요." to "When I was learning 한글, I thought Korean is easy",
            "너무 맛있어서 전무 요리사가 만든 줄 알았어요." to "It's so delicious so I thought that a professional chef made it.",
            "오늘 비가 올 줄 몰랐어요." to "I didn't know it would rain today.",
            "오늘 비가 오는 줄 몰랐어요." to "I didn't know it is raining now.",
            "배 고픈 줄 몰랐어요." to "I didn't know you were hungry."
        )
    )
}