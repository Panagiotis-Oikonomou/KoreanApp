package com.example.myfirstapp.grammar.verbconstruction

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

fun NavGraphBuilder.verbconstructionGraph(
    navController: NavHostController
) {
    composable("verbconstruction") {
        AllVerbConstruction(navController)
    }

    composable("continuation") {
        Continuation()
    }

    composable("comingtopresent") {
        ComingToPresent()
    }

    composable("completion") {
        Completion()
    }

    composable("somethingnew") {
        SomethingNew()
    }

    composable("comingtodosth") {
        ComingToDoSth()
    }

    composable("atthesametime") {
        AtTheSameTime()
    }

    composable("itsnotthat") {
        ItsNotThat()
    }

    composable("howabout") {
        HowAbout()
    }

    composable("hassle") {
        Hassle()
    }

    composable("goingaround") {
        GoingAround()
    }

    composable("naturally") {
        Naturally()
    }

    composable("whybusy") {
        WhyBusy()
    }

    composable("acknowledgeefforts") {
        AcknowledgeEfforts()
    }

    composable("itsuits") {
        ItSuits()
    }

    composable("looks") {
        Looks()
    }

    composable("assumptionskill") {
        AssumptionSkill()
    }

    composable("assumption") {
        Assumption()
    }

    composable("wish") {
        Wish()
    }

    composable("tendency") {
        Tendency()
    }

    composable("dependency") {
        Dependency()
    }

    composable("worthit") {
        WorthIt()
    }

    composable("limitation") {
        Limitation()
    }

    composable("concern") {
        Concern()
    }

    composable("exaggeration") {
        Exaggeration()
    }

    composable("reccomendation") {
        Recommendation()
    }
}