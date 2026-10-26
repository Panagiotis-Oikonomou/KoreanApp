package com.example.myfirstapp.grammar.because

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
import com.example.myfirstapp.layouts.ConversationLayout
import com.example.myfirstapp.layouts.ExamplesLayout
import com.example.myfirstapp.layouts.StructureLayout
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun Taemune() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(text = "Verb/Adjective-기 때문에", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf(
            "Present -> base stem + 기 때문이야 / 기 때문이에요",
            "Past -> past stem + 기 때문이야 / 기 때문이에요"
        ))

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        ConversationLayout(
            listOf("왜 성적이 좋아요?" to "Why is your grade so good?"),
            listOf("공부를 열심히 하기 때문이에요." to "Because I study hard.")
        )

        ConversationLayout(
            listOf("왜 F를 받았어요?" to "Why did you get an F?"),
            listOf("공부를 열심히 안 했기 때문이에요.요." to "Because I didn't study hard.")
        )

        ExamplesLayout(listOf("그분이 아팠기 때문에 병원에 갔어요." to "Because she was sick, she went to the hospital."))
        Spacer(modifier = Modifier.height(16.dp))
    }
}