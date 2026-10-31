package com.example.myfirstapp.words.pages

import androidx.compose.runtime.Composable
import com.example.myfirstapp.layouts.WordsLayout

@Composable
fun Jobs(){
    WordsLayout(
        title = "Jobs",
        words = listOf(
            "Athlete" to "운동선수",
            "Carpenter" to "목수",
            "Cashier" to "출납계원",
            "Dentist" to "치과의사",
            "Detective" to "수사관",
            "Farmer" to "농부",
            "Firefighter" to "소방관",
            "Janitor" to "관리인",
            "Journalist" to "기자",
            "Judge" to "판사",
            "Lawyer" to "변호사",
            "Mechanic" to "정비공",
            "Nurse" to "간호사",
            "Pharmacist" to "약사",
            "Pilot" to "비행사",
            "Policeman" to "경찰관",
            "Professor" to "교수",
            "Prosecutor" to "검사",
            "Secretary" to "비서",
            "Veterinarian" to "수의사",
            "Waiter" to "정업원"
        )

    )
}