package com.example.myfirstapp.grammar.endings

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
fun NeunKeoya() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(text = "-거야 Ending", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "-거야 express explanation, emphasis, clarification, or even surprise.",
            fontSize = 16.sp
        )

        Text(text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Verb/Adjective/이다 stem-ㄴ/는 거야"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(listOf(
            "(dramatic effect)나 어제 공원은 지나고 있었거든 근데 곧 개가 갑자기 나 한테 오더니 나를 무는 거야." to "I was moving by the park but a big dog was running to me and bite me.",
            "(dramatic effect)늦잠을 갔는데 지각을 했어 근데 선생님이 너무 심하게 혼내는 거야." to "I overslept and didn't go to class and the teacher scold me."
        ))

        ConversationLayout(
            listOf("(emphasize)나 80점 받았어 합격 못했어요" to "I got 80 points. I didn't pass."),
            listOf("합격 최저 점수가 70점이야. 너 합격한 거예요." to "The lowest passing score is 70. You passed.")
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}