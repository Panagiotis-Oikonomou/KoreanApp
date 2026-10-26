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
import com.example.myfirstapp.layouts.ExamplesLayout
import com.example.myfirstapp.layouts.ShowingNumbers
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun EParticle() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Time and Place Particle",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Time Noun + -에",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ShowingNumbers(listOf(
            "At that time, At 1' o clock -> 한시에",
            "Time of the day, 아침, 저녁, 밤",
            "Day, 월요일, 목요일, ..., 일요일, 주말, 주중",
            "Month, 1월, 2월, ..., 12월",
            "Year, 2020년",
            "Season, 봄, 여름, 가을, 겨울",
            "Specific period of time, 방학 (vacation at school), 쉬는 시간"
        ))

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Time Noun1 + 에서/부터 (from)",
            fontSize = 20.sp
        )
        Text(
            text = "Time Noun2 + 까지 (to)",
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "You use -에 for the location of someones or somebodies presence.\nYou use -에서 for the location of a specific action.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(listOf("저는 매일 9시에서 5시까지 일해요." to "I work from 9 to 5 everyday.", "저는 도서관에 있어요." to "I am at the library.", "저는 도서관에서 공부해요." to "I am studying at the library."))

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "-에 verbs that indicate presence in that place",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ShowingNumbers(listOf(
            "있다 -> to be",
            "살다 -> to live",
            "존재하다 -> to exist",
            "출석하다 -> to be present (in class)",
            "참석하다 -> to be present (in an event, meeting)",
        ))

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Place Noun + -에 (to) \"headed point\"",
            fontSize = 20.sp
        )
        Text(
            text = "Place Noun + -에서 (from) \"starting point\"",
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(listOf("내일 우리 학교에 와요." to "Come to my house tommorow.", "어느 나라에서 왔어요?" to "Which country do you come from?", "강남에서 마포까지 얼마나 걸려요?" to "How long does it take from 강남 to 마포?"))

        Spacer(modifier = Modifier.height(16.dp))
    }
}