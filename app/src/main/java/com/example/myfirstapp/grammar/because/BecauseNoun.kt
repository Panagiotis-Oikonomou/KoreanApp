package com.example.myfirstapp.grammar.because

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun BecauseNoun() {
    LearningPage(
        title = "Because Noun",
        structure = listOf(
            "Noun + 이어서 (받침) / 여서 (no 받침)",
            "Noun + 이라서 (받침) / 라서 (no 받침)",
            "Noun + 때문에 / Noun + 덕문에\n",
            "Use 때문에 when blame or regret something, in an emotional context and 덕문에 when you want to express gratitude."
        ),
        examples = listOf(
            "오늘 내 생일이어서 / 생일이라서." to "Because it is my birthday today.",
            "그 사람 때문에 마음이 아파요." to "My heart hurts because of that person.",
            "전쟁 때문에 가족을 잃었어요." to "I lost my family because of the war.",
            "선생님 덕분에 합격했어요." to "I passed thanks to the teacher."
        )
    )
}