package com.example.myfirstapp.words.pages

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.WordsLayout

@Composable
fun Cloths(){
    WordsLayout(
        title = "Cloths",
        words = listOf(
            "Glove" to "장갑",
            "Scarf" to "목도리",
            "Shorts" to "반바지",
            "Sweater" to "스웨터",
            "Necklace" to "목걸리",
            "Ring" to "반지"
        )
    )
}