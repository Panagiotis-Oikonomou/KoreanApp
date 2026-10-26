package com.example.myfirstapp.grammar.causative

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
import com.example.myfirstapp.layouts.StructureLayout
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun SuffixTwo() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(text = "Adding suffixes Descriptive verbs", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))

        Text( text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Causative verbs are used to indicate that the subject makes or lets someone do something. You actually do the action.", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(20.dp))

        Text( text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Descriptive Verb/Adjective + 이/리/히/기/우/추/구/시/애"))

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "It has the same rule as it is in the Passive", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "1. 넓다(to be wide/spacious) <> 넓히다(to widen)", fontSize = 16.sp)
        ExamplesLayout(
            listOf(
                "방이 넓어요." to "The room is spacious.",
                "외국어 공부는 제 사야를 넓혔어요." to "Studying a foreign language widened my horizons."
            )
        )

        Text(text = "2. 좁다(to be narrow/unspacious) <> 좁히다(to narrow sth down)", fontSize = 16.sp)
        ExamplesLayout(
            listOf(
                "방이 너무 좁아요." to "The room is too narrow.",
                "외견 차이를 좁히려면 대화가 필요해요." to "To narrow the gap of opinions, conversation is necessary."
            )
        )

        Text(text = "3. 늦다 <> 늦추다(to postpone/push back)", fontSize = 16.sp)
        ExamplesLayout(
            listOf(
                "늦어서 미안해요." to "I'm sorry for being late.",
                "회의 시간을 한 시간 늦출 수 있을까요?" to "Can we push back our meeting time by an hour?"
            )
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}