package com.example.myfirstapp.grammar.particles

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Boda() {
    LearningPage(
        title = "-보다 particle",
        description = "-보다 is used to compare two things, similar to \"than\" in English to mean more or less. You need to use 더 for more and 덜 for less. Omitting 더 still conveys the same meaning for more, because 보다 already implies comparison it doesn't work with 덜."
        + "When you are pairing and with and usually these are omitted. When you are using adverbs other than those two, they cannot be omitted.",
        examples = listOf(
            "누나보다 내가 키가 더 커요." to "I'm taller than my older sister.",
            "내일이 오늘보다 추울 거예요." to "Tomorrow will be colder than today.",
            "커피보다 차를 덜 좋아해요." to "I like tea less than coffee.",
            "택시보다 지하철이 더 빨라요." to "The subway is faster than a taxi.",
            "한국어는 일본어보다 더 어려운 것 같아요." to "Korean seems harder than Japanese.",
            "이 옷은 저 옷보다 덜 비싸요." to "This outfit is less expensive than that one.",
            "어제보다 덜 많이 먹었어요." to "I ate less than yesterday.",
            "저는 작년보다 더 열심히 공부해요." to "I studied harder than last year."
        )
    )
}