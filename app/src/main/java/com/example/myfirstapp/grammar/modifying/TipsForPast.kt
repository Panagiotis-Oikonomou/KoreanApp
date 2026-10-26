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
import com.example.myfirstapp.layouts.ConversationLayout
import com.example.myfirstapp.layouts.ExamplesLayout
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun TipsForPast() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(
            text = "Tips to figure out the meaning of -던",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "A. From the general context",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "(3) TV가 망가져서 제미있게 보던 드라마를 더 이상 보지 못해요." to "The TV broke down so I can't watch the drama that I was enjoying anymore.",
                "(1) 이거 내가 마시던 커피인데 네가 다 마실래?" to "This is the coffee that I drank will you finish it?",
                "(2) 설리가 키우던 고양이를 김희철이 키우고 있어요." to "김희철 is raising the cat that 설리 used to raise."
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "B. From the time adverbs",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "(1) 엄마가 이제 읽던 책.",
            fontSize = 16.sp
        )

        Text(
            text = "From the adverb 이제 you know \"읽던\" started yesterday. So it cannot mean \"regularly\" the only possible meaning would have to be the \"the book that mom started reading yesterday but hasn't finished yet\".",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(10.dp))

        ExamplesLayout(listOf(
            "(3) 이거 동생이 쓰던 노트북이네. 요즘도 쓰나?" to "This is the laptop my brother was using.  Does he still use it?",
            "(3) 주말마다 제미있게 보던 드라마가 오늘 끝난대요." to "I hear that the drama that I enjoyed watching every weekend ends today."
        ))

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "C. Pay attention to the nature of the  verb that's attached to 던",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(listOf(
            "옆집에 살던 사람." to "(2) The person who used to live next door (not anymore).\n(3) The person who's been living next door up to this time.",
            "이거 네가 자주 입던 옷 아니야?" to "(2) Aren't these the clothes that you used to wear often?\n(3) Aren't these clothes that you've been wearing often up to this time?"
        ))

        ConversationLayout(
            listOf("오늘은 어디에서 저녁을 먹을까요?" to "Where should we have dinner tonight?"),
            listOf("(3) 우리가 펑소에 자주 가던 식당 어때요?" to "How about the place we usually go often?")
        )

        ExamplesLayout(listOf(
            "(place)에 있던 가방." to "(2) The bag that used to be there (not anymore).\n(3) The bag that has been there (up to the last time I saw it).",
            "열쇠는 식탁에 있던 가방에 있을 거예요." to "(3) The key will be in the bag that has been on the table."
        ))

        Spacer(modifier = Modifier.height(16.dp))
    }
}