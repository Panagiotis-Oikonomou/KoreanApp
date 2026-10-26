package com.example.myfirstapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myfirstapp.grammar.HomeScreen
import com.example.myfirstapp.grammar.auxiliary.AllAuxiliary
import com.example.myfirstapp.grammar.auxiliary.Become
import com.example.myfirstapp.grammar.auxiliary.Juda
import com.example.myfirstapp.grammar.because.AllBecause
import com.example.myfirstapp.grammar.because.BecauseNoun
import com.example.myfirstapp.grammar.because.Keure
import com.example.myfirstapp.grammar.because.Seo
import com.example.myfirstapp.grammar.because.Taemune
import com.example.myfirstapp.grammar.causative.AllCausative
import com.example.myfirstapp.grammar.causative.SuffixFour
import com.example.myfirstapp.grammar.causative.SuffixOne
import com.example.myfirstapp.grammar.causative.SuffixThree
import com.example.myfirstapp.grammar.causative.SuffixTwo
import com.example.myfirstapp.grammar.causative.ToMakeVerbFour
import com.example.myfirstapp.grammar.causative.ToMakeVerbOne
import com.example.myfirstapp.grammar.causative.ToMakeVerbThree
import com.example.myfirstapp.grammar.causative.ToMakeVerbTwo
import com.example.myfirstapp.grammar.connectors.AllConnectors
import com.example.myfirstapp.grammar.connectors.And
import com.example.myfirstapp.grammar.connectors.But
import com.example.myfirstapp.grammar.connectors.ButStill
import com.example.myfirstapp.grammar.connectors.Neurago
import com.example.myfirstapp.grammar.connectors.So
import com.example.myfirstapp.grammar.connectors.Then
import com.example.myfirstapp.grammar.connectors.TtaendeVsTaenikka
import com.example.myfirstapp.grammar.endings.AllEndings
import com.example.myfirstapp.grammar.endings.CommandEnd
import com.example.myfirstapp.grammar.endings.Da
import com.example.myfirstapp.grammar.endings.Deora
import com.example.myfirstapp.grammar.endings.Euse
import com.example.myfirstapp.grammar.endings.InQuot
import com.example.myfirstapp.grammar.endings.InQuotQuest
import com.example.myfirstapp.grammar.endings.InvitationEnd
import com.example.myfirstapp.grammar.endings.Janha
import com.example.myfirstapp.grammar.endings.Ji
import com.example.myfirstapp.grammar.endings.Keodeun
import com.example.myfirstapp.grammar.endings.Kuna
import com.example.myfirstapp.grammar.endings.Ne
import com.example.myfirstapp.grammar.endings.NeunKeoya
import com.example.myfirstapp.grammar.endings.Neunde
import com.example.myfirstapp.grammar.endings.Ra
import com.example.myfirstapp.grammar.future.AllFuture
import com.example.myfirstapp.grammar.future.Eule
import com.example.myfirstapp.grammar.future.Eulke
import com.example.myfirstapp.grammar.future.Kesseut
import com.example.myfirstapp.grammar.indirectquotation.AllIndirectQuotation
import com.example.myfirstapp.grammar.indirectquotation.IndirectCommand
import com.example.myfirstapp.grammar.indirectquotation.IndirectInvitation
import com.example.myfirstapp.grammar.indirectquotation.IndirectQuest
import com.example.myfirstapp.grammar.indirectquotation.IndirectQuot1
import com.example.myfirstapp.grammar.makesentence.AccordingTo
import com.example.myfirstapp.grammar.makesentence.AdverbialClause
import com.example.myfirstapp.grammar.makesentence.AllMakeSentence
import com.example.myfirstapp.grammar.makesentence.ForSomeone
import com.example.myfirstapp.grammar.makesentence.Introduce
import com.example.myfirstapp.grammar.makesentence.Jidweta
import com.example.myfirstapp.grammar.makesentence.MaeumeTeul
import com.example.myfirstapp.grammar.makesentence.Manyak
import com.example.myfirstapp.grammar.makesentence.NoMatterHow
import com.example.myfirstapp.grammar.makesentence.ShouldHave
import com.example.myfirstapp.grammar.makesentence.SimilarSituations
import com.example.myfirstapp.grammar.makesentence.Sureok
import com.example.myfirstapp.grammar.makesentence.ToFeel
import com.example.myfirstapp.grammar.makesentence.VerbMankeum
import com.example.myfirstapp.grammar.makesentence.VerbWithNoun
import com.example.myfirstapp.grammar.makesentence.WhileDoing
import com.example.myfirstapp.grammar.makesentence.WithoutVerbing
import com.example.myfirstapp.grammar.modifying.Adjective
import com.example.myfirstapp.grammar.modifying.AllModifying
import com.example.myfirstapp.grammar.modifying.Modifying
import com.example.myfirstapp.grammar.modifying.MorePast
import com.example.myfirstapp.grammar.modifying.PastPast
import com.example.myfirstapp.grammar.modifying.TipsForPast
import com.example.myfirstapp.grammar.particles.AllParticles
import com.example.myfirstapp.grammar.particles.AroundAbout
import com.example.myfirstapp.grammar.particles.Bakke
import com.example.myfirstapp.grammar.particles.Boda
import com.example.myfirstapp.grammar.particles.Cheoreom
import com.example.myfirstapp.grammar.particles.Do
import com.example.myfirstapp.grammar.particles.Dongan
import com.example.myfirstapp.grammar.particles.EParticle
import com.example.myfirstapp.grammar.particles.EgeHante
import com.example.myfirstapp.grammar.particles.Euro
import com.example.myfirstapp.grammar.particles.FollowsE
import com.example.myfirstapp.grammar.particles.Ina
import com.example.myfirstapp.grammar.particles.Man
import com.example.myfirstapp.grammar.particles.Subject
import com.example.myfirstapp.grammar.particles.WaKwaAndMore
import com.example.myfirstapp.grammar.questioncounter.AllQuestionCounter
import com.example.myfirstapp.grammar.questioncounter.BasicWords
import com.example.myfirstapp.grammar.questioncounter.CounterWords
import com.example.myfirstapp.grammar.questioncounter.Eotteon
import com.example.myfirstapp.grammar.questioncounter.HowMuch
import com.example.myfirstapp.grammar.questioncounter.Myeot
import com.example.myfirstapp.grammar.solo.About
import com.example.myfirstapp.grammar.solo.Anything
import com.example.myfirstapp.grammar.solo.AsYou
import com.example.myfirstapp.grammar.verbconstruction.Assumption
import com.example.myfirstapp.grammar.verbconstruction.AssumptionSkill
import com.example.myfirstapp.grammar.makesentence.BadChoices
import com.example.myfirstapp.grammar.makesentence.DagaVsaeoDaga
import com.example.myfirstapp.grammar.makesentence.DeoniVsaeoDeoni
import com.example.myfirstapp.grammar.solo.CanDo
import com.example.myfirstapp.grammar.verbconstruction.Concern
import com.example.myfirstapp.grammar.verbconstruction.Dependency
import com.example.myfirstapp.grammar.solo.Deunji
import com.example.myfirstapp.grammar.verbconstruction.Exaggeration
import com.example.myfirstapp.grammar.solo.Feelings
import com.example.myfirstapp.grammar.solo.HeSheThey
import com.example.myfirstapp.grammar.makesentence.Hypothetical
import com.example.myfirstapp.grammar.solo.IndirectQuestion
import com.example.myfirstapp.grammar.solo.Intention
import com.example.myfirstapp.grammar.solo.KessdaVsBoda
import com.example.myfirstapp.grammar.verbconstruction.Limitation
import com.example.myfirstapp.grammar.verbconstruction.Looks
import com.example.myfirstapp.grammar.makesentence.Must
import com.example.myfirstapp.grammar.solo.Negation
import com.example.myfirstapp.grammar.solo.Opinion
import com.example.myfirstapp.grammar.solo.Passive
import com.example.myfirstapp.grammar.solo.PastExperience
import com.example.myfirstapp.grammar.solo.Permission
import com.example.myfirstapp.grammar.solo.Question
import com.example.myfirstapp.grammar.verbconstruction.Recommendation
import com.example.myfirstapp.grammar.solo.Regret
import com.example.myfirstapp.grammar.solo.SeoVsJi
import com.example.myfirstapp.grammar.verbconstruction.Tendency
import com.example.myfirstapp.grammar.solo.TheMost
import com.example.myfirstapp.grammar.solo.TimeDate
import com.example.myfirstapp.grammar.makesentence.UnchangedCond
import com.example.myfirstapp.grammar.solo.ClarifyingSth
import com.example.myfirstapp.grammar.verbconstruction.Wish
import com.example.myfirstapp.grammar.verbconstruction.WorthIt
import com.example.myfirstapp.grammar.verbconstruction.AcknowledgeEfforts
import com.example.myfirstapp.grammar.verbconstruction.AllVerbConstruction
import com.example.myfirstapp.grammar.verbconstruction.AtTheSameTime
import com.example.myfirstapp.grammar.verbconstruction.ComingToDoSth
import com.example.myfirstapp.grammar.verbconstruction.ComingToPresent
import com.example.myfirstapp.grammar.verbconstruction.Completion
import com.example.myfirstapp.grammar.verbconstruction.Continuation
import com.example.myfirstapp.grammar.verbconstruction.GoingAround
import com.example.myfirstapp.grammar.verbconstruction.Hassle
import com.example.myfirstapp.grammar.verbconstruction.HowAbout
import com.example.myfirstapp.grammar.verbconstruction.ItSuits
import com.example.myfirstapp.grammar.verbconstruction.ItsNotThat
import com.example.myfirstapp.grammar.verbconstruction.Naturally
import com.example.myfirstapp.verbconstruction.RatherVs
import com.example.myfirstapp.grammar.verbconstruction.SomethingNew
import com.example.myfirstapp.grammar.verbconstruction.WhyBusy
import com.example.myfirstapp.grammar.verbtonoun.AllVerbToNoun
import com.example.myfirstapp.grammar.verbtonoun.DiffKiNeunkeot
import com.example.myfirstapp.grammar.verbtonoun.Ki
import com.example.myfirstapp.grammar.verbtonoun.KiFixed
import com.example.myfirstapp.grammar.verbtonoun.NeunKeot


