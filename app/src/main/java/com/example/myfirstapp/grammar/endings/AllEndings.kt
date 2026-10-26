package com.example.myfirstapp.grammar.endings

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
fun AllEndings(navController: NavController) {
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

        Text(text = "Sentence Endings", style = MaterialTheme.typography.headlineMedium)

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("euse")}
        ) { Text("-(으)세요 Ending")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("ne")}
        ) { Text("-네 Ending")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("inquotend")}
        ) { Text("Indirect Quotation Ending")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("inquestend")}
        ) { Text("Indirect Quotation for Questions Ending")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("command")}
        ) { Text("Indirect Quotation for Commands Ending")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("invitationend")}
        ) { Text("Indirect Quotation for Invitation Ending")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("da")}
        ) { Text("-다 Ending")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("deora")}
        ) { Text("-더라/더라고 Ending")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("kuna")}
        ) { Text("-구나/군 Ending")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("janha")}
        ) { Text("-잖아 Ending")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("keodeun")}
        ) { Text("-거든 Ending")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("ji")}
        ) { Text("-지 Ending")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("neunkeoya")}
        ) { Text("-거야 Ending")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("neunde")}
        ) { Text("-ㄴ/는데 Ending")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("ra")}
        ) { Text("-라 Ending")}

        Spacer(modifier = Modifier.height(16.dp))
    }
}