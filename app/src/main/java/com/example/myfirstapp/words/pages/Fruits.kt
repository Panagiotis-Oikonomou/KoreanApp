package com.example.myfirstapp.words.pages

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.WordsLayout

@Composable
fun Fruits(){
    WordsLayout(
        title = "Fruits",
        words = listOf(
            "Apricot" to "살구",
            "Fruit" to "과일",
            "Grapes" to "포도",
            "Nectarine" to "복숭아",
            "Pear" to "배",
            "Tangerine" to "귤",
            "Watermelon" to "수박"
        )
    )
}