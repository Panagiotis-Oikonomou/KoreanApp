package com.example.myfirstapp.grammar.questioncounter

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun BasicWords() {
    LearningPage(
        title = "Basic Question Words",
        structure = listOf(
            "1. 누구/누가 (who): \"누구\" is used when the question word is the object of the sentence, while \"누가\" is used when the question word is the subject of the sentence.",
            "2. \"뭐\" (what)",
            "3. \"왜\" (why)/\"어떻게\"(formal)",
            "4. \"어디\" (where)",
            "5. \"언제\" (when)",
            "6. \"어떻게\" (how)"
        ),
        examples = listOf(
            "누구한테 전화해요?" to "Who do you call?",
            "누가 전화해요?" to "Who calls you?",
            "너 뭐 먹고 싶어요?" to "What do you want to eat?",
            "왜 나한테 말 안 했어요?" to "Why didn't you tell me?",
            "어디에서 만날까요?" to "Where should we meet?",
            "언제 시간이 돼요?" to "When are you free?",
            "언제부터 기다렸어요?" to "Since when have you been waiting?",
            "어떻게 지냈어요?" to "How have you been?",
            "이걸 어떻게 해요?" to "How do you do this?",
        )
    )
}