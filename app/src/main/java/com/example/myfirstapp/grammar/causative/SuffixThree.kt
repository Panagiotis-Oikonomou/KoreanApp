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
fun SuffixThree() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(text = "Adding suffixes To Transitive verbs", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))

        Text( text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Causative verbs are used to indicate that the subject makes or lets someone do something. You actually do the action.", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(20.dp))

        Text( text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Transitive Verb/Adjective + 이/리/히/기/우/추/구/시/애"))

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "It has the same rule as it is in the Passive", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "1. 먹다 <> 먹이다(to feed)", fontSize = 16.sp)
        ExamplesLayout(
            listOf(
                "고양이는 생선이나 닭을 먹어요." to "The cat eats fish or chicken.",
                "저는 고양이를 생선이나 닭을 먹여요." to "I feed my cat fish or chicken."
            )
        )
        Text(text = "It is often used with 한테/에게, only it it is a person or animal", fontSize = 16.sp)

        Text(text = "2. 입다 <> 입히다(to dress somebody)", fontSize = 16.sp)
        ExamplesLayout(
            listOf(
                "제가 제 딸에게 예쁜 드레스를 입혔어요." to "I dressed my daughter a pretty dress."
            )
        )

        Text(text = "3. 풀다 <> 풀리다(to make solve)", fontSize = 16.sp)
        ExamplesLayout(
            listOf(
                "선생님께서 학생들한테 단어 퀴즈를 풀렸어요." to "The teacher made the students do a vocabulary quiz."
            )
        )

        Text(text = "4. 안다 <> 안기다(to make hug/hold)", fontSize = 16.sp)
        ExamplesLayout(
            listOf(
                "제 남편이 아기를 안고 있어요." to "My husband is holding the baby.",
                "제가 제 남편한테 아기를 안겼어요." to "I left my husband hold the baby."
            )
        )

        Text(text = "5. 타다(to ride, get in a vehicle) <> 태우다(to make ride, to give a ride)", fontSize = 16.sp)
        ExamplesLayout(
            listOf(
                "차를 타요. :" to "To ride a car(you use the car as a means of transportation).",
                "차에 타요. :" to "To get in the car.",
                "차를 태워요. :" to "To make somebody to use a car.",
                "차에 태워요. :" to "To make somebody to get in a car."
            )
        )

        Text(text = "6. 읽다 <> 읽히다(to make read, to read somebody sth)", fontSize = 16.sp)
        ExamplesLayout(
            listOf(
                "많은 사람들에게 읽히는 책을 베스트셀러라고 해요." to "The book that is read by many people is called a bestseller."
            )
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}