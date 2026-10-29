package com.example.myfirstapp.grammar.because

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

fun NavGraphBuilder.becauseGraph(
    navController: NavHostController
) {
    composable("becauseall") {
        AllBecause(navController)
    }

    composable("seo") {
        Seo()
    }

    composable("ttaemune") {
        Taemune()
    }

    composable("keure") {
        Keure()
    }

    composable("becausenoun") {
        BecauseNoun()
    }
}