package com.example.myfirstapp.grammar.solo

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun SeoVsJi() {
    LearningPage(
        title = "겠어 vs 겠지",
        description = "-겠어 can mean assumption, intention or prediction. On the other hand -겠지 can mean soft assumption or guessing.",
        examples = listOf(
            "내일 비가 오겠어요." to "It looks like it will rain tomorrow. (prediction)",
            "내일 비가 오겠지." to "I guess it'll rain tomorrow. (soft prediction)",
            "배가 고프겠어요." to "You must be hungry. (assumption)",
            "이제 그만해야겠어요." to "I should stop now. (intention/decision)"
        )
    )
}