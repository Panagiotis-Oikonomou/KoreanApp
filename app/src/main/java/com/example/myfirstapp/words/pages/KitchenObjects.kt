package com.example.myfirstapp.words.pages

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.WordsLayout

@Composable
fun KitchenObjects(){
    WordsLayout(
        title = "Kitchen Objects",
        words = listOf(
            "Bowl" to "그릇",
            "Knife" to "칼",
            "Ladle" to "국자",
            "Plate" to "접시",
            "Trashcan" to "쓰레기동"
        )
    )
}