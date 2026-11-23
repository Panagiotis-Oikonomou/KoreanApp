package com.example.myfirstapp.grammar.compare

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun LooksVs() {
    LearningPage(
        title = "To Look / To Seem",
        description = "Both are grammar expressions used to describe someone's appearance or how something looks."
                    + " However, there is an important difference in meaning and nuance.\n"
                    + "Adj-아/어 보이다(looks/seems) is used when you judge someone's or something's condition based on what you see, it expresses your impression or observation, making an assumption based on its appearance.\n"
                    + "Adj-게 생겼다(looks/has the appearance of being) is used to describe how someone or something looks, often focusing on its physical appearance or outward characteristics."
                    + " You are describing the appearance or features that give someone or something a particular look.",
        structure = listOf("Adj-아/어 보이다", "Adj-게 생겼다"),
        examples = listOf(
            "착해 보여요." to "Looks kind.",
            "착하게 생겼어요." to "Has a kind-looking appearance.",
            "그 사람은 무서워 보여요." to "He looks scary(Your impression of him).",
            "그 사라은 무섭게 생겼어요." to "He has a scary-looking appearance(His facial features or overall appearance).",
            "요즘 많이 바빠 보여요." to "You look very busy these days.",
            "그 사람은 무섭게 생겼지만 친절해요." to "That person looks scary but he is kind."
        )
    )
}