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
fun ToMakeVerbOne() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(text = "To make someone verb(시키다)", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))

        Text( text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "This grammar pattern means \"to make someone do something\" or \"to cause something to be done\". 시키다, it's often more idiomatic and specific. It's commonly used with action nouns or certain verbs.", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(20.dp))

        Text( text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf(
            "Verb stem without 하 + 시키다\n",
            "을/를: It's not intentionally what the Verb does.",
            "에게/한테: It's intentionally what the Verb does."
        ))

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "1. 공부하다(to be deceived/fooled) <> 공부시키다(to make study)", fontSize = 16.sp)
        ExamplesLayout(listOf("아이들을/한테 공부시키지 마세요." to "Don't force children to study."))

        Text(text = "2. 구경하다(to look around) <> 구경시키다(to make look around, to show)", fontSize = 16.sp)
        ExamplesLayout(
            listOf(
                "친구 덕분에 서울을 구경할 수 있었어요." to "Thanks to my friend I was able to look around Seoul.",
                "나한테 서울을 구경시켜줘서 고마워요." to "Thank you for showing me around Seoul."
            )
        )

        Text(text = "3. 감동하다(to feel moved/touched) <> 감동시키다(to move/touch)", fontSize = 16.sp)
        ExamplesLayout(
            listOf(
                "그 노래를 듣고 많은 사람들이 감동했어요." to "After listening to that song a lot of people was touched.",
                "그 노래가 많은 사람들을 감동시켰어요." to "That song moved a lot of people."
            )
        )

        Text(text = "You use 을/를 because the song moved the people unintentionally.", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "4. 화해하다(to make peace with, to be reconciled) <> 화해시키다(to reconcile, make reconciled)", fontSize = 16.sp)
        ExamplesLayout(
            listOf(
                "어제 친구랑 싸웠는데 바로 화해했어요." to "I had an argument with my friend yesterday but right away we reconcile.",
                "형제들이 싸우면 부모가 제대로 화해시켜야 해요." to "If siblings fight with each other then the parents they have to properly reconcile them."
            )
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}