package com.example.myfirstapp.grammar.indirectquotation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

fun NavGraphBuilder.indirectquationGraph(
    navController: NavHostController
) {
    composable("indirectquotation") {
        AllIndirectQuotation(navController)
    }

    composable("indirectquo") {
        IndirectQuot1()
    }

    composable("indirectques") {
        IndirectQuest()
    }

    composable("indirectcommand") {
        IndirectCommand()
    }

    composable("indirectinvitation") {
        IndirectInvitation()
    }
}