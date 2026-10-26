package com.example.myfirstapp.grammar.makesentence

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
fun DeoniVsaeoDeoni() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(14.dp)
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "더니 vs 았/었더니", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Description 더니", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "This grammar point is used with both verbs and adjectives and it connects two observations "
                    +"the first is something from the past and the second is a related result or contrast for 2nd or 3rd person."
                    +"The subject or topic should be the same, sometimes it can be used with 1st person if speaking about yourself in a more objective or observational way.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Verb stem + 더니"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "지수가 어렸을 때 음악을 좋아하더니 지금 유명한 가수가 돴네요." to "Jisoo since her childhood she liked music, now she has become a famous singer.",
                "작년 여름은 엄청 덥더니 이번 여름은 꽤 괜찮네요." to "It was really hot last summer, this summer is pretty okay.",
                "며칠 전부터 기츰을 하더니 결국 감기에 걸렸어요." to "I had been coughing for a few days, and eventually I caught a cold."
            )
        )

        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Description 았/었더니", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "This grammar point is for when (1) a speaker did or completed something, and as a result something happen."
                    +"The (2) second meaning is when the speaker did something, and noticed something afterwards, related to your intention or unrelated.."
                    +"The subject doesn't need to be the same.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Verb/Adj + 았/었더니"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "(1)꾸준히 운동했더니 건강해졌어요." to "I worked out consistently, and I got healthier.",
                "(1)매운 걸 먹었더니 배가 아파요." to "I ate something spicy and my stomach hurts.",
                "(1)한국 드라마 매일 봤더니 한국어가 많이 늘어요." to "I watched K-drama every day, and my Korean got better.",
                "(2)가게에 전화했더니/니까 아무도 안 받았어요." to "I called the store but no one answered.",
                "(2)선생님게 물어봤더니 모른다고 하셨어요." to "I asked the teacher, and she said she didn't know.",
                "(2)카페에 갔더니 문이 닫혔어요." to "I went to the caffe and the door was closed."
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}

