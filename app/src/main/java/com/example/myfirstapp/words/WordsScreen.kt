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
fun WordsScreen(navController: NavController) {
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
            text = "Words",
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("animals")}
        ) { Text(text = "Animals", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("countries")}
        ) { Text(text = "Countries", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("bodyparts")}
        ) { Text(text = "Body Parts", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("organs")}
        ) { Text(text = "Organs", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("kitchenobj")}
        ) { Text(text = "Kitchen Objects", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("otherobj")}
        ) { Text(text = "Other Objects", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("tools")}
        ) { Text(text = "Tools", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("family")}
        ) { Text(text = "Family", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("jobs")}
        ) { Text(text = "Jobs", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("weather")}
        ) { Text(text = "Weather", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("nature")}
        ) { Text(text = "Nature", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("cloths")}
        ) { Text(text = "Cloths", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("fruits")}
        ) { Text(text = "Fruits", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("vegetables")}
        ) { Text(text = "Vegetables", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("furniture")}
        ) { Text(text = "Furniture", fontSize = 20.sp)}

        Spacer(modifier = Modifier.height(16.dp))
    }
}