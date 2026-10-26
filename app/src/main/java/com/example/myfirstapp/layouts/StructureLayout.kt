package com.example.myfirstapp.layouts

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StructureLayout(
    structure: List<String> = emptyList()
) {
    if(!structure.isEmpty()) {

        structure.forEach { st ->
            Text(
                text = st,
                fontSize = 16.sp
            )
        }
    }
}
