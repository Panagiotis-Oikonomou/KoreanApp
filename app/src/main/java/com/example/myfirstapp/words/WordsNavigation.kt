package com.example.myfirstapp.words

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.myfirstapp.words.pages.Animals
import com.example.myfirstapp.words.pages.BodyParts
import com.example.myfirstapp.words.pages.Countries
import com.example.myfirstapp.words.pages.Organs

fun NavGraphBuilder.wordsGraph(
    navController: NavHostController
) {
    composable("words") {
        WordsScreen(navController)
    }

    composable("animals") {
        Animals()
    }

    composable("countries") {
        Countries()
    }

    composable("bodyparts") {
        BodyParts()
    }

    composable("organs") {
        Organs()
    }
}