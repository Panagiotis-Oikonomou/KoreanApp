package com.example.myfirstapp.words.pages

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.WordsLayout

@Composable
fun Countries(){
    WordsLayout(
        title = "Countries",
        words = listOf(
            "Country" to "나라",
            "Australia" to "호주",
            "Germany" to "독일",
            "Thailand" to "태국"
        )
    )
}