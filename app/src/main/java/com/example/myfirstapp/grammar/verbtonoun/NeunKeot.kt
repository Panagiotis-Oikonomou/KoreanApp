package com.example.myfirstapp.grammar.verbtonoun

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
fun NeunKeot() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(
            text = "Verb/Adjective-는 것",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "It turns a verb phrase into a noun phrase by making it descriptive. Think of it like English \"the act of eating\", \"the thing you do\".",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text( text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Verb stem-ㄴ/는 것"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Examples",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "저는 제프가 똑똑한 거를 확실해요." to "I am certain that Jeff is smart.",
                "사람들이 좋아하는 거가 달라요." to "As for people the things they like are different.",
                "저는 영화 보는 거를 좋아해요." to "I like watching a movie."
            )
        )

        Text(
            text = "When -는 것 is used for emphasis or softness",
            fontSize = 16.sp
        )

        ConversationLayout(
            listOf("이거 어떻게 하는 거예요? (=이거 어떻게 해요?)" to "How do i do this?"),
            listOf("이렇게 하는 거예요? (&equals;이렇게 해요?)" to "Do it like this.")
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}