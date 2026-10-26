package com.example.myfirstapp.layouts

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun ShowingNumbers(num: List<String>) {
    for (i in num.indices){
        Text(
            text = "${i + 1}. ${num[i]}",
            fontSize = 16.sp
        )
    }
}
