package com.example.myfirstapp.words.pages

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.WordsLayout

@Composable
fun Animals(){
    WordsLayout(
        title = "Animals",
        words = listOf(
            "Ant" to "개미",
            "Crab" to "게",
            "Crane" to "두루미",
            "Crow" to "까마귀",
            "Deer" to "사슴",
            "Eagle" to "독수리",
            "Eel" to "장어",
            "Elephant" to "코끼리",
            "Frog" to "개구리",
            "Gator" to "악어",
            "Giraffe" to "기린",
            "Goose" to "거의",
            "Hippo" to "하마",
            "Jaguar" to "표범",
            "Lobster" to "대게",
            "Magpie" to "까치",
            "Raccoon" to "너구리",
            "Rhinoceros" to "코뿔소",
            "Seal" to "물개",
            "Ostrich" to "타조",
            "Owl" to "부엉이",
            "Octopus" to "문어",
            "Zebra" to "얼룩말",
        )
    )
}