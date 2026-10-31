package com.example.myfirstapp.words.pages

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.WordsLayout

@Composable
fun Vegetables(){
    WordsLayout(
        title = "Vegetables",
        words = listOf(
            "Cabbage" to "양배추",
            "Carrot" to "당근",
            "Corn" to "옥수수",
            "Eggplant" to "가지",
            "Garlic" to "마늘",
            "Green onion" to "파",
            "Lettuce" to "양상추",
            "Mushroom" to "버섯",
            "Onion" to "양파",
            "Pumpkin" to "호박",
            "Vegetable" to "야채"
        )
    )
}