@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(navController)
        }

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

        composable("negation") {
            Negation()
        }

        composable("modifyingall") {
            AllModifying(navController)
        }

        composable("modifying") {
            Modifying()
        }

        composable("morepast") {
            MorePast()
        }

        composable("tipsforpast") {
            TipsForPast()
        }

        composable("adjective") {
            Adjective()
        }

        composable("pastpast") {
            PastPast()
        }

        composable("timedate") {
            TimeDate()
        }

        composable("questionwords") {
            AllQuestionCounter(navController)
        }

        composable("basicwords") {
            BasicWords()
        }

        composable("eotteon") {
            Eotteon()
        }

        composable("howmuch") {
            HowMuch()
        }

        composable("counterw") {
            CounterWords()
        }

        composable("myeot") {
            Myeot()
        }

        composable("question") {
            Question()
        }

        composable("becauseall") {
            AllBecause(navController)
        }

        composable("seo") {
            Seo()
        }

        composable("ttaemune") {
            Taemune()
        }

        composable("keure") {
            Keure()
        }

        composable("becausenoun") {
            BecauseNoun()
        }

        composable("endings") {
            AllEndings(navController)
        }

        composable("euse") {
            Euse()
        }

        composable("ne") {
            Ne()
        }

        composable("inquotend") {
            InQuot()
        }

        composable("inquestend") {
            InQuotQuest()
        }

        composable("command") {
            CommandEnd()
        }

        composable("invitationend") {
            InvitationEnd()
        }

        composable("da") {
            Da()
        }

        composable("deora") {
            Deora()
        }

        composable("kuna") {
            Kuna()
        }

        composable("janha") {
            Janha()
        }

        composable("keodeun") {
            Keodeun()
        }

        composable("ji") {
            Ji()
        }

        composable("neunkeoya") {
            NeunKeoya()
        }

        composable("neunde") {
            Neunde()
        }

        composable("ra") {
            Ra()
        }

        composable("connectors") {
            AllConnectors(navController)
        }

        composable("and") {
            And()
        }

        composable("but") {
            But()
        }

        composable("butstill") {
            ButStill()
        }

        composable("so") {
            So()
        }

        composable("then") {
            Then()
        }

        composable("ttaendevstaenikka") {
            TtaendeVsTaenikka()
        }

        composable("neurago") {
            Neurago()
        }

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

        composable("permission") {
            Permission()
        }

        composable("allverbtonoun") {
            AllVerbToNoun(navController)
        }

        composable("ki") {
            Ki()
        }

        composable("neunkeot") {
            NeunKeot()
        }

        composable("kifixed") {
            KiFixed()
        }

        composable("diffkineunkeot") {
            DiffKiNeunkeot()
        }

        composable("intention") {
            Intention()
        }

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

        composable("opinion") {
            Opinion()
        }

        composable("indirectquestion") {
            IndirectQuestion()
        }

        composable("indirectquotation") {
            AllIndirectQuotation(navController)
        }

        composable("indirectquo") {
            IndirectQuot1()
        }

        composable("indirectques") {
            IndirectQuest()
        }

        composable("indirectcommand") {
            IndirectCommand()
        }

        composable("indirectinvitation") {
            IndirectInvitation()
        }

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

        composable("future") {
            AllFuture(navController)
        }

        composable("kesseut") {
            Kesseut()
        }

        composable("eulke") {
            Eulke()
        }

        composable("eule") {
            Eule()
        }

        composable("passive") {
            Passive()
        }

        composable("causative") {
            AllCausative(navController)
        }

        composable("suffixone") {
            SuffixOne()
        }

        composable("suffixtwo") {
            SuffixTwo()
        }

        composable("suffixthree") {
            SuffixThree()
        }

        composable("suffixfour") {
            SuffixFour()
        }

        composable("tomakeverbone") {
            ToMakeVerbOne()
        }

        composable("tomakeverbtwo") {
            ToMakeVerbTwo()
        }

        composable("tomakeverbthree") {
            ToMakeVerbThree()
        }

        composable("tomakeverbfour") {
            ToMakeVerbFour()
        }

        composable("pastexperience") {
            PastExperience()
        }

        composable("auxiliary") {
            AllAuxiliary(navController)
        }

        composable("juda") {
            Juda()
        }

        composable("boda") {
            Boda()
        }

        composable("become") {
            Become()
        }

        composable("kessdavsboda") {
            KessdaVsBoda()
        }

        composable("about") {
            About()
        }

        composable("themost") {
            TheMost()
        }

        composable("must") {
            Must()
        }

        composable("looks") {
            Looks()
        }

        composable("rathervs") {
            RatherVs()
        }

        composable("assumptionskill") {
            AssumptionSkill()
        }

        composable("assumption") {
            Assumption()
        }

        composable("regret") {
            Regret()
        }

        composable("wish") {
            Wish()
        }

        composable("tendency") {
            Tendency()
        }

        composable("hypothetical") {
            Hypothetical()
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

        composable("badchoices") {
            BadChoices()
        }

        composable("unchangedcond") {
            UnchangedCond()
        }

        composable("asyou") {
            AsYou()
        }

        composable("cando") {
            CanDo()
        }

        composable("seovsji") {
            SeoVsJi()
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

        composable("clarifyingsth") {
            ClarifyingSth()
        }
    }
}