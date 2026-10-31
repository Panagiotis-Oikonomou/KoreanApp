package com.example.myfirstapp.words

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.myfirstapp.words.pages.Animals
import com.example.myfirstapp.words.pages.BodyParts
import com.example.myfirstapp.words.pages.Cloths
import com.example.myfirstapp.words.pages.Countries
import com.example.myfirstapp.words.pages.Family
import com.example.myfirstapp.words.pages.Fruits
import com.example.myfirstapp.words.pages.Furniture
import com.example.myfirstapp.words.pages.Jobs
import com.example.myfirstapp.words.pages.KitchenObjects
import com.example.myfirstapp.words.pages.Nature
import com.example.myfirstapp.words.pages.Organs
import com.example.myfirstapp.words.pages.OtherObjects
import com.example.myfirstapp.words.pages.Tools
import com.example.myfirstapp.words.pages.Vegetables
import com.example.myfirstapp.words.pages.Weather

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

    composable("kitchenobj") {
        KitchenObjects()
    }

    composable("otherobj") {
        OtherObjects()
    }

    composable("tools") {
        Tools()
    }

    composable("family") {
        Family()
    }

    composable("jobs") {
        Jobs()
    }

    composable("weather") {
        Weather()
    }

    composable("nature") {
        Nature()
    }

    composable("cloths") {
        Cloths()
    }

    composable("fruits") {
        Fruits()
    }

    composable("vegetables") {
        Vegetables()
    }

    composable("furniture") {
        Furniture()
    }
}