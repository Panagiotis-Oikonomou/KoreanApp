package com.example.myfirstapp.grammar.questioncounter

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
fun AllQuestionCounter(navController: NavController) {
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

        Text(text = "Question Words", style = MaterialTheme.typography.headlineMedium)

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("basicwords")}
        ) { Text("Basic Question Words")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("eotteon")}
        ) { Text("무슨 & 어느 & 어떤")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("howmuch")}
        ) { Text("얼마나 & 얼마")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("counterw")}
        ) { Text("Counter Words")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("myeot")}
        ) { Text("Question Word 몇")}
    }
}