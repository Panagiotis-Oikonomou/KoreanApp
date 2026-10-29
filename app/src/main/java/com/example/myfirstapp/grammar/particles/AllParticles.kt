package com.example.myfirstapp.grammar.particles

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
fun AllParticles(navController: NavController) {
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
            text = "Particles",
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("bakke")}
        ) { Text("-밖에 particle")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("boda")}
        ) { Text("-보다 particle")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("cheoreom")}
        ) { Text("-처럼, -같은 particles")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("do")}
        ) { Text("-도 particle")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("egehante")}
        ) { Text("-한테/에게, -께 and -께서 particles")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("eparticle")}
        ) { Text("Time and Place Particle")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("euro")}
        ) { Text("-(으)로 particle")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("followse")}
        ) { Text("Verbs that follow -에 particle")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("ina")}
        ) { Text("-(이)나 particle")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("man")}
        ) { Text("-만 particle")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("subject")}
        ) { Text("Topic/Subject particles")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("wakwaandmore")}
        ) { Text("-와/과, -(이)랑, -하고 particles")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("dongan")}
        ) { Text("-동안 particle")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("aroundabout")}
        ) { Text("쯤/정도 particles")}

        Spacer(modifier = Modifier.height(16.dp))
    }
}