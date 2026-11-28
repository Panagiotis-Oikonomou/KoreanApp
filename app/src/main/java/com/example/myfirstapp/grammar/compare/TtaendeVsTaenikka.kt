package com.example.myfirstapp.grammar.compare

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
import com.example.myfirstapp.layouts.ShowingNumbers
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun TtaendeVsTaenikka() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(text = "ㄹ/을테다 vs ㄹ/을 거다", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "A. -ㄹ/을테다", fontSize = 16.sp)
        ShowingNumbers(listOf(
            "Indicates a strong expectation or assumption about a future event or current situation",
            "Has a slightly weaker sense of certainty because it is used in speculation or expectation, not a firm plan"
        ))

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "B. -ㄹ/을 거다", fontSize = 16.sp)
        ShowingNumbers(listOf(
            "Indicates a future plan or intention",
            "Has a relatively stronger sense of certainty about the speaker's action or situation",
            "Rarely used with adjectives(it's hard to be sure about the features in the future)\n"
        ))

        Text(
            text = "It's most commonly used with conjunctions ㄴ/는데 -> ㄹ/을 텐데, (으)니까 -> ㄹ/을테니까.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(10.dp))

        ConversationLayout(
            listOf("이번 여름에 한국으로 여행할까?" to "Shall we travel to Korea this summer?"),
            listOf("너무 더울텐데 겨울에 가는 거 어때?." to "It'll (probably) be to hot. How about we go in winter?")
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Verb-있/었 -ㄹ/을 텐데 is used for assumptions about the past or completed actions \"must have\", \"would probably have\".",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(10.dp))

        ExamplesLayout(
            listOf(
                "그 소식을 듣고 많이 놀랐을텐데 괜찮아요?" to "You must have been really shocked to hear the news. Are you alright?"
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "-ㄹ/을 테니까 + imperative sentence, provides your assumption or intention as a reason for the next clause.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(10.dp))

        ExamplesLayout(
            listOf(
                "이따가 전화할 테니까 꼭 받아요." to "I will call you later, so make sure to answer.",
                "날씨가 추울 테니까 옷은 꼭 따뜻하게 입으세요." to "The weather will be cold, so make sure to dress warmly."
            )
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}