package com.example.myfirstapp.grammar

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.myfirstapp.grammar.auxiliary.auxilliaryGraph
import com.example.myfirstapp.grammar.because.becauseGraph
import com.example.myfirstapp.grammar.causative.causativeGraph
import com.example.myfirstapp.grammar.connectors.connectorsGraph
import com.example.myfirstapp.grammar.endings.endingGraph
import com.example.myfirstapp.grammar.future.futureGraph
import com.example.myfirstapp.grammar.indirectquotation.indirectquationGraph
import com.example.myfirstapp.grammar.makesentence.makesentenceGraph
import com.example.myfirstapp.grammar.modifying.modifyingGraph
import com.example.myfirstapp.grammar.particles.particlesGraph
import com.example.myfirstapp.grammar.questioncounter.questioncounterGraph
import com.example.myfirstapp.grammar.solo.About
import com.example.myfirstapp.grammar.solo.Anything
import com.example.myfirstapp.grammar.solo.AsYou
import com.example.myfirstapp.grammar.solo.Deunji
import com.example.myfirstapp.grammar.solo.Feelings
import com.example.myfirstapp.grammar.solo.HeSheThey
import com.example.myfirstapp.grammar.solo.IndirectQuestion
import com.example.myfirstapp.grammar.solo.Intention
import com.example.myfirstapp.grammar.solo.KessdaVsBoda
import com.example.myfirstapp.grammar.solo.Negation
import com.example.myfirstapp.grammar.solo.Opinion
import com.example.myfirstapp.grammar.solo.Passive
import com.example.myfirstapp.grammar.solo.PastExperience
import com.example.myfirstapp.grammar.solo.Permission
import com.example.myfirstapp.grammar.solo.Question
import com.example.myfirstapp.grammar.solo.Regret
import com.example.myfirstapp.grammar.solo.TheMost
import com.example.myfirstapp.grammar.solo.TimeDate
import com.example.myfirstapp.grammar.verbconstruction.verbconstructionGraph
import com.example.myfirstapp.grammar.verbtonoun.verbtonounGraph
import com.example.myfirstapp.verbconstruction.RatherVs

fun NavGraphBuilder.grammarGraph(
    navController: NavHostController
) {
    composable("grammar") {
        GrammarScreen(navController)
    }

    particlesGraph(navController)

    composable("negation") {
        Negation()
    }

    modifyingGraph(navController)

    composable("timedate") {
        TimeDate()
    }

    questioncounterGraph(navController)

    composable("question") {
        Question()
    }

    becauseGraph(navController)
    endingGraph(navController)
    connectorsGraph(navController)
    makesentenceGraph(navController)

    composable("permission") {
        Permission()
    }

    verbtonounGraph(navController)

    composable("intention") {
        Intention()
    }

    verbconstructionGraph(navController)

    composable("opinion") {
        Opinion()
    }
    composable("indirectquestion") {
        IndirectQuestion()
    }

    indirectquationGraph(navController)

    composable("anything") {
        Anything()
    }
    composable("deunji") {
        Deunji()
    }
    composable("heshethey") {
        HeSheThey()
    }
    composable("feelings") {
        Feelings()
    }

    futureGraph(navController)

    composable("passive") {
        Passive()
    }

    causativeGraph(navController)

    composable("pastexperience") {
        PastExperience()
    }

    auxilliaryGraph(navController)

    composable("kessdavsboda") {
        KessdaVsBoda()
    }
    composable("about") {
        About()
    }
    composable("themost") {
        TheMost()
    }
    composable("rathervs") {
        RatherVs()
    }
    composable("regret") {
        Regret()
    }
    composable("asyou") {
        AsYou()
    }
}