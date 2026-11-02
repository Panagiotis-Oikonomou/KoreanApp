package com.example.myfirstapp.layouts

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Text
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun WordsLayout(
    title: String,
    words: List<Pair<String, String>> = emptyList()
) {
    val context = LocalContext.current
    val word = remember(title) {
        getCategoryWords(context, title)
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {

        Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = title,
                modifier = Modifier.fillMaxWidth(),
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(24.dp))

        if(word.isNotEmpty()) {
            word.forEach { (original, translation) ->
                Text(text = original + ":  " + translation, fontSize = 20.sp)

                Spacer(modifier = Modifier.height(10.dp))
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
    }
}

fun getCategoryWords(
    context: Context,
    category: String
): List<Pair<String, String>> {

    val result = mutableListOf<Pair<String, String>>()
    var readingCategory = false

    context.assets.open("vocabulary.txt").bufferedReader().use { reader ->

        reader.forEachLine { line ->

            when {
                line.trim() == "[$category]" -> {
                    readingCategory = true
                }

                line.trim() == "[End]" -> {
                    readingCategory = false
                }

                readingCategory -> {
                    val parts = line.split(":", limit = 2)

                    if (parts.size == 2) {
                        result.add(
                            parts[0].trim() to parts[1].trim()
                        )
                    }
                }
            }
        }
    }

    return result
}