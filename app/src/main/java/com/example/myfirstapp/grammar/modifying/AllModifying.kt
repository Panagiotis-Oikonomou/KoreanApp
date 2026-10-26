package com.example.myfirstapp.grammar.modifying

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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun AllModifying(navController: NavController) {
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

        Text(text = "Modifying Form", style = MaterialTheme.typography.headlineMedium)

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("modifying")}
        ) { Text("Basic Modifying Form")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("morepast")}
        ) { Text("Verb-던")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("tipsforpast")}
        ) { Text("Tips to figure out the meaning of -던")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("adjective")}
        ) { Text("Adjective-던")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("pastpast")}
        ) { Text("Verb/Adjective-았/었던")}
    }
}