package com.example.myfirstapp.words.pages

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.WordsLayout

@Composable
fun Organs(){
    WordsLayout(
        title = "Countries",
        words = listOf(
            "Blood" to "혈액 / 피",
            "Brain" to "뇌",
            "Heart" to "심장",
            "Intestines" to "장",
            "Kidney" to "신장",
            "Liver" to "간",
            "Lung" to "폐",
            "Muscle" to "근육",
            "Spleen" to "비장",
            "Organ" to "장기",
            "Pancreas" to "췌장",
        )
    )
}