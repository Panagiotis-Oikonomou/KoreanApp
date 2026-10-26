package com.example.myfirstapp.grammar.causative

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
fun SuffixOne() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(
            text = "Adding suffixes To Intransitive verbs",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text( text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Causative verbs are used to indicate that the subject makes or lets someone do something. You actually do the action.", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(20.dp))

        Text( text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Intransitive Verb/Adjective + 이/리/히/기/우/추/구/시/애"))

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "It has the same rule as it is in the Passive", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "1. 늘다(to increase, improve) <> 늘리다(to make increase/improve, to increase/improve sth)", fontSize = 16.sp)
        ExamplesLayout(
            listOf(
                "최곤에 혼자 사는 사람이 늘었어요." to "Recently the number of people living alone has increased.",
                "저는 한국어 실력을 늘리고 싶어요." to "I want to improve my Korean skills."
            )
        )

        Text(text = "2. 웃다 <> 웃기다(to make laugh)", fontSize = 16.sp)
        ExamplesLayout(listOf("아빠는 엄마를 자주 웃겨요." to "My dad makes my mom laugh frequently."))

        Text(text = "3. 앉다 <> 앉히다", fontSize = 16.sp)
        ExamplesLayout(
            listOf(
                "손님들이 소파에 앉았어요." to "The guests sat down in the sofa.",
                "저는 손님들을 소파에 앉혔어요." to "I sat the guests on the couch."
            )
        )

        Text(text = "4. 살다 <> 살리다(to make live/survive, to save, to rescue)", fontSize = 16.sp)
        ExamplesLayout(
            listOf(
                "의사 선생님 덕분에 친구가 살았어요." to "My friend survived thanks to the doctor.",
                "의사 선생님께서 저를 살려줬어요." to "The doctor saves my life."
            )
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}