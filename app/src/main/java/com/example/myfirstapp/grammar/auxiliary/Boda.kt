package com.example.myfirstapp.grammar.auxiliary

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
fun Boda() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(text = "-보다 Auxiliary Verb", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))

        Text( text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "The 보다 auxiliary is used in three ways:", fontSize = 16.sp)
        Text(text = "(1) to tell someone to try or attempt something.", fontSize = 16.sp)
        Text(
            text = "(2) to say that someone has ever done or tried something or to ask if someone has done something (usually in the past).",
            fontSize = 16.sp
        )
        Text(
            text = "(3) to make a command sound less strong and demanding (not necessarily a request, but more of a softer command/encouragement/suggestion).",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text( text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Verb-아/어 + 보다"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))
        ExamplesLayout(
            listOf(
                "(1)이 게임을 제미있으니까요. 너도 한 번 해봐요." to "This game is fun so try playing too.",
                "(1)이 빵을 내가 만들었어요. 먹어봐요." to "I made this bread. Try eating it.",
                "(2)한국에 두 번 가봤어요." to "I've been to Korea twice before.",
                "(2)여태까지 실수를 많이 해봤어요." to "I've made many mistakes so far."
            )
        )

        ConversationLayout(
            listOf("아직도 사장님이 안 오시네요." to "I see that the boss hasn't come yet."),
            listOf("(3)조금만 더 기다려보세요. 곧 오실 거예요." to "Wait just a little bit more. He will come soon.")
        )

        ExamplesLayout(listOf("(3)집에서 냄새가 나면 창문을 열어보세요." to "If it smells at home do open the window."))

        Spacer(modifier = Modifier.height(16.dp))
    }
}