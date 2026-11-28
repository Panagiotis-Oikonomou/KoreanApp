package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun DaMyeonseo() {
    LearningPage(
        title = "Quoting Someone's Words or Instructions",
        description = "This grammar is used to repeat or refer to something someone said, often when reminding someone of what they said,"
                    + " expressing surprise or disbelief about what someone said, confirming information that you heard from someone or pointing out a contradiction between someone's words and actions."
                    + " It can translate as \"I hear that ~\" or \"Is that true?\".",
        structure = listOf("Verb-ㄴ/는다면서", "Adjective-다면서", "Noun(이)라면서"),
        examples = listOf(
            "내일 시험이 있다면서요?" to "I heard you have an exam tomorrow.",
            "안 먹는다면서 왜 먹어요?" to "You said you wouldn't eat it, so why are you eating it?",
            "내일 한국에 간다면서요?" to "I heard you're going to Korea tomorrow, right?",
            "오늘 바쁘다면서 왜 여기 있어요?" to "You said you were busy today, so why are you here?",
            "공부한다면서 왜 안 해요?" to "You said you were going to study, so why aren't you?",
            "친구라면서 왜 이름을 몰라요?" to "You said he was your friend, so why don't you know his name?"
        )
    )
}