package com.example.myfirstapp.grammar

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.myfirstapp.grammar.because.becauseGraph
import com.example.myfirstapp.grammar.connectors.connectorsGraph
import com.example.myfirstapp.grammar.endings.endingGraph
import com.example.myfirstapp.grammar.future.futureGraph
import com.example.myfirstapp.grammar.modifying.modifyingGraph
import com.example.myfirstapp.grammar.particles.particlesGraph
import com.example.myfirstapp.grammar.questioncounter.questioncounterGraph
import com.example.myfirstapp.grammar.solo.Negation
import com.example.myfirstapp.grammar.solo.Question
import com.example.myfirstapp.grammar.solo.TimeDate

fun NavGraphBuilder.grammarGraph(
    navController: NavHostController
) {
    composable("grammar") {
        GrammarScreen(navController)
    }

    particlesGraph(navController)

    composable("negation") {
        Negation()
    }

    modifyingGraph(navController)

    composable("timedate") {
        TimeDate()
    }

    questioncounterGraph(navController)

    composable("question") {
        Question()
    }

    becauseGraph(navController)
    endingGraph(navController)
    connectorsGraph(navController)

    futureGraph(navController)
}