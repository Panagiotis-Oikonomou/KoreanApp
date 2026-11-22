package com.example.myfirstapp.words

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
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun VerbsScreen(navController: NavController) {
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
            text = "Verbs 동사",
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("verbs/Emotions & Mental Reactions")}
        ) { Text(text = "Emotions & Mental Reactions", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("verbs/Physical Actions & Changes")}
        ) { Text(text = "Physical Actions & Changes", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("verbs/Thinking, Understanding & Memory")}
        ) { Text(text = "Thinking, Understanding & Memory", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("verbs/Communication & Social Interaction")}
        ) { Text(text = "Communication & Social Interaction", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("verbs/Movement & Direction")}
        ) { Text(text = "Movement & Direction", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("verbs/Daily Life & Personal Habits")}
        ) { Text(text = "Daily Life & Personal Habits", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("verbs/Personal Care & Hygiene")}
        ) { Text(text = "Personal Care & Hygiene", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("verbs/Cooking, Food Preparation & Eating")}
        ) { Text(text = "Cooking, Food Preparation & Eating", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("verbs/Cleaning & Household Activities")}
        ) { Text(text = "Cleaning & Household Activities", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("verbs/Handling Objects & Physical Actions")}
        ) { Text(text = "Handling Objects & Physical Actions", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("verbs/Work, Education & Career")}
        ) { Text(text = "Work, Education & Career", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("verbs/Shopping, Reservations & Services")}
        ) { Text(text = "Shopping, Reservations & Services", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("verbs/Creating, Repairing & Organizing")}
        ) { Text(text = "Creating, Repairing & Organizing", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("verbs/Life Events & Competition")}
        ) { Text(text = "Life Events & Competition", fontSize = 20.sp)}

        Spacer(modifier = Modifier.height(16.dp))
    }
}