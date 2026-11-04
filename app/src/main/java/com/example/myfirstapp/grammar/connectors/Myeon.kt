package com.example.myfirstapp.grammar.connectors

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
fun Myeon() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(text = "그러면 conjunction", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "그러면 translates to \"then\" or \"in that case\" in English. It's often used when you're talking about what will happen next or suggesting a course of action, based on a previous statement."
                    + " It can also be used to express habitual actions or general truths, indicating that one condition consistently leads to a specific result.\n"
                    + "You can use it just as 그러면 or the short version below.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Present tense: Present stem + (으)면"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "많이 먹어 그러면 살이 쪄요." to "If you eat a lot then you will gain weight.",
                "일어나면 세수부터 해요." to "I wash my face first when I wake up.",
                "겨울이 되면 눈이 와요." to "When winter comes, it snows."
                )
        )

        ConversationLayout(
            listOf("티켓 얼마예요?" to "How much is the ticket?"),
            listOf("학생이면 1000원이고 성인이면 2000원이에요." to "If you are a student it's 1000won and if you are adult it's 2000won.")
        )

        Text(
            text = "You can also use it to suggest the next action when an action has already be completed."
                    + " For future it means if you are going to.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(10.dp))

        ExamplesLayout(
            listOf(
                "다 먹었으면 가자." to "If you're done eating, let's go.",
                "준비 다 했으면 이제 출발해요." to "If you're all ready, let's head out now.",
                "운동을 거면 스트레칭부터 하세요." to "If you are going to exercise, stretch first.",
                "책을 읽을 거면 조용한 곳에 가세요." to "If you are going to read a book go to a quite place."
                )
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}