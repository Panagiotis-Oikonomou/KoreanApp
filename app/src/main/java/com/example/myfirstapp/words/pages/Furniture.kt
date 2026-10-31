package com.example.myfirstapp.words.pages

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.WordsLayout

@Composable
fun Furniture(){
    WordsLayout(
        title = "Furniture",
        words = listOf(
            "Bathtub" to "욕조",
            "Bookshelf" to "책장",
            "Closet" to "옷장",
            "Desk" to "책장",
            "Drawer" to "서랍",
            "Floor" to "바닥",
            "Refrigerator" to "냉장고",
            "Table" to "탁자",
            "Toilet" to "변기",
            "Washing machine" to "세탁기"
        )
    )
}