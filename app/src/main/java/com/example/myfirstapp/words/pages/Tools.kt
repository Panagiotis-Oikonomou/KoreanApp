package com.example.myfirstapp.words.pages

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.WordsLayout

@Composable
fun Tools(){
    WordsLayout(
        title = "Tools",
        words = listOf(
            "Axe" to "도끼",
            "Hammer" to "망치",
            "Nail" to "못",
            "Shovel" to "삽",
            "Wrench" to "렌치",
        )
    )
}