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
fun But() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(text = "하지만/그렇지만, 그런데/근데, 그러나 conjunctions", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "A. Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "하지만/그렇지만 are a conjunction that means \"but\" or \"however\". They are used to connect two contrasting ideas, just like \"but\" in English.\n" +
                    "\n" +
                    "하지만 is more common in both writing and speech.\n" +
                    "그렇지만 is slightly more formal or emphatic.\n" +
                    "\n" +
                    "You can use it just as 하지만 or the short version below.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Present tense: Base stem + 지만", "Past tense: Past stem + 지만", "Future tense: Future stem + 지만"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Examples",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "저는 운동을 좋아해요. 하지만 수영은 싫어해요." to "I like exercising. But I don't like swimming.",
                "날씨가 춥지만 밖에 나가야 해요." to "The weather is cold. However, I have to go outside."
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "B. Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "그런데/근데 is a very versatile conjunction. It usually means: \"But\" / \"However\" or \"By the way\" and sometimes even \"And then\". It's commonly used in spoken Korean and is less formal than 하지만 or 그렇지만.\n" +
                    "\nYou can use it just as 그런데/근데 or the short version below. 근데 is a more casual form of 그런데",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf(
            "Adjectives:",
            "Present tense: Base stem + ㄴ/은데",
            "Past tense: Past stem + 는데",
            "Future tense: Future stem + ㄴ데\n",
            "Verbs (& Adjectives whose stem comes from verbs words):",
            "Present tense: Base stem + 는데",
            "Past tense: Past stem + 는데",
            "Future tense: Future stem + ㄴ데"
        ))
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Examples",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "1. But/However: Showing contrast\n공부 많이 했는데 시험을 못 봤어요." to "I studied a lot. But I did badly on the test.",
                "2. By the way: Changing the topic\n잘 지냈어요? 그런데 주말에 뭐 했어요?" to "Have you been well? By the way, what did you do over the weekend?",
                "3. And then: Continuing a story\n어제 영화 봤어요. 그런데 너무 재미없었어요." to "I watched a movie yesterday. And then, it turned out to be really boring.",
                "4. By the way: Sentence starter (only with 근데)\n근데 저 부탁 하나 해도 돼요?" to "By the way can I ask you a question?",
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "C. Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "그러나 is a formal conjunction that means \"but,\" \"however,\" or \"nevertheless\". It's mostly used in written language, like in essays, news articles, or formal speeches, rather than in everyday conversation.\n" +
                    "\nYou can use it just as 그러나 or the short version below.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Adjectives:", "Present tense: Base stem + 나", "Past tense: Past stem + 으나"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Examples",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(listOf("노력했다. 그러나 결과는 만족스럽지 않았다." to "I tried. But the result wasn't satisfying."))


        Spacer(modifier = Modifier.height(16.dp))
    }
}