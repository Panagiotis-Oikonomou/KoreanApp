package com.example.myfirstapp.grammar.indirectquotation
import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun IndirectInvitation() {
    LearningPage(
        title = "Indirect Quotation for Command (Imperative Sentences)",
        structure = listOf("Verb stem + 자고 + 하다, 제안하다, 초대하다"),
        examples = listOf(
            "아빠한테 등산 가자고 했어요." to "I told Dad to go hiking.",
            "할아버지께 같이 산책 가자고 말씀 드렸어요." to "I told my grandfather to go for a walk together.",
            "친구한테 시험 끝나고 나서 영화를 보러 가자고 했어요." to "I told my friend to go watch a movie after the exam."
        )
    )
}