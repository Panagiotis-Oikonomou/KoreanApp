package com.example.myfirstapp.grammar.solo

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

@Composable
fun HeSheThey() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(14.dp)
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Extra Anything",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Description",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "In Korean \"he\" is often \"그\", \"she\" is \"그녀\" and \"they\" is \"그들\". However, these are more commonly used in writing or formal settings, and less so in everyday speech. In casual conversation, Koreans often use  the person's name or descriptive phrase like \"that person\" (그 사람) instead of pronouns. For more polite situations, they might use it like this (그 분). You can also use \"걔\" for \"that person\" out of your sight, \"얘\" for \"this person\" and \"쟤\" for \"that person\" within your sight. You add \"들\" in the end to make it into plural.\n",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Examples",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ConversationLayout(
            listOf("지수는 남자친구가 있어요. 걔 알아?" to "Jisoo has a boyfriend. Do you know him?"),
            listOf("응. 걔랑 같은 고등학교 다녔어요." to "Yes. I went to the same highschool with him.")
        )

        ExamplesLayout(
            listOf(
                "이 분은 우리 엄마에요." to "She is my mother.",
                "저 분 누구세요?" to "That person who is it?",
                "이 분들은 모두 친절해요." to "These people are my senior."
            )
        )

        ConversationLayout(
            listOf("지수가 어떻게 A를 받았어요?" to "How did Jisoo get an A?"),
            listOf("걔 공부(되게, 진짜, 매우) 열심히 했어요." to "She studied very hard.")
        )

        ExamplesLayout(
            listOf(
                "스미스씨는 제 이웃이에요." to "Mr.Smith is my neighbor.",
                "그 분은 되게 웃기세요.\n그 아저씨는 되게 웃기세요.\n스미스씨는 되게 웃기세요." to "He is very funny."
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}

