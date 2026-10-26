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
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun Eotteon() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(
            text = "무슨 & 어느 & 어떤",
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
            text = "\"무슨\" functions as a determiner and is used to ask about the kind or type of something when the specific options are not clear or known. It's often translated as \"what kind of\" or \"what\".",
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
                "무슨 책 읽고 있어요?" to "What book are you reading?",
                "무슨 노래 듣고 들어요?" to "What song are you listening to?",
                "무슨 말이예요?\n무슨 소리예요?" to "What do you mean? / What does that mean?"
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Description",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "\"어느\" functions as a determiner similar to \"which\" or \"which one\". It is used to ask about a specific item or option from a limited, known set of choices. It implies a selection from a defined range, rather than a general or unspecified choice.",
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
                "1. When you are given choices\n어느 거 먹을래?" to "Which one do you want to eat?",
                "어느 나라 사람이예요?\n어느 나라에서 왔어요?" to "Where are you from?",
                "2. Unspecified/Undentified\n어느 여자가 울고 있어요." to "A woman is crying."
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Description",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "\"어떤\" translates to \"what kind of\" or \"some\" depending on the context. It's used to ask about the type or nature of something, or to refer to an unspecified thing.",
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
                "1. What kind of (trait, personality)\n어떤 책 좋아해요?" to "What kind of book do you like?",
                "제프씨는 어떤 사람이예요?" to "What kind of person is Jeff?",
                "2. Which (= 어느)\n어떤 거/어느 거?" to "Which one?"
            )
        )

        Text(
            text = "어떤 과일 먹을래요?\n어느 과일 먹을래요?",
            fontSize = 16.sp
        )
        Text(
            text = "Which fruit shall we eat?",
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "\"어떤\" is used more often in spoken word",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "3. Unspecified/Undentified\n어떤 여자가 울고 있어요.\n어느 여자가 울고 있어요.",
            fontSize = 16.sp
        )
        Text(
            text = "A woman is crying.",
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "\"어떤\" is used more often in spoken word",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}