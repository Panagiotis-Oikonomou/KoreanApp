package com.example.myfirstapp.words.pages

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.WordsLayout

@Composable
fun BodyParts(){
    WordsLayout(
        title = "Countries",
        words = listOf(
            "Abs" to "복근",
            "Ankle" to "발목",
            "Arm" to "팔",
            "Back" to "등",
            "Beard" to "수염",
            "Cheek" to "볼",
            "Chin" to "턱",
            "Elbow" to "팔꿈치",
            "Thigh" to "허복지",
            "Waist" to "허리",
        )
    )
}