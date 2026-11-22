package com.example.myfirstapp.words

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.myfirstapp.layouts.WordsLayout

fun NavGraphBuilder.wordsGraph(
    navController: NavHostController
) {
    composable("words") {
        WordsScreen(navController)
    }

    composable("adjectives") {
        AdjectivesScreen(navController)
    }

    composable("verbs") {
        VerbsScreen(navController)
    }

    composable("{upperLevel}/{categoryName}") { backStackEntry ->

        val categoryName = backStackEntry.arguments
            ?.getString("categoryName") ?: ""

        val whatFile = backStackEntry.arguments
            ?.getString("upperLevel") ?: ""
        var file = ""
        if(whatFile == "words") file = "vocabulary.txt"
        else if(whatFile == "adjectives") file = "adjectives.txt"
        else if(whatFile == "verbs") file = "verbs.txt"

        WordsLayout(categoryName, file)
    }
}