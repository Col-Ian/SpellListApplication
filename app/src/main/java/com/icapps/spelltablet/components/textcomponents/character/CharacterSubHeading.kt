package com.icapps.spelltablet.components.textcomponents.character

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CharacterSubHeading(
    text: String
){
    Text(
        modifier = Modifier
            .padding(4.dp),
        style = TextStyle(
            fontSize = 16.sp,
            fontStyle = FontStyle.Normal,
        ),
        text = text
    )
}