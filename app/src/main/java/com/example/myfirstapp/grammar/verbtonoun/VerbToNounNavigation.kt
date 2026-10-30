package com.example.myfirstapp.grammar.verbtonoun

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

fun NavGraphBuilder.verbtonounGraph(
    navController: NavHostController
) {
    composable("allverbtonoun") {
        AllVerbToNoun(navController)
    }

    composable("ki") {
        Ki()
    }

    composable("neunkeot") {
        NeunKeot()
    }

    composable("kifixed") {
        KiFixed()
    }

    composable("diffkineunkeot") {
        DiffKiNeunkeot()
    }
}