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
fun FollowsE() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Verbs that follow -에 particle",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Group 1",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        val group1 = listOf("-에 타다 (get on, ride)", "-에 앉다 (to sit)", "-에 서다 (to stand)", "-에 올라가다 (go up on)", "-에 이르다/오르다 (to reach)", "-에 나오다 (to appear: on public media)", "-에 출연하다 (appear: on TV)", "-에 빠지다 (fall into, fall for)", "-에 도착하다 (arrive at somewhere)", "-에 동의하다, 찬성하다 (agree with)", "-에 반대하다 (disagree with)")
        ShowingNumbers(group1)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Examples",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            examples = listOf(
                "침대에 올라가지마." to "Don't go up on the bed.",
                "방탄소년단이 아는 형님에 나왔어요." to "BTS appeared on Knowing Bros.",
                "존 트라볼타가 영화 그리스에 출연했어요." to "John Travolta appeared on the movie grease.",
                "고양이가 구멍에 빠졌어요." to "The cat fell in a hole.",
                "저는 사장님의 계획에 반대합니다." to "I disagree with my boss's plan.",
                )
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Group 2",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        val group2 = listOf("-에 넣다 (put something in)", "-에 놓다 (place something on)", "-에 보관하다 (keep/store something in)")

        ShowingNumbers(group2)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Examples",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            examples = listOf(
                "가방을 바닥에 놓아요." to "I put the bag on the floor.",
                "저는 옷을 옷장에 보관해요." to "I keep the clothes in the closet."
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Group 3",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        val group3 = listOf("-에 좋다 (be good for)", "-에 약하다 (have weakness for, be weak at)", "-에 관심이 있다 (be interested in)", "-에 재능이 있다 (be talented in)")
        ShowingNumbers(group3)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Examples",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            examples = listOf(
                "과일은 몸에 좋아요." to "Fruits are good for your health.",
                "저는 언어에 약해요." to "I am weak at languages.",
                "저는 한국어에 관심이 있어요." to "I am interested in Korean.",
                "저는 노래에 재능이 없어요." to "I don't have talent in singing."
            )
        )
        Spacer(modifier = Modifier.height(20.dp))
    }
}