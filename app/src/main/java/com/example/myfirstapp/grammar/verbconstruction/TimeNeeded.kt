package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun TimeNeeded() {
    LearningPage(
        title = "Time Needed to Do Something",
        description = "This grammar means to take time to do something.",
        structure = listOf("Verb-는 데에 [duration]이/가 걸리다"),
        examples = listOf(
            "서울에서 부산까지 가는 데에 3시간이 걸려요." to "It takes three hours to get from Seoul to Busan.",
            "이 일을 끝내는 데에 며칠이 걸릴 거예요." to "It will take several days to finish this work.",
            "학교에 가는 데에 30분이 걸려요." to "It takes 30 minutes to go to school.",
            "집을 청소하는 데에 3시간이 걸렸어요." to "It took three hours to clean the house."
        )
    )
}