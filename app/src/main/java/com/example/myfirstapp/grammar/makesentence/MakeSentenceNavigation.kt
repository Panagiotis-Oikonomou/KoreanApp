package com.example.myfirstapp.grammar.makesentence

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

fun NavGraphBuilder.makesentenceGraph(
    navController: NavHostController
) {
    composable("makesentence") {
        AllMakeSentence(navController)
    }

    composable("adverbial") {
        AdverbialClause()
    }

    composable("shouldhave") {
        ShouldHave()
    }

    composable("verbwithnoun") {
        VerbWithNoun()
    }

    composable("suroeok") {
        Sureok()
    }

    composable("maeumteul") {
        MaeumeTeul()
    }

    composable("tofeel") {
        ToFeel()
    }

    composable("nomatterhow") {
        NoMatterHow()
    }

    composable("manyak") {
        Manyak()
    }

    composable("jidweta") {
        Jidweta()
    }

    composable("verbmankeum") {
        VerbMankeum()
    }

    composable("introduce") {
        Introduce()
    }

    composable("forsomeone") {
        ForSomeone()
    }

    composable("similarsituations") {
        SimilarSituations()
    }

    composable("withoutverbing") {
        WithoutVerbing()
    }

    composable("whiledoing") {
        WhileDoing()
    }

    composable("dagavsaeodaga") {
        DagaVsaeoDaga()
    }

    composable("deonivsaeodeoni") {
        DeoniVsaeoDeoni()
    }

    composable("accordingto") {
        AccordingTo()
    }

    composable("must") {
        Must()
    }

    composable("hypothetical") {
        Hypothetical()
    }

    composable("badchoices") {
        BadChoices()
    }

    composable("unchangedcond") {
        UnchangedCond()
    }
}