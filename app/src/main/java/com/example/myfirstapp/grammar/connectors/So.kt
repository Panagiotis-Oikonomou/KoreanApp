package com.example.myfirstapp.grammar.connectors

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
fun So() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(
            text = "그래서/그러니까 conjunctions",
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
            text = "그래서/그러니까 means \"so\" or \"therefore\". It is used to show a cause-and-effect relationship between two sentences or ideas. It's similar to how we use \"so\" in English to explain a result.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "그래서 and 그러니까 differences",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            Text("(1) General Reason", modifier = Modifier.weight(1f))
            Text("(2) In the context where the listener is already aware of what's stated as a reason", modifier = Modifier.weight(1f))
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            Text("(3) Reason for the emotion verbs: \"고맙다, 감사하다, 미안하다, 반갑다\"", modifier = Modifier.weight(1f))
            Text("(4) When the next sentence is in imperative mood (command, suggestion etc)", modifier = Modifier.weight(1f))
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "You can use it just as 그래서/그러니까 or the short version below. If it is past or present tense use the same present tense for 그러니까.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Structure",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(
            listOf(
                "Present tense: Base stem + 서",
                "Present tense: Base stem + (으)니까"
            )
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
                "많이 먹어서 배가 아파요." to "I ate a lot, so my stomach hurts.",
                "(3)만나서 반가워요." to "Nice to meet you.",
                "(4)밖에 와 그러니까 우산을 가져가요." to "It is raining outside so take an umbrella.",
                "(4)심심하니까 게임 할래요?" to "I am bored so do you want to play a game?."
            )
        )

        Text(text = "You can also use 그러니까 to emphasize the reason.", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(10.dp))

        ConversationLayout(
            listOf("왜 울어요?" to "Why are you crying?"),
            listOf("슬프니까 울어요." to "I cry because I am sad.")
        )

        ConversationLayout(
            listOf("왜 날 따라와요?" to "Why are you following me?"),
            listOf("사랑하니까요." to "Because I love you.")
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}