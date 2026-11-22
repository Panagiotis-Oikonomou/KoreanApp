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
fun AdjectivesScreen(navController: NavController) {
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
            text = "Adjectives 형용사",
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("adjectives/Physical Characteristics")}
        ) { Text(text = "Physical Characteristics", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("adjectives/Temperature & Weather")}
        ) { Text(text = "Temperature & Weather", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("adjectives/Taste, Smell & Texture")}
        ) { Text(text = "Taste, Smell & Texture", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("adjectives/Appearance & Condition")}
        ) { Text(text = "Appearance & Condition", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("adjectives/Emotions & Moods")}
        ) { Text(text = "Emotions & Moods", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("adjectives/Mental States & Reactions")}
        ) { Text(text = "Mental States & Reactions", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("adjectives/Personality & Character")}
        ) { Text(text = "Personality & Character", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("adjectives/Social Feelings & Relationships")}
        ) { Text(text = "Social Feelings & Relationships", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("adjectives/Quantity, Distance & Degree")}
        ) { Text(text = "Quantity, Distance & Degree", fontSize = 20.sp)}

        Spacer(modifier = Modifier.height(16.dp))
    }
}