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
fun SuffixFour() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MyBackground)
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Text(
            text = "Adding suffixes extra",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text( text = "Description", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Causative verbs are used to indicate that the subject makes or lets someone do something. You actually do the action.", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(20.dp))

        Text( text = "Structure", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        StructureLayout(listOf("Verb/Adjective + 이/리/히/기/우/추/구/시/애"))

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "It has the same rule as it is in the Passive", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Examples", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "1. 속다(to be deceived/fooled) <> 속이다(to deceive/fool)", fontSize = 16.sp)
        ExamplesLayout(
            listOf(
                "만우절 거짓말에 속았어요." to "I was fooled by April fools day.",
                "다른 사람을 속이는 말을 거짓말이라고 해요." to "Lies are the words that you use to deceive other people."
            )
        )

        Text(text = "2. 붙다(to get attached/stick) <> 붙이다(to attach sth)", fontSize = 16.sp)
        ExamplesLayout(
            listOf(
                "머리에 껌이 붙었어요." to "A gum it's stuck to my hair.",
                "운전을 처음 하는 사람들은 \"초보 운전\" 스티커를 차 뒤에 붙여요." to "People that drive for the first time attach a sticker in the back of their car."
            )
        )

        Text(text = "3. 익다(to be cooked) <> 익히다(to cook sth, to make sth cooked)", fontSize = 16.sp)
        ExamplesLayout(
            listOf(
                "감자가 아직 안 익었으니까 조금만 기다리세요." to "The potato is not yet cooked so please wait a little bit.",
                "닭고기를 익히지 않으면 배탈이 날 거예요." to "If you don't cook the chicken you will get stomach ash."
            )
        )

        Text(text = "4. 옮다(to be transferred/infected) <> 옮기다(to transfer/transmit/infect sth)", fontSize = 16.sp)
        ExamplesLayout(
            listOf(
                "친구한테 감기가 옮았어요." to "I caught a cold from my friend.",
                "핸드폰에 있는 사진을 컴퓨터를 옮기고 싶어요." to "I want to transfer the photos from my phone to my desktop."
            )
        )

        Text(text = "5. 남다(to remain, to be left) <> 남기다(to leave behind)", fontSize = 16.sp)
        ExamplesLayout(
            listOf(
                "밤이 왜 이렇게 많이 남았어요." to "Why is there so much meal left.",
                "배가 불어서 밥을 많이 남겼어요." to "I am full so I left behind a lot of food."
            )
        )

        Text(text = "6. 없다 <> 없애다(to remove/get rid of)", fontSize = 16.sp)
        ExamplesLayout(
            listOf(
                "커피를 쏟아서 바지에 얼룩이 졌어요. 얼룩을 없앨 수 있는 방법을 알려주세요." to "I spill my coffee so theres a stain in my pants. Please let me know a way to get rid of the stain."
            )
        )

        Text(text = "7. 맡다(to take on/undertake) <> 맡기다(let someone undertake, to entrust)", fontSize = 16.sp)
        ExamplesLayout(
            listOf(
                "제가 이번 프로젝트를 맡았어요." to "I undertook that project.",
                "대표님께서 저에게 중요한 일을 맡겨 주셔서 영광입니다." to "I am honored that the CEO entrusted me with an important task."
            )
        )

        Text(text = "8. 끼다(to wear on your-ears/eyes/fingers) <> 끼우다(to put it on for someone)", fontSize = 16.sp)
        ExamplesLayout(
            listOf(
                "도서관에서 음악을 듣고 싶으면 반드시 이어폰을 끼어주세요." to "If you want to listen music in the library wear earphones.",
                "여자친구에게 청혼하면서 반지를 끼워요." to "I put the ring on my girlfriend's finger while proposing."
            )
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}