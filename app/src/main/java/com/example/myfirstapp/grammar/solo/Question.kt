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
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun Question() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "How to Ask Questions",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "1. Sentence?",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "It's a direct question and you raise the pitch of your voice in the end",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "2. -습니까?",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "This word is used at the end of a verb or adjective to form a polite question. It's typically used in formal or respectful situations.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(listOf("그 사람은 압니까?" to "Do you know this person?"))

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = "3. -니 (반말)  -나요  -가요 (존댓말)",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "i. -니 is informal and is used with people you're familiar with, such as close friends or younger people.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "ii. -나요 is polite and is used when you want to ask someone in a respectful but not overly formal way. You might use it with people who are a little older or in more neutral settings.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "iii. -가요 is very polite and is often used with people you respect, such as elders, superiors, or in formal situations. Its common in everyday conversations when you're speaking politely but not excessively formal.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))


        Text(
            text = "4. -ㄹ/을까",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "-ㄹ/을까 is a verb ending that is used to express a suggestion or a question about the speaker's own action or a joint action with the listener.  It can be translated into English as \"shall we?\", \"I wonder if I should...\", or \"what if I...?\".",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(listOf("우리 영화 볼까요?" to "Shall we watch a movie?"))

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = "5. -지?",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "With -지 you express uncertainty or seek confirmation.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(listOf("그 사람은 한국 사람이었지?" to "That person was Korean, right?"))

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = "6. -래?",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "With -래 you suggest or offer someone to do something similar to \"would you like to\".",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(listOf("우리 영화 보러 갈래?" to "Do you want to go watch a movie?", "같이 점심 먹으러 갈래?" to "Do you want to go eat lunch together?"))

        Spacer(modifier = Modifier.height(16.dp))
    }
}