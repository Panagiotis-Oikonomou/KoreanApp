package com.example.myfirstapp.verbconstruction

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
import com.example.myfirstapp.layouts.ConversationLayout
import com.example.myfirstapp.layouts.ExamplesLayout
import com.example.myfirstapp.layouts.ShowingNumbers
import com.example.myfirstapp.layouts.StructureLayout
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun RatherVs() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(14.dp)
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "오히려 vs 차라리", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "1. 오히려", fontSize = 16.sp)
        Text(text = "Something is contrary to your initial expectations/someones else's opinion.", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(10.dp))

        ExamplesLayout(listOf("지수는 차갑게 생겼는데 오히려 성격을 털털해요." to "Jisoo looks cold on the outside but she has rather an easy going personality."))

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "2. 차라리", fontSize = 16.sp)
        Text(text = "Choosing the less bad one among two undesirable options A, B both bad. The emphasis is in how bad something is.", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(10.dp))

        ExamplesLayout(listOf("혼자 갈 거면 차라리 안 갈래." to "I would rather choose to not go if I have to go alone."))
        Spacer(modifier = Modifier.height(16.dp))
    }
}

