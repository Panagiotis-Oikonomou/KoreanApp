package com.example.myfirstapp.grammar.solo

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun PastExperience() {
    LearningPage(
        title = "Past Experience",
        description = "This grammar point is used to indicate whether you have experienced or done something in the past, or if you have not experienced it. It's the same with using 봤다 auxiliary verb.",
        structure = listOf(
            "Verb stem-ㄴ/은 적이 있다/없다"
        ),
        examples = listOf(
            "그 빵을 먹은 적이 있어요.\n그 빵을 먹어본 적이 있어요." to "I have eaten that bread before.",
            "그 회사에서 일한 적이 없어요.\n그 회사에서 일해본 적이 없어요." to "I have not worked at that company before."
        )
    )
}