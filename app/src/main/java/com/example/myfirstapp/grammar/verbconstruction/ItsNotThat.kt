package com.example.myfirstapp.grammar.verbconstruction

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
fun ItsNotThat() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(14.dp)
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "It’s not that…", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "This grammar is used to partially deny something. It means \"It’s not that…\", \"It’s not necessarily…\", or \"It’s not the case that…\".",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("V-는 것은 아니다", "A-ㄴ/은 것은 아니다"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "한국어를 못하는 것은 아니에요." to "It’s not that I can’t speak Korean.",
                "싫어하는 것은 아니에요." to "It’s not that I dislike it.",
                "매일 운동하는 것은 아니에요." to "It’s not that I exercise every day. / I don’t exercise every day."
            )
        )

        ConversationLayout(
            listOf("너 그 사람 싫어해?" to "Do you dislike that person?"),
            listOf("싫어하는 것은 아니야. 그냥 조금 불편해." to "It’s not that I dislike them. I just feel a little uncomfortable.")
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}

