package com.example.myfirstapp.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Text
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun WordsLayout(
    title: String? = null,
    words: List<Pair<String, String>> = emptyList()
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        if(title != null) {
            Text(text = title, fontSize = 30.sp, fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.height(24.dp))
        }

        if(!words.isEmpty()) {
            words.forEach { (original, translation) ->
                Text(text = original + ": " + translation, fontSize = 20.sp)

                Spacer(modifier = Modifier.height(10.dp))
            }
        }
    }
}