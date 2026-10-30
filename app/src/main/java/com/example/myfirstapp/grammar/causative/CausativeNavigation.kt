package com.example.myfirstapp.grammar.causative

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

fun NavGraphBuilder.causativeGraph(
    navController: NavHostController
) {
    composable("causative") {
        AllCausative(navController)
    }

    composable("suffixone") {
        SuffixOne()
    }

    composable("suffixtwo") {
        SuffixTwo()
    }

    composable("suffixthree") {
        SuffixThree()
    }

    composable("suffixfour") {
        SuffixFour()
    }

    composable("tomakeverbone") {
        ToMakeVerbOne()
    }

    composable("tomakeverbtwo") {
        ToMakeVerbTwo()
    }

    composable("tomakeverbthree") {
        ToMakeVerbThree()
    }

    composable("tomakeverbfour") {
        ToMakeVerbFour()
    }
}