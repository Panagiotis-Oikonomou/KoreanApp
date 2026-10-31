package com.example.myfirstapp.words.pages

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.WordsLayout

@Composable
fun Family(){
    WordsLayout(
        title = "Family",
        words = listOf(
            "Aunt" to "나라",
            "Cousin" to "호주",
            "Father in law" to "",
            "Granddaughter" to "독일",
            "Grandparent" to "태국",
            "Grandson" to "",
            "Mother in law" to "",
            "Parent" to "",
            "Parents in law" to "",
            "Uncle" to ""
        )
    )
}