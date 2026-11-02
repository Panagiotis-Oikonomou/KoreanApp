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
    composable("words/{categoryName}") { backStackEntry ->

        val categoryName = backStackEntry.arguments
            ?.getString("categoryName") ?: ""

        WordsLayout(categoryName)
    }
}