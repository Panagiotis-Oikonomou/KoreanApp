package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun GoingToDo() {
    LearningPage(
        title = "Going Somewhere to Do Something",
        description = "This grammar is used to express going somewhere with a specific purpose or intention."
                    + "In English, it means \"to go somewhere to do something\" or \"to go in order to do something\"."
                    + "This grammar is used with movement verbs such as, 가다, 오다, 다니다 etc.",
        structure = listOf("Verb-(으)러 가다"),
        examples = listOf(
            "공부하러 도서관에 가요." to "I go to the library to study.",
            "친구와 밥을 먹으러 식당에 가요." to "I go to a restaurant with my friend to eat.",
            "영화를 보러 영화관에 가요." to "I go to the cinema to watch a movie.",
            "한국어를 배우러 한국에 왔어요." to "I came to Korea to learn Korean."
        )
    )
}