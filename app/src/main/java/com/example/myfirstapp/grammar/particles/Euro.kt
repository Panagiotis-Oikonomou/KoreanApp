package com.example.myfirstapp.grammar.particles

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
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun Euro() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "-(으)로 particle",
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
            text = "-(으)로 primarily functions as a particle indicating direction, method, or means.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Direction",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(listOf("오른쪽으로 가세요." to "Go right.", "아래로 내려와요." to "Come down."))

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "to somewhere (vs -에)",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "-(으)로: getting somewhere from somewhere else.",
            fontSize = 16.sp
        )
        Text(
            text = "-에: getting somewhere itself.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(listOf("화장실에 가고 싶어요." to "I want to go to the bathroom.", "제프는 아침에 집에서 학교로 갔어요." to "Jeff in the morning went from the house to the school."))

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Transportation/Tool",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(listOf("강남에서 경기도까지 버스로 한 시간 걸려요." to "From 강남 to 경기도 it takes 1 hour by bus.", "연필로 썼어요." to "I wrote it with a pencil."))

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Choice",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ConversationLayout(
            a = listOf("어디에 갈까?" to "Where should we go?"),
            b = listOf("공원에 가자." to "Let's go to the park.")
        )
        ConversationLayout(
            a = listOf("어디로 갈까?" to "In which park should we go?"),
            b = listOf("한남동으로 가자." to "Let's go to 하남동.")
        )

        Spacer(modifier = Modifier.height(16.dp))

        ConversationLayout(
            a = listOf("이거랑 저거 예쁘다! 뭐로 살까?" to "There are both pretty! What shall we buy?"),
            b = listOf("저기로 사자." to "Let's buy that one.")
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}