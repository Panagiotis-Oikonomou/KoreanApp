package com.example.myfirstapp.grammar.auxiliary

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.myfirstapp.grammar.particles.Boda

fun NavGraphBuilder.auxilliaryGraph(
    navController: NavHostController
) {
    composable("auxiliary") {
        AllAuxiliary(navController)
    }

    composable("juda") {
        Juda()
    }

    composable("boda") {
        Boda()
    }

    composable("become") {
        Become()
    }
}