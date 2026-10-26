package com.example.myfirstapp.grammar.connectors

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
fun Then() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(text = "그러면, 그러려면 conjunctions", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "그러면 translates to \"then\" or \"in that case\" in English. It's often used when you're talking about what will happen next or suggesting a course of action, based on a previous statement. 그러려면 is a more specific form of 그러면, and it translates to \"if you want to do that\" in English, but with an added sense of a condition for achieving or doing something. It's used when you're talking about a condition or requirement that needs to be met in order to reach a certain goal or to take a particular action. It's like saying, \"In order to do that\" or \"If you want that to happen\".\n" +
                    "\n" +
                    "You can use it just as 그러면/그러려면 or the short version below.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Present tense: Present stem + (으)면", "Present tense: Base stem + (으)려면"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Examples",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "많이 먹어 그러면 살이 쪄요." to "If you eat a lot then you will gain weight.",
            )
        )

        ConversationLayout(
            listOf("티켓 얼마예요?" to "How much is the ticket?"),
            listOf("학생이면 1000원이고 성인이면 2000원이에요." to "If you are a student it's 1000won and if you are adult it's 2000won.")
        )

        ExamplesLayout(
            listOf(
                "지갑을 찿으려면 어디에 신고해야 돼요?" to "To find my wallet where should I report it?",
                "감기에 걸리지 않아 그러려면 자주 손을 씻어야 해요." to "In order to not catch a cold you should wash your hands often."
            )
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}