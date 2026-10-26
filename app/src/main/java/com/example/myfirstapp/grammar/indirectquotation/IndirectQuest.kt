package com.example.myfirstapp.grammar.indirectquotation

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
fun IndirectQuest() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(
            text = "Indirect Quotation for Questions",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))
        Text( text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf(
            "Present tense:",
            "Verb/Adjective stem + 냐고 묻다, 물어보다\n",
            "Past tense:",
            "Verb/Adjective/이다-았/었냐고 묻다, 물어보다\n",
            "Future tense:",
            "Verb/Adjective/이다-ㄹ/을 거냐고 묻다, 물어보다"
        ))
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Examples",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "지수가 한국인이냐고 물어봤어요." to "I asked if Jisoo is Korean.",
                "친구한테 왜 집이 안 갔냐고 물어봤어요." to "I asked my friend why he didn't go home.",
                "지수한테 뭘 마실 거냐고 물어봐요." to "I asked Jisoo what she would drink."
            )
        )

        Text(
            text = "ㄴ/은지 indirect question vs 냐고",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "The first one can be followed by many other vers like: 알다, 모르다, 생각하다, 기억하다, etc.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "The second one is mostly followed by 묻다, 물어보다",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}