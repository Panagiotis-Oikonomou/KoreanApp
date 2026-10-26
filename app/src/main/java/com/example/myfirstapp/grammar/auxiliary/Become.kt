package com.example.myfirstapp.grammar.auxiliary

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
fun Become() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(text = "-지다 Auxiliary Verb", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))

        Text( text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "The -지다 auxiliary verb indicates a change in state or condition, similar to saying \"to become\" or \"to get\". It's often used to describe the process of something changing or becoming a certain way.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text( text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Adjective-아/어 + 지다"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "고추장을 넣으면 더 매워질 거예요." to "If you put the red pepper paste it will become spicier.",
                "한국어 실력이 예전보다 나아졌어요." to "My Korean skills have become better from then.",
                "갑자기 맥주를 마시고 싶어지네요." to "I suddenly want to drink a beer.",
                "이 책은 둬로 갈 수럭 재미있어져요." to "As the book goes towards the end it becomes more fun."
            )
        )

        Text(text = "When you use -고 싶다, you didn't want to do it before but now you want.", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(16.dp))
    }
}