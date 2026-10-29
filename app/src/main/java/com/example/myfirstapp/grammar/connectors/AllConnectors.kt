package com.example.myfirstapp.grammar.connectors

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun AllConnectors(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Sentence Connectors",
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("and")}
        ) { Text("그리고 conjunction")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("but")}
        ) { Text("하지만/그렇지만, 그런데/근데, 그러나 conjunctions")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("butstill")}
        ) { Text("그래도 conjunction")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("so")}
        ) { Text("그래서, 그러니까 conjunctions")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("then")}
        ) { Text("그러면, 그러려면 conjunctions")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("ttaendevstaenikka")}
        ) { Text("ㄹ/을테다 vs ㄹ/을 거다")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("neurago")}
        ) { Text("느라(고) conjunction")}

        Spacer(modifier = Modifier.height(16.dp))
    }
}