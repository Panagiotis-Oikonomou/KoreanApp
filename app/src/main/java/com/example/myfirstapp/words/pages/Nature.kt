package com.example.myfirstapp.words.pages

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.WordsLayout

@Composable
fun Nature(){
    WordsLayout(
        title = "Nature",
        words = listOf(
            "Air" to "공기",
            "Branch" to "가지",
            "Cliff" to "절벽",
            "Desert" to "사막",
            "Forest" to "숲",
            "Galaxy" to "은하수",
            "Glacier" to "빙하",
            "Ground" to "땅",
            "Hill" to "언덕",
            "Island" to "섬",
            "Lake" to "호수",
            "Leaf" to "잎",
            "Valley" to "계곡",
        )
    )
}