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
fun Neunde() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(text = "-ㄴ/는데 Ending", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "-ㄴ/는데 is used to give background info before the main point. You can use it to respond to what is contrary to your thoughts. It can also be used when you have to say or to imply that what I said is not the end of the conversation, and I'm expecting the other person's response or action.",
            fontSize = 16.sp
        )

        Text(text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Verb/Adjective/이다-ㄴ/는데"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(listOf("저는 한국인데 김치를 제일 좋아해요." to "I'm Korean and I like kimchi the best."))

        ConversationLayout(
            listOf("너 미국 사람이잖아." to "You are American."),
            listOf("아닌데요. 저 캐나다 사람인데요?" to "No. I am Canadian.")
        )

        ExamplesLayout(listOf("그거 제 건데요." to "That's mine. (You are expecting the other person to give whatever was yours)"))

        ConversationLayout(
            listOf("오늘 날씨 좋은데요." to "The weather is nice today. (You are expecting some sort of response)"),
            listOf("네 그러네요." to "Yes, it is.")
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}