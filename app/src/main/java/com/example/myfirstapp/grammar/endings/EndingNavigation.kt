package com.example.myfirstapp.grammar.endings

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

fun NavGraphBuilder.endingGraph(
    navController: NavHostController
) {
    composable("endings") {
        AllEndings(navController)
    }

    composable("euse") {
        Euse()
    }

    composable("ne") {
        Ne()
    }

    composable("inquotend") {
        InQuot()
    }

    composable("inquestend") {
        InQuotQuest()
    }

    composable("command") {
        CommandEnd()
    }

    composable("invitationend") {
        InvitationEnd()
    }

    composable("da") {
        Da()
    }

    composable("deora") {
        Deora()
    }

    composable("kuna") {
        Kuna()
    }

    composable("janha") {
        Janha()
    }

    composable("keodeun") {
        Keodeun()
    }

    composable("ji") {
        Ji()
    }

    composable("neunkeoya") {
        NeunKeoya()
    }

    composable("neunde") {
        Neunde()
    }

    composable("ra") {
        Ra()
    }
}