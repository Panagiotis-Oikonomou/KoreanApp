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
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Animals")}
        ) { Text(text = "Animals", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Countries")}
        ) { Text(text = "Countries", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Body Parts")}
        ) { Text(text = "Body Parts", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Organs")}
        ) { Text(text = "Organs", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Kitchen Objects")}
        ) { Text(text = "Kitchen Objects", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Other Objects")}
        ) { Text(text = "Other Objects", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Tools")}
        ) { Text(text = "Tools", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Family")}
        ) { Text(text = "Family", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Jobs")}
        ) { Text(text = "Jobs", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Weather")}
        ) { Text(text = "Weather", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Nature")}
        ) { Text(text = "Nature", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Cloths")}
        ) { Text(text = "Cloths", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Fruits")}
        ) { Text(text = "Fruits", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Vegetables")}
        ) { Text(text = "Vegetables", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Furniture")}
        ) { Text(text = "Furniture", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Places")}
        ) { Text(text = "Places", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/School")}
        ) { Text(text = "School", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/School Subjects")}
        ) { Text(text = "School Subjects", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Directions")}
        ) { Text(text = "Directions", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Adjectives Size")}
        ) { Text(text = "Adjectives Size", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Adjectives Emotions")}
        ) { Text(text = "Adjectives Emotions", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Adjectives Feeling")}
        ) { Text(text = "Adjectives Feeling", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Adjectives")}
        ) { Text(text = "Adjectives", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Adjectives -하다")}
        ) { Text(text = "Adjectives -하다", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Verbs")}
        ) { Text(text = "Verbs", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Verbs -하다")}
        ) { Text(text = "Verbs -하다", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Action Verbs")}
        ) { Text(text = "Action Verbs", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Working Verbs")}
        ) { Text(text = "Working Verbs", fontSize = 20.sp)}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("words/Verbs -가다, -오다, -나다, -보다")}
        ) { Text(text = "Verbs -가다, -오다, -나다, -보다", fontSize = 20.sp)}

        Spacer(modifier = Modifier.height(16.dp))
    }
}