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
import com.example.myfirstapp.layouts.ConversationLayout
import com.example.myfirstapp.layouts.ExamplesLayout
import com.example.myfirstapp.layouts.StructureLayout
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun Kesseut() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(text = "Future Tense 1", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))

        Text( text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Verb/Adjective stem + 겠다/겠습니다"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "1 and 2 the -겠습니다 is used more but in 3 -겠어 is better.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "1. Firm will or Determination (subject I)",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))
        ExamplesLayout(
            listOf(
                "내일부터 술을 안 마시겠습니다." to "I will not drink starting from tomorrow.",
                "담배를 끊겠습니다." to "I will stop smoking."
            )
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "2. Conveying information that something is about to happen (usually in in formal situations)",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))
        ExamplesLayout(listOf("비행이가 곧 착륙하겠습니다." to "The plane will land soon."))

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "3. Guessing (it must be~)",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))
        ExamplesLayout(
            listOf(
                "그만 좀 하세요. 아기가 울겠어요." to "Please stop. The baby might cry.",
                "요즘 책을 쓰고 있죠? 바쁘시겠어요." to "You write a book these days right? You must be very busy."
            )
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "4. 겠어요?(Rhetorical question of something that's obviously not true)",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        ConversationLayout(
            listOf("지수씨 배 안 고파요?" to "Jisoo are you not hungry?"),
            listOf("아까 점심을 그렇게 많이 먹었는데 배가 고프겠어?" to "I had that much lunch but do you really think I would be hungry?")
        )

        ConversationLayout(
            listOf("지수가 제 선물을 안 받을 까봐 걱정돼요." to "I worry that Jisoo might not take the gift."),
            listOf("이렇게 좋은 선물을 누가 받겠어요?" to "Who wouldn't receive such a good gift?")
        )


        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "5. Question: Would you? (in a polite way)",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))
        ExamplesLayout(
            listOf(
                "주문하시겠어요." to "Would you order?",
                "어디 가시겠어요." to "Where would you like to go?"
            )
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}