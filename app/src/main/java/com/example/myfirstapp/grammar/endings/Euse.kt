package com.example.myfirstapp.grammar.endings

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
fun Euse() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(text = "-(으)세요 Ending", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "-(으)세요 is a Korean ending that expresses a polite or honorific command or request. It's used when speaking to someone older than you or someone you need to show respect to. Essentially, it's the polite way of saying \"please do\" or \"you should\". You never use it for yourself.",
            fontSize = 16.sp,
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf(
            "Present Tense: base stem-(으)세요",
            "Past Tense: past stem-(으)셨어요",
            "Future Tense: base stem-(으)실 거예요"
        ))
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        ConversationLayout(
            listOf("선생님이 왜 안 오세요?" to "Why isn't the teacher coming?"),
            listOf("바쁘세요." to "She is busy.")
        )
        ConversationLayout(
            listOf("한국인이세요?" to "Are you Korean?"),
            listOf("아뇨 중국사람이에요." to "No. I am Chinese.")
        )

        ExamplesLayout(listOf(
            "어머니께서 곧 오실 거예요." to "My mom will come home soon.",
            "사장님께서 크게 웃으셨어요." to "My boss laughed out loud."
        ))

        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "있다", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text(text = "1. stay, 2. there is (a person) -> 계세요", fontSize = 16.sp)
        Text(text = "3. to have -> 있으세요", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(listOf(
            "(2)할머니께서 집에 계세요." to "My grandmother is at home.",
            "(3)현금 있으세요?" to "Do you have money?"
        ))

        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "주다", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text(text = "주시다: show respect to the giver", fontSize = 16.sp)
        Text(text = "드리다: show respect to the receiver", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(listOf(
            "커피 한 주세요." to "One cup of coffee.",
            "선생님께 선물을 드려요." to "I gave a gift to my teacher."
        ))

        Spacer(modifier = Modifier.height(16.dp))
    }
}