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
fun InQuotQuest() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(text = "Indirect Quotation for Questions Ending", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf(
            "Present tense:", "Verb/Adjective stem + 냐고 묻다, 물어보다 -> 냬\n",
            "Past tense:", "Verb/Adjective/이다 + 았/었냐고 묻다, 물어보다 -> 냬\n",
            "Future tense:", "Verb/Adjective/이다-ㄹ/을 거냐고 묻다, 물어보다 -> 냬"
        ))
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(listOf(
            "지수가 저한테 한국음식을 좋아하냬요." to "Jisoo asked if I liked Korean food.",
            "엄마가 시험을 잘 봤냬요." to "Mom asked if I did well on the test.",
            "아빠는 제가 몇 시에 올 거냬요." to "Dad asked at what time I'll come home."
        ))

        Spacer(modifier = Modifier.height(16.dp))
    }
}