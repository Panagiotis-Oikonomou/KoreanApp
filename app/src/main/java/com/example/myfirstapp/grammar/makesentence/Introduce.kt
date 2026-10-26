package com.example.myfirstapp.grammar.makesentence

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Introduce() {
    LearningPage(
        title = "Introduce Yourself",
        structure = listOf(
            "Verb stem-는 일을 하고 있습니다: I do that Verb as a job",
            "Verb stem-는 [job name]입니다: I'm a [job name] that Verbs",
            "[industry field]에 관련된 일을 하고 있습니다: My work is related to [industry field]",
            "[subject]에 관련된 공부를 하고 있습니다: I do a study related to [subject]",
            "[subject]에 관련된 전공을 하고 있습니다: I do a major related to [subject]"
        ),
        examples = listOf(
            "저는 외국 사람들에게 한국어를 가르치는 일을 하고 있습니다." to "I teach foreigners Korean.",
            "저는 외국 사람들에게 한국어를 가르치는 선생님입니다." to "I am a teacher that teaches Korean.",
            "컴퓨터에 관련된 일을 하고 있습니다." to "My work is related to computers.",
            "컴퓨터에 관련된 공부를 하고 있습니다." to "I study something related to computers.",
            "언어에 관련된 전공을 하고 있습니다." to "I major in languages."
        )
    )
}