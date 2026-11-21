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
fun ItsTrueThat() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(text = "To Do Something, But... / It Is True That...", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))

        Text( text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "This grammar point is used to acknowledge/admit what someone said or a fact, \"It is true that...\"."
                + "By adding -(으)ㄴ/는데 it often adds a contrasting point \"It is true, but...\".",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text( text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Verb-기는 하다"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        ConversationLayout(
            listOf("한국어가 조금 어려워." to "Korean is a little hard."),
            listOf("그렇기는 해." to "Yeah it is true.")
        )

        ExamplesLayout(
            listOf(
                "그 영화가 길긴 한데 볼 만 해요." to "The movie yes it was long but it's worth watching it.",
                "친구 집에 가기는 했어요. 하지만 오래 있지 않았어요." to "I did go to my friend's house, but I didn't stay long."
            )
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}