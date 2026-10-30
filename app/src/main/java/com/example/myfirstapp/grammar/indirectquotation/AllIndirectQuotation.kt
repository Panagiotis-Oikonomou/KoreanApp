package com.example.myfirstapp.grammar.indirectquotation

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
fun AllIndirectQuotation(navController: NavController) {
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
            text = "Indirect Quotation",
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("indirectquo")}
        ) { Text("Indirect Quotation")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("indirectques")}
        ) { Text("Indirect Quotation for Questions")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("indirectcommand")}
        ) { Text("Indirect Quotation for Command (Imperative Sentences)")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("indirectinvitation")}
        ) { Text("Indirect Quotation for Invitation, Suggestion")}

        Spacer(modifier = Modifier.height(16.dp))
    }
}