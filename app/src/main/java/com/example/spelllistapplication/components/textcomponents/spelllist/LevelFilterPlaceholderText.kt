package com.example.spelllistapplication.components.textcomponents.spelllist

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LevelFilterPlaceholderText(
    text: String
) {
    Text(
        text = text,
        modifier = Modifier
            .padding(2.dp),
        style = TextStyle(
            fontSize = 16.sp,
            fontStyle = FontStyle.Normal
        )
    )
}