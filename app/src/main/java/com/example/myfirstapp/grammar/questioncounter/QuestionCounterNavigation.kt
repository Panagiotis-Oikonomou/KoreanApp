package com.example.myfirstapp.grammar.questioncounter

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

fun NavGraphBuilder.questioncounterGraph(
    navController: NavHostController
) {
    composable("questionwords") {
        AllQuestionCounter(navController)
    }

    composable("basicwords") {
        BasicWords()
    }

    composable("eotteon") {
        Eotteon()
    }

    composable("howmuch") {
        HowMuch()
    }

    composable("counterw") {
        CounterWords()
    }

    composable("myeot") {
        Myeot()
    }
}