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
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun EgeHante() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "-한테/에게, -께 and -께서 particles",
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
            text = "In Korean, -한테 and -에게 are particles that mean \"to\" or \"from\" someone, depending on the context. They are used to indicate the recipient or target of an action. -께 is the honorific version of -한테/에게, meaning \"to\" someone (honorific). It's used to show respect when the recipient of an action is someone of higher status (like elders, teachers, or customers). -께서 is the honorific version of the subject marker 이/가. It's used when the subject of the sentence is someone you should show respect to the same with -께.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "-한테: more casual, often used in speech.",
            fontSize = 16.sp
        )
        Text(
            text = "-에게: more formal or written.",
            fontSize = 16.sp
        )
        Text(
            text = "이/가 -> -께서",
            fontSize = 16.sp
        )
        Text(
            text = "은/는 -> -께서는",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Examples",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            examples = listOf(
                "제프에게 선물을 줬어요." to "I gave a present to Jeff.",
                "누구한테 말했어요?" to "To whom did you tell?",
                "누구에게 돈을 빌렸어요?" to "From whom did you borrow money?\n",
                "누구한테 들었어요?" to "From who did you hear it?",
                "선생님께 들렸어요." to "I gave it to the teacher.",
                "어머니께 전화를 받았어요." to "I got a call from my mother.",
                "의사 선생님께서 저한테 약을 주셨어요." to "The doctor gave me medicine.",
                "할아버지께서 편찮으세요." to "Grandfather is sick.",
                "학교에 말했어요." to "I told it to school.",
                "회사에 이메일을 보냈어요." to "I sent an email to the company.",
            )
        )

        Text(
            text = "Because an organization is not a person you use -에",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}