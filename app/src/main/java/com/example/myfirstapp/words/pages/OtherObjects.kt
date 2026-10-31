package com.example.myfirstapp.words.pages

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.WordsLayout

@Composable
fun OtherObjects(){
    WordsLayout(
        title = "Other Objects",
        words = listOf(
            "Iron" to "다리디",
            "Key" to "열쇠",
            "Ladder" to "사다리",
            "Mop" to "대걸래",
            "Toothbrush" to "칫솔",
            "Towel" to "수건",
            "Charger" to "충전기",
            "Parachute" to "낙하산",
        )
    )
}