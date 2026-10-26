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
fun Deunji() {
    Column(
        modifier = Modifier
        .fillMaxSize()
        .background(MyBackground)
        .verticalScroll(rememberScrollState())
        .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(
            text = "Extra Anything",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Structure",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("A. Question Word + 든지= -ever"))

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(
            listOf(
                "B. Verb stem + 든지",
                "1. or (listing possible choices) = -거나",
                "2. whether (usually in the context of something not being important)"
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(
            listOf(
                "뭐든지: whatever, anything",
                "어디든지: wherever, anywhere",
                "언제든지: whenever, anytime",
                "누구든지: whoever, anyone",
                "어떻게든지: however, anyhow"
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "With -거나 it's like \"I don't really care\", but with -든지 is more polite.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Examples",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "뭐든지 할 수 있어요." to "I can do anything.",
                "(1)휴일에는 집에서 쉬든지 밖에서 친구들이랑 놀아요." to "On holidays, I get some rest at home or hung out with my friends outside.",
                "(2)내일 비가 오든지 회의는 그대로 진행될 거예요." to "Whether it rains tomorrow or not the meeting will still be hold."
            )
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}