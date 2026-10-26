package com.example.myfirstapp.grammar.verbtonoun

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
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun KiFixed() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(
            text = "Verb/Adjective-기 Fixed Expressions",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Some expressions are frozen with -기. If you use -는 것, it would change the nuance or meaning of the expression.",
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "1. -기(가) 좋다(It's good to Verb, It suits for doing Verb)", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        ExamplesLayout(listOf("여기는 수영하기가 좋아요." to "It's good for swimming here."))

        Text(text = "2. -기(가) 쉽다(It's likely to Verb)", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        ExamplesLayout(listOf("언어가 다르면 사람들이 오해하기 쉬워어요." to "If a language is different people are likely to misunderstand you."))

        Text(text = "3. -기(가) 힘들다/어렵다(It's unlikely to Verb)", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        ExamplesLayout(listOf("길에서 연예인을 보기 힘들어요." to "It's unlikely to see a celebrity on the street."))

        Text(text = "4. 기(를) 바래다(To hope)", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        ExamplesLayout(listOf("여러분의 꿈이 이루어지기를 바래요." to "I hope your dreams come true."))

        Text(text = "5. -기로 결정하다(Decide to Verb)", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        ExamplesLayout(listOf("저는 매일 공부하기로 결정했어요." to "I decided to study every day."))

        Text(text = "6. -기로 약속하다(Promise to Verb)", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        ExamplesLayout(listOf("선생님과 공부를 열심히 하기로 약속했어요." to "I promised to study hard with the teacher."))

        Text(text = "7. -기 시작하다(Begin to Verb)", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        ExamplesLayout(listOf("아이들이 떠들기 시작했어요." to "The children begin to be loud."))

        Spacer(modifier = Modifier.height(16.dp))
    }
}