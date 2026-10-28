package com.example.myfirstapp.grammar

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.myfirstapp.grammar.future.futureGraph
import com.example.myfirstapp.grammar.particles.particlesGraph

fun NavGraphBuilder.grammarGraph(
    navController: NavHostController
) {
    composable("grammar") {
        GrammarScreen(navController)
    }

    particlesGraph(navController)
    futureGraph(navController)

//    composable("nouns") {
//        NounsScreen(navController)
//    }
}