package com.example.myfirstapp.grammar.makesentence

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
fun DagaVsaeoDaga() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(14.dp)
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "다가 vs 았/었다가", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Description 다가", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "This grammar point is usually used with verbs and it means that, (1)while you do A then an unexpected B happens."
                    +"The (2) second meaning stops action A before it completes and transitioning to B."
                    +"It is most natural when the subject in A, B are the same, it can also be shortened to just -다",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Verb stem + 다가"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "(1)자다가 이상한 꿈을 꿨어요." to "While I was sleeping, I had a strange dream.",
                "(2)공부하다가 잠 둘었어요." to "I fell asleep while studying. (you can't continue studying)",
                "(2)밥을 먹다가 전화를 받았어요." to "I got a phone call while I was eating.",
                "(2)수영하다가 팔이 다쳤어요." to "I injured my arms while swimming.",
                "(2)출근하다가 친구를 우연히 만났어요." to "I bumped into a friend when I was on my way to work.",
                "(2)영화를 보다가 슬픈 장면이 나와서 펑멍 울었어요." to "I was watching a movie, and a really sad scene came on, so I started sobbing."
            )
        )

        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Description 았/었다가", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "This grammar point is for both verbs and adjectives and it means that, (1)after completing A you did B (intentional, expected)."
                    +"The (2) second meaning is you did A and then unexpected B happens."
                    +"The subject must be the same in both clauses, it can also be shortened to just -았/었다",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Verb/Adj + 았/었다가"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "(1)문을 열었다 바로 닫았어요." to "I opened the door and then closed it right away.",
                "(1)컴퓨터를 껐다가 다시 켜보세요." to "Try turning the computer off and then back on.",
                "(2)가방이 예뻐서 샀다 후회했어요." to "I bought a bag because it was pretty but I regret it.",
                "(2)쇼핑몰에 갔다가 우연히 친구를 만났어요." to "I went to the shopping mall and unexpectedly met a friend.",
                "(2)사진을 찍었다가 마음에 안 들어서 지웠어요." to "I took a photo and didn't like it so I deleted it."
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}

