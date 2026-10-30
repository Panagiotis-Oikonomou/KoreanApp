package com.example.myfirstapp.grammar.makesentence

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

@Composable
fun AllMakeSentence(navController: NavController) {
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
            text = "Grammatical Expressions",
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("adverbial")}
        ) { Text("-ㄹ/을 때 — Adverbial Clause")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("shouldhave")}
        ) { Text("-아/어 야겠다/야되겠다, -아/어 + 야 되다/하다 — I Should Verb and I Have to Verb")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("verbwithnoun")}
        ) { Text("없이 — To Verb without a Noun")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("suroeok")}
        ) { Text("-ㄹ/을 수록 — Comparative expression")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("maeumteul")}
        ) { Text("-이/가 마음에 들다 — Liking something")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("tofeel")}
        ) { Text("-는/ㄴ/은 마음이 들다 — To Feel someway")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("nomatterhow")}
        ) { Text("아무리 + -아/어도 — No matter how much you Verb/Adjective")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("manyak")}
        ) { Text("-더라도 — Assuming a hypothetical situation")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("jidweta")}
        ) { Text("-ㄴ/은 지 + [time](이) 됬다 — Time since then")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("verbmankeum")}
        ) { Text("만큼 with Verbs and Adjectives")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("introduce")}
        ) { Text("Introduce Yourself")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("forsomeone")}
        ) { Text("Noun-을/를 위해서 — Doing Something For Someone/Something")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("similarsituations")}
        ) { Text("-듯(이) — Comparing similar situations")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("withoutverbing")}
        ) { Text("-지 않고서 — without doing")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("whiledoing")}
        ) { Text("-(으)면서 — While / at the same time / whereas")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("must")}
        ) { Text("Verb/Adj-아/어야 — Must / Only If")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("hypothetical")}
        ) { Text("더라도 — Hypothetical")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("badchoices")}
        ) { Text("느니 차라리 — Compare bad choices")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("unchangedcond")}
        ) { Text("ㄴ/은 채 — An unchanged condition")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("dagavsaeodaga")}
        ) { Text("다가 vs 았/었다가")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("deonivsaeodeoni")}
        ) { Text("더니 vs 았/었더니")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("accordingto")}
        ) { Text("-에 따라 — Depending on / According to / In accordance with")}

        Spacer(modifier = Modifier.height(16.dp))
    }
}