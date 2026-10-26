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
fun Neurago() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(text = "느라(고) conjunction", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "It is used to express a reason, you use it only with an action verb. -느라(고) it's used that action leads to an unexpectedly Negative Result.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Verb stem + 느라(고)"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "게임하느라 못 들었어요." to "I couldn't hear it because I was playing a game.",
                "음막을 듣느라 버스를 놓쳤어요." to "I was listening to music and this unexpectedly led me to miss the bus",
                "고등학교 때 공부하느라고 친구가 없어요." to "During high school I was studying so I didn't have friends(It wasn't my intention to not have friends).",
                "여행 겨획을 짜느라 친구 생일을 깜박했어요." to "I was busy planning for the trip that I forgot my friends birthday."
            )
        )

        ConversationLayout(
            listOf("비가 그쳤어요." to "The rain stopped."),
            listOf("그래? 영화에 집중하느라 몰랐어요." to "Oh yes? I was focused on the movie that i didn't realise.")
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}