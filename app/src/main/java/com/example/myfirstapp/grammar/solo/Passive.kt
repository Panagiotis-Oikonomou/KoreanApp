package com.example.myfirstapp.grammar.solo

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
import com.example.myfirstapp.layouts.StructureLayout
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun Passive() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Passive Verbs",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "(1) What is a Passive Verb (피동사)?",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Active: Mosquitoes bite people. -> 모기는 사람을 물어요.",
            fontSize = 16.sp
        )
        Text(
            text = "Passive: People are bitten by mosquitoes. -> 사람은 모기에 물려요.",
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Structure",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Subject + 은/는/이/가 Actor + 에/에게/한테/에 의해Passive Verb"))

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Subject: receiver of action",
            fontSize = 16.sp
        )
        Text(
            text = "에: non living things, Organizations, big group of people, Country",
            fontSize = 16.sp
        )
        Text(
            text = "에게/한테: only for a person or animals",
            fontSize = 16.sp
        )
        Text(
            text = "에 의해: formal situations",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "(2) How to change Active Verbs into Passive Verbs",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "1. Adding the suffix \"이/ 리/히/ 기\"",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )

        StructureLayout(
            listOf(
                "Verb-이다: stem ends in vowel, ㅎ 받침, ㄲ 받침, ㅍ 받침",
                "Verb-리다: stem ends in ㄹ 받침",
                "Verb-히다: stem ends in ㄱ 받침, ㅂ 받침",
                "Verb-기다: stem ends in ㄴ 받침, ㅁ 받침, ㅅ 받침, ㅊ 받침",
                "ㅈ/ㄷ: 히다/기다 it depends on the verb"
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Verbs where 이/리/히/기 CANNOT be attached",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "A. intransitive Verbs(일어나다, 자다, 울다, 웃다 etc)",
            fontSize = 16.sp
        )
        Text(
            text = "Transitive verbs have both acting and receiving end the subject transfers the action to the object.",
            fontSize = 16.sp
        )

        Text(
            text = "Active",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(listOf("바람이 창문을 열었어요." to "The wind opened the window."))
        Text(
            text = "Wind did the action of opening and the affected window received the action.",
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(listOf("친구가 매일 저를 꼬집어요." to "My friend pinch me every day."))

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Passive",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(listOf("창문이 바람에 여렸어요." to "The window opened by the wind.", "저는 친구한테 매일 꼬집혀요." to "I get pinched by my friend every day."))
        Text(
            text = "The subject does the action but he can't transfer it to an object",
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "B. 하다 ending verbs (취소하다, 수정하다 etc)",
            fontSize = 16.sp
        )
        Text(
            text = "C. Exceptions aming transitive verb (만들다, 보리다, 켜다, 깨다, 치다, 고치다 etc)",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "2. Verb-아/어-지다",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "3.",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "-되다 subject of the Passive verb is non-living.",
            fontSize = 16.sp
        )
        Text(
            text = "-받다 subject of the Passive verb is a person.",
            fontSize = 16.sp
        )
        Text(
            text = "-당하다 subject of the Passive verb is a person with a negative meaning.",
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(listOf(
            "예약이 취소됐어요." to "The reservation is canceled.",
            "파티에 초대받았어요." to "I was invited to the party.",
            "저는 거절당했어요." to "I was rejected."
        ))

        Text(
            text = "4. Causative Verbs(사동사)",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "To make someone do the Verb",
            fontSize = 16.sp
        )
        Text(
            text = "먹이다 -> to make someone eat",
            fontSize = 16.sp
        )
        Text(
            text = "울리다 -> to make someone cry",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}