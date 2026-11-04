package com.example.myfirstapp.grammar.makesentence

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
fun AdverbialClause() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(text = "Adverbial Clause", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "-때 means \"time\" or \"moment\", and it is commonly used to indicate a specific time or situation when something happens."
                    + " Not with days, seasons or months."
                    + " The -ㄹ/을 때 expression refers to a certain moment of doing something or being in a certain state."
                    + "It often translates to \"when-\" or \"at the moment of\".",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Verb stem-ㄹ/을 때", "Noun + 때"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "방학 때." to "During school vacation.",
                "초등학 때." to "During elementary years.",
                "스무 살 때." to "When I was 20 years old.",
                "운전할 때 핸드폰을 보지 마세요." to "Don't look at your phone when you're driving.",
                "더울 때 샤워하면 기분이 좋아요." to "Taking a shower when it's hot makes me feel better."

            )
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}