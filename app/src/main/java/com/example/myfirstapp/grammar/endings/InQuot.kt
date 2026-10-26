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
fun InQuot() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(text = "Indirect Quotation Ending", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "This grammar point is used in informal speech to report or relay what someone else has said, heard, or is thinking. It's essentially a way to express indirect speech, often used in conversations to explain or share what another person thinks, believes, or has said. It's the abbreviated form of the Indirect Quotation.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf(
            "Present tense:", "Verb stem-ㄴ/는다고 했다 -> ㄴ/는대", "Adjective stem + 다고 했다 -> 대", "Noun + (이)라고 했다 -> (이)래\n",
            "Past tense:", "Verb/Adjective/이다 + 았/었다고 했다 -> 대\n",
            "Future tense:", "Verb/Adjective/이다-ㄹ/을 거라고 했다 -> 래"
        ))
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(listOf(
            "제주도가 예쁘대요." to "I hear that Jeju island is pretty.",
            "한국에서 망고가 비싸대요." to "I hear that in Korea mangoes are expensive.",
            "은지가 스무 살이래요." to "Eunji said she is 20 years old.",
            "엄마는 제가 노래를 못 한대요." to "Mom said I am a terrible singer.",
            "아빠가 한 시간 후에 잘 거래요." to "Dad said he will go to sleep an hour later.",
        ))

        Spacer(modifier = Modifier.height(16.dp))
    }
}