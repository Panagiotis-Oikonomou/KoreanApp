package com.example.myfirstapp.grammar.solo

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
fun TimeDate() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(
            text = "Time and Date",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Date Structure",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "year/month/day",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "이천이십사년 오월 칠일." to "2024 May 7",
                "저는 04년 생이에요." to "I was born at 04."
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Time Structure",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "hour (pure korean numbers) 시 : minute(sino korean numbers) 분, (오전:am  오후:pm)",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(
            listOf(
                "12:10 -> 열두시 : 십분",
                "3:15 -> 세시 : 십오분",
                "5:30 -> 다섯시 : 삼십분 /반",
                "11:50 -> 열한시 : 오십분",
                "12:55 -> 열두시 : 오십오분"
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Time Duration",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(
            listOf(
                "1 hour -> 한 시간",
                "2 hours -> 두 시간",
                "23 hours -> 이십삼 시간"
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "for over 20 hours you can use sino korean number system and for over 100 hours only sino",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Minute Duration",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(
            listOf(
                "10 minutes -> 십 분",
                "24 minutes -> 이십사 분",
                "30 minutes -> 삼십 분"
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Together",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(
            listOf(
                "1 hour and 56 minutes -> 한 시간 오십육 분",
                "27 hours and 44 minutes -> 이십칠 시간 사십사 분",
                "8 hours and 30 minutes -> 여덟 시간  삼십 분 /반"
            )
        )

        Text(
            text = "You can use 반 because you also talk about hours",
            fontSize = 16.sp
        )
        Text(
            text = "한 시간 동안 -> for an hour",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}