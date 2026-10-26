package com.example.myfirstapp.grammar.particles

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun WaKwaAndMore() {
    LearningPage(
        title = "-와/과, -(이)랑, -하고 particles",
        description = "-와/과 are the most formal and standard connectors for \"and\" when linking nouns. The particles are used in formal contexts or when writing (news articles, formal writing). -(이)랑 is more casual and conversational compared to -와/과.It's commonly used in everyday speech, especially among friends or family. -하고 is also informal but not as casual as -(이)랑. It's commonly used in both spoken and written language. It can also mean \"with\" depending on the context.",
        examples = listOf(
            "제프와/랑 지수는 올 거예요." to "Jeff and Jisoo will come.",
            "친구하고 영화 봤어요." to "I watched a movie with a friend.",
        )
    )
}