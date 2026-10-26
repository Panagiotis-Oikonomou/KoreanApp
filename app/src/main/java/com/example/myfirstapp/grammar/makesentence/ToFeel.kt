package com.example.myfirstapp.grammar.makesentence

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun ToFeel() {
    LearningPage(
        title = "To Feel someway",
        description = "This grammar point is used to express that something feels a certain way or that you feel a particular emotion or impression based on an adjective. Using a verb is used to express that you feel a certain way about an action or get the feeling that something is happening or will happen.",
        structure = listOf("Verb stem-는 마음이 들다", "Adjective stem-ㄴ/은 마음이 들다"),
        examples = listOf(
            "슬픈 마음이 들어요." to "I feel sad.",
            "그 사람은 항상 친절한 마음이 들어요." to "I feel that person is always kind.",
            "그는 자꾸 나를 도와주는 마음이 들어요." to "I feel like he keeps helping me.",
            "후회하는 마음이 들어요." to "I feel regretful."
        )
    )
}