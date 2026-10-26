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
fun DiffKiNeunkeot() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(
            text = "Difference between -기 and -는 것",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "-기 treats the action as an abstract act/event/state, no focus on who/when/how specifically, like saying \"doing\" in English as an activity name.",
            fontSize = 16.sp
        )
        Text(
            text = "-는 것 treats the action as a thing/fact/process in reality, like saying \"the fact that (someone) does\" or \"the thing that (someone) is doing\".",
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Reading in general, as an activity.", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        ExamplesLayout(listOf("책 읽기는 재미있어요." to "Reading books is fun."))

        Text(text = "More descriptive, could be about now or a specific case.", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        ExamplesLayout(listOf("책을 읽는 것은 재미있어요." to "The act of reading books is fun."))

        Spacer(modifier = Modifier.height(16.dp))
    }
}