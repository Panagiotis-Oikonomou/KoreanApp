package com.example.myfirstapp.grammar.particles

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

fun NavGraphBuilder.particlesGraph(
    navController: NavHostController
) {
    composable("particles") {
        AllParticles(navController)
    }

    composable("bakke") {
        Bakke()
    }

    composable("boda") {
        Boda()
    }

    composable("cheoreom") {
        Cheoreom()
    }

    composable("do") {
        Do()
    }

    composable("egehante") {
        EgeHante()
    }

    composable("eparticle") {
        EParticle()
    }

    composable("euro") {
        Euro()
    }

    composable("followse") {
        FollowsE()
    }

    composable("ina") {
        Ina()
    }

    composable("man") {
        Man()
    }

    composable("subject") {
        Subject()
    }

    composable("wakwaandmore") {
        WaKwaAndMore()
    }

    composable("dongan") {
        Dongan()
    }

    composable("aroundabout") {
        AroundAbout()
    }
}