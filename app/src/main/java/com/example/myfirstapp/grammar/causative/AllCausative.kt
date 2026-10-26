package com.example.myfirstapp.grammar.causative

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
fun AllCausative(navController: NavController) {
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

        Text(text = "Causative", style = MaterialTheme.typography.headlineMedium)

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("suffixone")}
        ) { Text("Adding suffixes To Intransitive verbs")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("suffixtwo")}
        ) { Text("Adding suffixes Descriptive verbs")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("suffixthree")}
        ) { Text("Adding suffixes To Transitive verbs")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("suffixfour")}
        ) { Text("Adding suffixes extra")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("tomakeverbone")}
        ) { Text("To make someone verb(시키다)")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("tomakeverbtwo")}
        ) { Text("To make someone verb(게 하다)")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("tomakeverbthree")}
        ) { Text("To make someone verb(게 만들다)")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("tomakeverbfour")}
        ) { Text("To make someone verb(게 해주다)")}

        Spacer(modifier = Modifier.height(16.dp))
    }
}