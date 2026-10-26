package com.example.myfirstapp.grammar.modifying

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
import com.example.myfirstapp.layouts.ShowingNumbers
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun MorePast() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(
            text = "Verb-던",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Example",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "아빠가 먹던 피자.",
            fontSize = 16.sp
        )

        ShowingNumbers(listOf(
            "The pizza that dad was eating (but hasn't finished yet).",
            "The pizza that dad was used to eat on a regular basis (not anymore).",
            "The pizza that dad has been eating regularly/up to this time (you're not sure whether he'll continue to eat that pizza on a regular basis)."
        ))

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "So you can notice that Verb-던 has mainly three usages:",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(10.dp))

        ShowingNumbers(listOf(
            "An action that started in the past but hasn't ended yet.",
            "An action that one used to do continuously (and not anymore).",
            "An action that one's been doing continuously up to this time (but will not likely continue. Also used when you're not sure whether one will continue doing that action)."
        ))

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "If your sure that it will continue use Verb-는",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}