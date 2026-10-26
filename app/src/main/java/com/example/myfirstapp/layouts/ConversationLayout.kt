package com.example.myfirstapp.layouts

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ConversationLayout(
    a: List<Pair<String, String>> = emptyList(),
    b: List<Pair<String, String>> = emptyList()
) {
    if(!a.isEmpty() && !b.isEmpty()) {
        a.forEach { (original, translation) ->
            Text(
                text = "A: $original",
                fontSize = 16.sp
            )

            Text(
                text = "    $translation",
                fontSize = 16.sp
            )
        }

        b.forEach { (original, translation) ->
            Text(
                text = "B: $original",
                fontSize = 16.sp
            )

            Text(
                text = "    $translation",
                fontSize = 16.sp
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
    }
}
