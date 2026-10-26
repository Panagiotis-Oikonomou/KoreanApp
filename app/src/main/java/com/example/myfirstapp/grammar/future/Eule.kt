package com.example.myfirstapp.grammar.future

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
import com.example.myfirstapp.layouts.StructureLayout
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun Eule() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(
            text = "Future Tense 3",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text( text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Verb stem-ㄹ/을 래"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Examples",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "1 is often interchangeable with verb + ㄹ/을 거예 (When the subject is I or we)",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "1. Informing your choice/decision (Subject: I, not so serious)",
            fontSize = 16.sp
        )
        ExamplesLayout(
            listOf(
                "나는 안 갈래요." to "I won't go (it's your decision).",
                "오늘 저녁 안 먹을래요." to "I won't eat dinner today."
            )
        )

        Text(
            text = "2. Invitation or Suggestion, (Would you like to/Do you want to verb?) \"Subject: you\"",
            fontSize = 16.sp
        )
        ExamplesLayout(
            listOf(
                "영화 볼래요?" to "Do you want to watch a movie?",
                "오늘은 집에서 쉴래요?" to "Do you want to take a rest at home today?"
            )
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}