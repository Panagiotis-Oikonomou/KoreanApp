package com.example.myfirstapp.grammar.verbconstruction

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
fun AllVerbConstruction(navController: NavController) {
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

        Text(text = "Verb Construction", style = MaterialTheme.typography.headlineMedium)

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("continuation")}
        ) { Text("Verb-아/어 가다 — Continuation/Progression")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("comingtopresent")}
        ) { Text("Verb-아/어 오다 — Action continuing from the past")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("completion")}
        ) { Text("Verb-아/어 버리다 — Completion")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("somethingnew")}
        ) { Text("Noun-이/가 생기다 — Getting/Having Something New")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("comingtodosth")}
        ) { Text("Verb-게 되다 — Coming to Do Something")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("atthesametime")}
        ) { Text("V/A-기도 하다 — Sometimes / Also / Do sometimes")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("itsnotthat")}
        ) { Text("V-는 / A-ㄴ(은) 것은 아니다 — It’s not that…")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("howabout")}
        ) { Text("V-는 거 어때? — How about…?")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("hassle")}
        ) { Text("V-기 귀찮다 — It’s a hassle to…")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("goingaround")}
        ) { Text("Going Around Doing Something -다니다")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("naturally")}
        ) { Text("-는/ㄴ/은 법이다, -기 마련이다 — It is the way things are / Naturally")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("whybusy")}
        ) { Text("-느라 비쁘다 — Why you are busy")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("acknowledgeefforts")}
        ) { Text("-느라 수고하셨다/고생하셨다  — Acknowledge sm efforts")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("looks")}
        ) { Text("Adj-게 생겼다 — looks / seems…")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("assumptionskill")}
        ) { Text("알았다, 몰랐다 — Assumption, Skill or Ability")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("assumption")}
        ) { Text("모양이다, 나/가 보다 — Assumption")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("wish")}
        ) { Text("(으)면 좋겠습니다 — Expressing ones Wish")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("tendency")}
        ) { Text("는/은/ㄴ 편이다 — Tendency")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("dependency")}
        ) { Text("기에 달려 있다, 기 나름이다 — Dependency")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("worthit")}
        ) { Text("ㄹ/을 만하다 — Worth doing it")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("limitation")}
        ) { Text("ㄹ/을 뿐이다 — Limitation, Exclusiveness")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("concern")}
        ) { Text("ㄹ/을까봐 걱정되다 — Expressing concern")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("exaggeration")}
        ) { Text("아/어 죽겠다/죽겠네 — Exaggeration")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("reccomendation")}
        ) { Text("지 그래 — Suggestion, gentle Recommendation")}

        Button(
            modifier = Modifier.fillMaxWidth(), onClick = {navController.navigate("itsuits")}
        ) { Text("-에 맞다 — To Fit, Suit, or be Appropriate for Something")}

        Spacer(modifier = Modifier.height(16.dp))
    }
}