package com.example.myfirstapp.grammar.verbconstruction

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.LearningPage

@Composable
fun Naturally() {
    LearningPage(
        title = "It is the way things are / Naturally",
        description = "This grammar is used to express a general rule, truth or something that normally happens. It can also mean \"that’s how things work\" or \"it’s only natural that...\".\n"
                        +"The -는/ㄴ/은 법이다 is used for clear rules, principles or established truths.\n"
                        +"The -기 마련이다 is used for every day facts that people commonly experience, in many cases they are interchangeable.\n"
                        +"When talking about natural, every day inevitability, (2) sounds more natural. When emphasizing a fixed truth or rule especially in a proverb-like statement, (1) sounds more natural.",
        structure = listOf("Verb-는 법이다", "Adj-ㄴ/은 법이다", "V/A-기 마련이다"),
        examples = listOf(
            "처음에는 누구나 어려워하는 법이에요." to "At first, everyone naturally finds it difficult.",
            "열심히 노력하면 좋은 결과가 있는 법이에요." to "If you work hard, you naturally get good results.",
            "친한 친구끼리는 싸우기도 하는 법이에요." to "Even close friends naturally have arguments sometimes.",
            "사람은 누구나 실수하기 마련이에요." to "Everyone is bound to make mistakes.",
            "시간이 지나면 모든 것이 변하기 마련이에요." to "As time passes, everything is bound to change.",
            "어렸을 때는 누구나 부모님의 말을 듣기 싫어하기 마련이에요." to "When people are young, they naturally tend not to want to listen to their parents."
        )
    )
}