package com.example.myfirstapp.grammar.connectors

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

fun NavGraphBuilder.connectorsGraph(
    navController: NavHostController
) {
    composable("connectors") {
        AllConnectors(navController)
    }

    composable("and") {
        And()
    }

    composable("but") {
        But()
    }

    composable("butstill") {
        ButStill()
    }

    composable("so") {
        So()
    }

    composable("then") {
        Then()
    }

    composable("ttaendevstaenikka") {
        TtaendeVsTaenikka()
    }

    composable("neurago") {
        Neurago()
    }
}