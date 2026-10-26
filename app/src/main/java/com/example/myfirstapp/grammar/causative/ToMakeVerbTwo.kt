package com.example.myfirstapp.grammar.causative

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstapp.layouts.ExamplesLayout
import com.example.myfirstapp.layouts.StructureLayout
import com.example.myfirstapp.ui.theme.MyBackground

@Composable
fun ToMakeVerbTwo() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(text = "To make someone verb(게 하다)", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))

        Text( text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "This grammar pattern is a construction that means \"to make (someone) do (something)\". It's used when someone causes or makes another person do an action or experience something. Using an adjective is often interchangeable with Adjective + 게 만들다.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text( text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Causer(subject) + Causee(object[을/를, 에게/한테, 이/가]) + Verb stem + 게 하다"))

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "제가 고양이한테 물을 마시게 했어요." to "I made the cat drink water.",
                "방행제는 안 좋은 냄새를 사라지게 해요." to "The air freshener made the odor disappear."
            )
        )

        Text(text = "한테/에게 is not used with Objects.", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(8.dp))

        ExamplesLayout(
            listOf(
                "제가 실수로 아이를 놀라게 했어요." to "I startled the child by mistake.",
                "이 수업은 저를 열심히 공부하게 해요." to "This class makes me study hard.",
                "이 의자가 공부하기 편하게 만들어요." to "This chair makes it comfortable to study.",
                "음악이 제가 항복하게 해요." to "Music makes me happy."
            )
        )

        Text(text = "When -시키다 it's used without an person it doesn't sound natural", fontSize = 16.sp)
        Text(
            text = "-게 하다 it doesn't have limitations or there's no difference it depends on the verb for example 공부하게 하다 sounds better but 감동시키다 and 감동하게 하다 it's the same.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}