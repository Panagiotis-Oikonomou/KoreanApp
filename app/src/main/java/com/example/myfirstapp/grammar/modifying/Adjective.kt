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
import com.example.myfirstapp.layouts.ShowingNumbers
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun Adjective() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(
            text = "Adjective-던",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "It can only mean this two:",
            fontSize = 16.sp
        )

        Text(
            text = "(2) Someone/something used to be adjective.",
            fontSize = 16.sp
        )

        Text(
            text = "(3) Someone/something has been adjective (up to the last time I remember).",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(10.dp))

        ExamplesLayout(listOf(
            "(3) 머리가 길던 여자가 버스 정류장에서 혼자 울고 있었어요." to "A girl with long hair was crying alone at the bus stop.",
            "(3) 어제 그 친절하던 아주머니 아니에요?" to "Aren't you that kind lady from yesterday?",
            "(2) 뚱뚱하던 아빠가 살이 많이 빠져서 지금은 날씬해요." to "My dad who used to be fat lost a lot of weight and now he's thin."
        ))
        Spacer(modifier = Modifier.height(16.dp))
    }
}