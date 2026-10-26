package com.example.myfirstapp.grammar.questioncounter

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
fun HowMuch() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(
            text = "얼마나 & 얼마",
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
            text = "얼마 is used to ask how much is the price of an object",
            fontSize = 16.sp
        )
        Text(
            text = "얼마나 is used to ask how much of an adjective someone or something is",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Examples",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "이거 전부 얼마예요/얼마해요?" to "How much are all of this?",
                "저 얼마나 예뻐요?\n저 얼만큼 예뻐요?" to "How pretty am I?"
            )

        )

        ConversationLayout(
            listOf("한국 여름은 얼마나 더워요?" to "How hot is Korean summer?"),
            listOf("동남 아시아만큼 더워요." to "Is as hot as SouthEast Asia.")
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Description",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "How much verb have you done.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Structure",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("얼마나 + (adverb) + Verb"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Examples",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "공부를 얼마나 (오래) 했어요?" to "How long did you study?",
                "숙제를 얼마나 했어요?" to "How much did you study?",
                "    i. 다 했어요." to "    I finished it.",
                "    ii. 거의 다 했어요." to "    I am almost finished.",
                "    iii. 많이 했어요." to "    I did a lot.",
                "    iv. 얼마 안 했어요. / 별로 안 했어요." to "    I haven't finished much.",
                "    v. 하나도 안 했어요." to "    I haven't done anything.",
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}