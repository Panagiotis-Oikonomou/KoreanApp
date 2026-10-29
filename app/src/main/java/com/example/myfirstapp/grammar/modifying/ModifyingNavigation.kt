package com.example.myfirstapp.grammar.modifying

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

fun NavGraphBuilder.modifyingGraph(
    navController: NavHostController
) {
    composable("modifyingall") {
        AllModifying(navController)
    }

    composable("modifying") {
        Modifying()
    }

    composable("morepast") {
        MorePast()
    }

    composable("tipsforpast") {
        TipsForPast()
    }

    composable("adjective") {
        Adjective()
    }

    composable("pastpast") {
        PastPast()
    }
}