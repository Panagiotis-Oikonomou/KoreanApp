package com.example.myfirstapp.grammar.solo

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
import com.example.myfirstapp.layouts.ConversationLayout
import com.example.myfirstapp.layouts.ExamplesLayout
import com.example.myfirstapp.layouts.ShowingNumbers
import com.example.myfirstapp.layouts.StructureLayout

@Composable
fun Feelings() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(14.dp)
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Feelings in 3rd person",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Description",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "This grammar point is used to describe someone else's emotions, feelings, or states that you observe. The adjective should be some kind of feeling and it's most used with (he, she, they, you subject).",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Structure",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Adjective-아/어하다"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "엄마가 슬퍼요",
            fontSize = 16.sp
        )
        Text(
            text = "I can see through my mom's feelings.",
            fontSize = 16.sp
        )

        ShowingNumbers(listOf("Implies you are 100% certain about. An author knows the feelings of his characters.", "When asking how a person feels.", "Future tense, you predict."))

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "엄마가 슬퍼해요",
            fontSize = 16.sp
        )
        Text(
            text = "You are the observer, with your eyes, you see that mom is sad, based on her actions, face, expression etc.",
            fontSize = 16.sp
        )

        ShowingNumbers(listOf("Asking how third person (he, she, they) feel", "You have notice a tendency when you are doing something."))

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Examples",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "그 아이가 무서워해요." to "That child seems scared.",
                "아이들이 베 고파해요." to "The kids look hungry.",
                "저한테 고마워하는 사람들이 많아요." to "There are many people who are thankful to me.",
                "너 이 인형 갖고 싶어했잖아요." to "You and I know that you wanted to have this doll."
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}

