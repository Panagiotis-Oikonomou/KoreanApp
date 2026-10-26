package com.example.myfirstapp.grammar.solo

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Opinion() {
    LearningPage(
        title = "Expressing your Opinion",
        description = "The expression -고 생각하다 in Korean literally means, \"to think that...\" and is used to express an opinion, belief, or assumption about something.\n-것 같다 is used to express uncertainty, guess, or soft opinion. It literally means, \"It seems that...\", \"It looks like...\", \"I think...\" (less certain or softer than \"-고 생각하다\").",
        structure = listOf("Verb stem-ㄴ/는다고 생각하다\nAdjective stem-다고 생각하다\nNoun-이라/라고 생각하다", "Verb stem-는 것 같다\nAdjective/이다 stem-ㄴ/은 것 같다"),
        examples = listOf(
            "저는 제프가 똑똑하다고 생각해요." to "I think Jeff is smart.",
            "한국어가 재미있다고 생각해요." to "I think Korean is fun.",
            "저는 지수가 미인이라고 생각해요." to "I think Jisoo is a beautiful woman.",
            "저는 책을 많이 읽는다고 생각해요." to "I think you read a lots of books.",
            "이 꽃은 정말 예쁜 것 같아요." to "It seems like this flower is really pretty.",
            "그는 학생인 것 같아요." to "It seems like he is a student.",
            "한국에 가는 것 같아요." to "It seems like someone is going to Korea.",
        )
    )
}