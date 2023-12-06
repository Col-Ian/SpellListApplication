package com.icapps.spelltablet.components.textcomponents.spellcard

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SpellCardFootNotes(
    text: String
){
    Text(
        modifier = Modifier
            .padding(horizontal = 8.dp),
        style = TextStyle(
            fontSize = 14.sp,
            fontStyle = FontStyle.Normal,
        ),
        text = text
    )
}