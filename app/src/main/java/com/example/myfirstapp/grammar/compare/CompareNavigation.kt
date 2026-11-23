package com.example.myfirstapp.grammar.compare

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

fun NavGraphBuilder.compareGraph(
    navController: NavHostController
) {
    composable("comparegrammars") {
        AllCompare(navController)
    }

    composable("seovsji") {
        SeoVsJi()
    }

    composable("kessdavsboda") {
        KessdaVsBoda()
    }

    composable("about") {
        About()
    }

    composable("rathervs") {
        RatherVs()
    }

    composable("MyeonVsTtae") {
        MyeonVsTtae()
    }

    composable("dagavsaeodaga") {
        DagaVsaeoDaga()
    }

    composable("deonivsaeodeoni") {
        DeoniVsaeoDeoni()
    }

    composable("looksvs") {
        LooksVs()
    }

    composable("dalagovsjulago") {
        DalagoVsJulago()
    }
}