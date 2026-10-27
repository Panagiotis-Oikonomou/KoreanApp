package com.example.myfirstapp.grammar

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
fun GrammarScreen(navController: NavController) {
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

        Text(text = "Grammar", style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Bold)

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("particles")}
        ) { Text("Particles")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("negation")}
        ) { Text("Negation")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("modifyingall")}
        ) { Text("Modifying Form")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("timedate")}
        ) { Text("Time and Date")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("questionwords")}
        ) { Text("Question Words")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("question")}
        ) { Text("Questions")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("becauseall")}
        ) { Text("Because")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("endings")}
        ) { Text("Sentence Endings")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("connectors")}
        ) { Text("Sentence Connectors")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("makesentence")}
        ) { Text("Grammatical Expressions")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("permission")}
        ) { Text("도 되다, 도 안 되다, (으)면 되다, (으)면 안 되다 — Giving Permission")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("verbtonoun")}
        ) { Text("Verb to Noun")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("intention")}
        ) { Text("(으)려고, (으)러, 게, 도록 — Saying your Intention")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("verbconstruction")}
        ) { Text("Verb Construction")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("opinion")}
        ) { Text("다고 생각하다, 는/ㄴ/은 것 같다 — Expressing your Opinion")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("indirectquestion")}
        ) { Text("는/ㄴ/은지 — Indirect Question")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("indirectquotation")}
        ) { Text("Indirect Quotation")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("anything")}
        ) { Text("How to say Anything, Anybody, Nothing, Nobody")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("deunji")}
        ) { Text("든지 — Extra Anything")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("heshethey")}
        ) { Text("He/She/They")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("feelings")}
        ) { Text("아/어하다 — Feelings in 3rd person")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("future")}
        ) { Text("More Future")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("passive")}
        ) { Text("Passive Verbs")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("causative")}
        ) { Text("Causative Verbs")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("pastexperience")}
        ) { Text("ㄴ/은 적이 있다/없다 — Past Experience")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("auxiliary")}
        ) { Text("Auxiliary Verbs")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("kessdavsboda")}
        ) { Text("V/A-겠다 vs V-나 보다, A-ㄴ/은가 보다")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("about")}
        ) { Text("About: -에 대한 vs -에 대해서")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("themost")}
        ) { Text("가장/제일 — The most")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("rathervs")}
        ) { Text("오히려 vs 차라리")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("regret")}
        ) { Text("ㄹ/을 걸 그랬다, 괜히, 았/었어야 했다 — Showing Regret")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("asyou")}
        ) { Text("시피 — As you...")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("cando")}
        ) { Text("ㄹ/을 수 있다/없다 — Ability, Possibility, Permission")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("seovsji")}
        ) { Text("겠어 vs 겠지")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("clarifyingsth")}
        ) { Text("-는/ㄴ/은 것이다 — Explaining, Emphasizing, or Clarifying Something")}

        Spacer(modifier = Modifier.height(16.dp))
    }
}