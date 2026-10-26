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
fun Eulke() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(
            text = "Future Tense 2",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text( text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Verb stem-ㄹ/을 게 (Subject: I)"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Examples",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "1. Making a Promise",
            fontSize = 16.sp
        )
        ExamplesLayout(
            listOf(
                "내일 전화할게요." to "I'll call you tomorrow.",
                "이제부터 안 그럴게요." to "I won't be like that from now on."
            )
        )

        Text(
            text = "2. Informing someone what I'll do, usually right now or near future, to sound considerate",
            fontSize = 16.sp
        )
        ExamplesLayout(
            listOf(
                "잠시만 화징실 좀 다녀올게요." to "I will go to the bathroom for a while.",
                "지금 너무 피곤해서 좀 쉴게요. 이따가 얘기하자." to "I'm really tired now so I'm sorry. Let's talk later."
            )
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}