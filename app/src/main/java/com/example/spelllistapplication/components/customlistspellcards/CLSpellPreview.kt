package com.example.spelllistapplication.components.customlistspellcards

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.example.spelllistapplication.data.characterspelllist.CustomList

// To display when spell is collapsed
@Composable
fun CLSpellPreview(
    item: CustomList
){
    Text(
        textAlign = TextAlign.Center,
        text = item.spellTitle
    )
    Text(text = item.spellPreviewDescription)
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(text = "Level ${item.spellLevel}")
        }
        Column(horizontalAlignment = Alignment.End){
            Text(text = "${item.spellSourceBookPreview} ${item.spellSourcePage}")
        }
    }
}