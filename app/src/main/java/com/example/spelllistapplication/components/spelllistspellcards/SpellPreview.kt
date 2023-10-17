package com.example.spelllistapplication.components.spelllistspellcards

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.example.spelllistapplication.data.allspellslist.SpellDataModel

// To display when the Spell is collapsed
@Composable
fun SpellPreview(
    item: SpellDataModel
){
    Text(
        textAlign = TextAlign.Center,
        text = item.spellTitle
    )
    Text(
        textAlign = TextAlign.Center,
        text = item.spellPreviewDescription
    )
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = item.spellClassesWithLevelPreview.joinToString { it })

        Text(text = "${item.spellSourceBookPreview} ${item.spellSourcePage}")
    }
}