package com.example.myfirstapp.words.pages

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.WordsLayout

@Composable
fun Weather(){
    WordsLayout(
        title = "Weather",
        words = listOf(
            "Climate" to "기후",
            "Cloud" to "구름",
            "Drought" to "가뭄",
            "Earthquake" to "지진",
            "Flood" to "홍수",
            "Fog" to "안개",
            "Humidity" to "습도",
            "Lightning" to "번개",
            "Rainbow" to "무지개",
            "Star" to "별",
            "Sun" to "태향 / 해",
            "Temperature" to "온도",
            "Wind" to "바람"
        )
    )
}