package com.example.myfirstapp.words

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.myfirstapp.words.pages.Animals

fun NavGraphBuilder.wordsGraph(
    navController: NavHostController
) {
    composable("words") {
        WordsScreen(navController)
    }

    composable("animals") {
        Animals()
    }
}