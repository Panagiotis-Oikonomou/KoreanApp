package com.example.myfirstapp.grammar.verbconstruction

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
import com.example.myfirstapp.layouts.ShowingNumbers
import com.example.myfirstapp.layouts.StructureLayout
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun GoingAround() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(14.dp)
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "Going Around Doing Something", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "The grammar -고 다니다 describes doing an action repeatedly or habitually while moving around, or maintaining a certain behavior as you go from place to place, “to go around doing V\" / “to go around while V-ing\"." +
            "\nThe -아/어서 다니다 pattern often emphasizes that the action in V-아/어서 is connected to the movement or is something you do while going around.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Verb-고 다니다", "Verb-아/어서 다니다"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "매일 커피를 마시고 다녀요." to "I go around drinking coffee every day.",
                "친구들에게 자랑하고 다녔어요." to "I went around bragging to my friends.",
                "그 사람은 항상 웃고 다녀요." to "That person is always walking around smiling."
            )
        )

        ConversationLayout(
            listOf("너 요즘 왜 이렇게 행복해 보여?" to "Why do you look so happy these days?"),
            listOf("나 요즘 매일 여자친구 사진을 보여주고 다녀." to "These days, I go around showing everyone pictures of my girlfriend.")
        )

        Text(
            text = "The -아/어서 다니다 pattern often emphasizes that the action in V-아/어서 is connected to the movement or is something you do while going around.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(10.dp))

        ExamplesLayout(
            listOf(
                "학교에 걸어서 다녀요." to "I walk to school. / I go to school on foot.",
                "지하철을 타고 다녀요." to "I get around by subway."
            )
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}

