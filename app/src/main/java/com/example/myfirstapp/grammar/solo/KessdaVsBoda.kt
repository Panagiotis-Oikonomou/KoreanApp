package com.example.myfirstapp.grammar.solo

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
fun KessdaVsBoda() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(14.dp)
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "V/A-겠다 vs V-나 보다, A-ㄴ/은가 보다", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "Both expressions are for guessing, speculation", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "1. V/A-겠다", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Present (& Future): I must be - You would probably\n"
                    + "Past: It must have been, You would've probably\n"
                    + "When you see a situation and guess the result or what will likely happen next.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        ConversationLayout(
            listOf("오늘 세 시간밖에 못 잤어요." to "I only slept for 3 hours today"),
            listOf("피곤하겠어요." to "You must be tired (speculating the result).")
        )

        ConversationLayout(
            listOf("한국에 10년 살았어요." to "I lived in Korea for 10 years."),
            listOf("그럼. 한국어를 잘 하겠어요." to "Oh. Then you probably speak Korean fluently.")
        )

        ExamplesLayout(listOf("이걸다 혼자 준비하셨어요? 시간이 많이 걸려겠어요." to "Did you prepare all of this by yourself? That must have been taken a lot of time."))

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "2. V-나 보다, A-ㄴ/은가 보다", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "You try to guess the cause behind it,", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(
            listOf("Present: V-나 보다, A/이다-ㄴ/은가 보다", "Past: V/A-았/었나 보다", "Future: V-ㄹ/을 건가 보다")
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "지수가 전화를 안 받네. 자고 있나 봐요" to "Jisoo isn't answering her phone. She must be sleeping.",
                "외국인가 봐. 가서 도와 주자" to "He must be a foreigner. Let's go help him..",
                "이 영화의 평이 좋네요. 재미있나 봐요." to "This movie has great reviews. It must be good."
            )
        )

        ConversationLayout(
            listOf("지수가 표정이 안 좋아요." to "Jisoo doesn't look happy."),
            listOf("피곤한가 봐요." to "She must be tired (guessing the cause why she looks unhappy).")
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}

