package com.example.myfirstapp.grammar.compare

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
fun AllCompare(navController: NavController) {
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
            text = "Compare Grammars",
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("seovsji")}
        ) { Text("겠어 vs 겠지")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("kessdavsboda")}
        ) { Text("V/A-겠다 vs V-나 보다, A-ㄴ/은가 보다")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("about")}
        ) { Text("About: -에 대한 vs -에 대해서")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("rathervs")}
        ) { Text("오히려 vs 차라리")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("ttaendevstaenikka")}
        ) { Text("ㄹ/을테다 vs ㄹ/을 거다")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("dagavsaeodaga")}
        ) { Text("다가 vs 았/었다가")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("deonivsaeodeoni")}
        ) { Text("더니 vs 았/었더니")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("MyeonVsTtae")}
        ) { Text("-(으)면 vs -ㄹ/을 때")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("looksvs")}
        ) { Text("Adj-아/어 보이다 vs Adj-게 생겼다")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("dalagovsjulago")}
        ) { Text("달라고 하다 vs 주라고 하다")}

        Spacer(modifier = Modifier.height(16.dp))
    }
}