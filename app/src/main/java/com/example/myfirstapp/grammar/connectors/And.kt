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
import com.example.myfirstapp.layouts.ExamplesLayout
import com.example.myfirstapp.layouts.StructureLayout
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun And() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ){
        Spacer(modifier = Modifier.height(34.dp))

        Text(
            text = "그리고 conjunction",
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
            text = "그리고 is a conjunction that means \"and\" or \"and then\", depending on the context.\n" +
                    "\n" +
                    "You can use it just as 그리고 or the short version below.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(
            listOf(
                "Present tense: Base stem + 고",
                "Past tense: Past stem + 고",
                "Future tense: Future stem + 고"
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "1. And: Connecting two nouns, phrases, or clauses", fontSize = 20.sp)
        Spacer(modifier = Modifier.height(10.dp))
        ExamplesLayout(
            listOf(
                "사과 그리고 바나나를 샀어요." to "I bought apples and bananas.",
                "저는 학생이고 제 친구는 선생님이에요." to "I'm a student. And my friend is a teacher."
            )
        )

        Text(text = "2. And then: Showing a sequence of actions", fontSize = 20.sp)
        Spacer(modifier = Modifier.height(10.dp))
        ExamplesLayout(
            listOf(
                "집에 갔어요. 그리고 잤어요." to "I went home, and then I slept.",
                "밥을 먹었고 영화를 봤어요." to "I ate, and then I watched a movie."
            )
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}