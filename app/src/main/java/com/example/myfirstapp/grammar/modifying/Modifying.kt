package com.example.myfirstapp.grammar.modifying

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
fun Modifying() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(
            text = "Basic Modifying Form",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Description",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "The modifying form is used to change a verb or an adjective into a noun.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Structure",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        StructureLayout(
            listOf(
                "Present Tense:",
                "(1)Verb stem-는",
                "(2)Adjective stem-ㄴ/은",
                "(3)N + 이/가 있다, 없다 -> -는",
                "(4)Irregular Verbs -> -는\n",
                "Past Tense:",
                "(5)Verb stem-ㄴ/은, -던\n",
                "Future Tense:",
                "(6)Verb stem-ㄹ/을"
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Examples",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "(1)아마도 먹는 사람." to "A person who eats anything.",
                "(1)내가 너를 좋아하는 이유." to "The reason i like you.",
                "(2)행복한 여자." to "A happy woman.",
                "(2)작은 아기." to "A small baby.",
                "(2)아름다운 꽃." to "A beautiful flower.",
                "긴 머리." to "Long hair.",
                "(3)차가 있는 사람." to "A person who has a car.",
                "(3)끝이 없는 게임." to "A game that has no end.",
                "(4)우는 아기." to "A crying baby.",
                "(4)한국에 사는 외국인." to "Foreigners who live in korea.",
                "(5)그 영화를 본 사람." to "The person who saw the movie."
            )
        )

        Text(
            text = "(5)차가 있던 사람.",
            fontSize = 16.sp
        )
        Text(
            text = "The person who had a car.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "With words like 있다 or 없다 in Past Tense, you do not use ㄴ/은 but 던 or 았던/었던",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        ExamplesLayout(
            listOf(
                "(6)먹을 사람." to "The person who will eat.",
                "(6)공부할 사람." to "The person who will study."
            )
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}