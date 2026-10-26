package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Assumption() {
    LearningPage(
        title = "Assumption",
        description = "The first grammar pattern is used to express a guess or inference based on evidence or what you've seen/heard."
                +"The second grammar pattern is a general guess based on observation or assumption."
                +"The third grammar pattern is a combined structure that links evidence with an inference."
                +"This pattern makes your guess sound reasonable and based on actual observation, rather than just assuming something randomly.",
        structure = listOf(
            "(1)Verb stem-는 모양이다", "(1)Adjective/이다 stem-ㄴ/은 모양이다",
            "(2)Verb stem + 나 보다", "(2)Adjective/이다 stem-ㄴ/은가 보다",
            "(3)(basis, why you made that assumption)",
            "Verb stem-는 걸 보니(까) (assumption)Verb stem-는 모양이다",
            "(3)(basis, why you made that assumption)",
            "Adjective/이다 stem-ㄴ/은 걸 보니(까) (assumption)Adjective/이다 stem-ㄴ/은 모양이다"
        ),
        examples = listOf(
            "(1)밖에 비가 오는 모양이에요." to "It looks like it's raining outside.",
            "(1)그 사람은 운동을 자주 하는 모양이에요." to "It seems like he/she exercises often.",
            "(2)민수 씨는 어제 많이 마시나 봐요." to "It seems Minsu drank a lot yesterday.",
            "(2)민수 씨는 피곤한가 봐요." to "I guess Minsu is tired.",
            "(3)그 사람이 계속 웃는 걸 보니까 기분이 좋은 모양이에요." to "Seeing that he's smiling continuously, it seems like he's in a good mood.",
            "(3)학생들이 조용히 공부하는 걸 보니 시험이 가까운 모양이에요." to "Seeing that students are studying quietly, it seems like exams are near."
        )
    )
}