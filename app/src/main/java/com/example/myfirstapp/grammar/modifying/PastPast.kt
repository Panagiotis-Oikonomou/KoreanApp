package com.example.myfirstapp.grammar.modifying

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstapp.layouts.ExamplesLayout
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun PastPast() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(
            text = "Verb/Adjective-았/었던",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "It can only mean this two:",
            fontSize = 16.sp
        )

        Text(
            text = "(1) Was the case in the past and not anymore (past state affairs).",
            fontSize = 16.sp
        )

        Text(
            text = "(2) Past event or actions that ended or was completed.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "(1) 여렸을 때 아주 작았던 지수가 지금 이렇게 컸네요.",
            fontSize = 16.sp
        )
        Text(
            text = "Jisoo, who used to be small, has grown this much now.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "The sentence indicates a past state of affairs that hasn't continued to the present.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        ExamplesLayout(listOf(
            "(1) 지난 번에 만났던 카페에서 또 만날까?" to "Shall we meet at the cafe we met last time?"
        ))
        Spacer(modifier = Modifier.height(2.dp))

        Text(
            text = "The sentence indicates that the action was already done in the past and does not continue now.",
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}