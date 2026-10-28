package com.example.myfirstapp.grammar.future

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

fun NavGraphBuilder.futureGraph(
    navController: NavHostController
) {
    composable("future") {
        AllFuture(navController)
    }

    composable("kesseut") {
        Kesseut()
    }

    composable("eulke") {
        Eulke()
    }

    composable("eule") {
        Eule()
    }
}