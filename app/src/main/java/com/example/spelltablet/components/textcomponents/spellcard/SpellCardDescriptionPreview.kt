package com.example.spelltablet.components.textcomponents.spellcard

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SpellCardDescriptionPreview(
    text: String
){

    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 4.dp),
        style = TextStyle(
            fontSize = 16.sp,
            fontStyle = FontStyle.Normal,
        ),
        textAlign = TextAlign.Center,
        text = text
    )
}