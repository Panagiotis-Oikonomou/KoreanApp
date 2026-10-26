package com.example.myfirstapp.grammar.indirectquotation
import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun IndirectCommand() {
    LearningPage(
        title = "Indirect Quotation for Command (Imperative Sentences)",
        structure = listOf(
            "Present tense:",
            "Verb stem + (으)라고 하다, 시키다, 추천하다, etc\n",
            "You can only use present verb because you can't command past actions."
        ),
        examples = listOf(
            "지수한테 저를 믿으라고 했어요." to "I told Jisoo to trust me.",
            "엄마가 저한테 설거지 하라고 시켰어요." to "Mom had me do the dishes.",
            "아빠가 저한테 천천히 하라고 했어요." to "Dad told me to take my time.",
            "선생님께서 저한테 계속 공부하라고 했어요." to "My teacher told me to keep on studying."
        )
    )
}