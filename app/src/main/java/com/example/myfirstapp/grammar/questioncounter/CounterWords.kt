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
import com.example.myfirstapp.layouts.ExamplesLayout
import com.example.myfirstapp.layouts.StructureLayout
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun CounterWords() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(text = "Counter Words", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Korean counters, called \"수분류사\", are used with numbers to specify what is being counted. They are essential for accurate counting in Korean and differ based on the type of object or concept. When you are using the numbers one, two, three and four you need to change them.\n" +
                    "하나 -> 한, 둘 -> 두\n" +
                    "셋 -> 세, 넷 -> 네",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Noun + Native Number + Counter Word"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "1. 개 — General counter for things, animals, or objects", fontSize = 16.sp)
        ExamplesLayout(listOf("저는 강아지 한 개 있어요." to "I have one dog."))

        Text(text = "2. 명 — Counter for people", fontSize = 16.sp)
        ExamplesLayout(listOf("우리 가족 네 명이에요." to "There are four members in my family."))

        Text(text = "3. 권 — Counter for books, volumes", fontSize = 16.sp)
        ExamplesLayout(listOf("소설 세 권 샀어요." to "I bought 3 novels."))

        Text(text = "4. 마리 — Counter for animals", fontSize = 16.sp)
        ExamplesLayout(listOf("고양이 두 마리 있어요." to "There are two cats."))

        Text(text = "5. 대 — Counter for vehicles, machines, and large items", fontSize = 16.sp)
        ExamplesLayout(listOf("차 한 대 있어요." to "I have one car."))

        Text(text = "6. 병 — Counter for bottles", fontSize = 16.sp)
        ExamplesLayout(listOf("물 두 병 주세요." to "Please give me two bottles of water."))

        Text(text = "7. 장 — Counter for sheets of paper, tickets, or drawings", fontSize = 16.sp)
        ExamplesLayout(listOf("종이 세 장 있어요." to "There are three sheets of paper."))

        Text(text = "8. 살 — Counter for age or years of a person's life", fontSize = 16.sp)
        ExamplesLayout(listOf("저는 25살이에요." to "I am 25 years old."))

        Text(text = "9. 송이 — Counter for flowers, grapes, etc", fontSize = 16.sp)
        ExamplesLayout(listOf("포도 세 송이 있어요." to "There are three bunches of grapes."))

        Text(text = "10. 층 — Counter for floors of a building", fontSize = 16.sp)
        ExamplesLayout(listOf("우리 회사는 5층에 있어요." to "Our company is on the 5th floor."))

        Text(text = "11. 시간 — Counter for hours", fontSize = 16.sp)
        ExamplesLayout(listOf("수업 두 시간이 있어요." to "The class is two hours long."))

        Text(text = "12. 그루 — Counter for trees", fontSize = 16.sp)
        ExamplesLayout(listOf("나무 세 그루 있어요." to "There are three trees."))

        Text(text = "13. 조각 — Counter for pieces, slices, or chunks (usually food)", fontSize = 16.sp)
        ExamplesLayout(listOf(
            "피자 한 조각 주세요." to "Please give me one slice of pizza.",
            "케이크 두 조각 먹었어요." to "I ate two pieces of cake."
        ))

        Text(text = "14. 켤래 — Counter for pairs (shoes, gloves, etc).", fontSize = 16.sp)
        ExamplesLayout(listOf("장갑 한 켤레 주세요." to "Please give me one pair of gloves."))

        Text(text = "15. 벌 — Counter for clothes", fontSize = 16.sp)
        ExamplesLayout(listOf("셔츠 한 벌 샀어요." to "I bought one shirt."))

        Text(text = "16. 자루 — Counter for long objects (pens, pencils, etc).", fontSize = 16.sp)
        ExamplesLayout(listOf("펜 두 자루 주세요." to "Please give me two pens."))

        Text(text = "17. 마디 — Counter for parts of the body (such as joints)", fontSize = 16.sp)
        ExamplesLayout(listOf("손가락 한 마디 다쳤어요." to "I hurt one finger joint."))

        Spacer(modifier = Modifier.height(16.dp))
    }
}