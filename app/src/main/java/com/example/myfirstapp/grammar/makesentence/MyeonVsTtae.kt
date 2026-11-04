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
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun MyeonVsTtae() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(text = "-(으)면 vs -ㄹ/을 때", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "There are cases where replacing -ㄹ/을 때  with -(으)면  doesn't sound awkward\n" +
                    "->the first clause is time background and direct cause.",
            fontSize = 16.sp
        )

        ExamplesLayout(
            listOf(
                "운전할 때 핸드폰을 봐요." to "you can't put -(으)면 because the A clause it's not the cause of B, you driving is not the cause of you looking at your phone.",
                "길을 모를 때 지도 앱을 사용해요." to "you can put -(으)면 because, you not knowing the road (A clause) is the cause so you look at the app (B clause)."

            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "1.-(으)면 cannot be used for one time actions in the past", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "어제 영화 보면 울었어요.\n(내)어제 영화 볼 때 울었어요." to "When I watched a movie yesterday, I cried."
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "2.-ㄹ/을 때 cannot be used when the relationship between the two clauses expresses a general truth.", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "도시에 살 때 편리해요.\n(내)도시에 사면 편리해요." to "If you live in a city, it's convenient.",
                "채소를 먹을 때 건장에 좋아요.\n채소를 먹으면 건장에 좋아요." to "If you eat vegetables, it's good for your health."
            )
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}