package com.example.spelllistapplication.components.spelllistspellcards

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.spelllistapplication.components.textcomponents.spellcard.SpellCardDescriptionPreview
import com.example.spelllistapplication.components.textcomponents.spellcard.SpellCardFootNotes
import com.example.spelllistapplication.components.textcomponents.spellcard.SpellCardHeading
import com.example.spelllistapplication.data.allspellslist.SpellDataModel

// To display when the Spell is collapsed
@Composable
fun SpellPreview(
    item: SpellDataModel
){
    SpellCardHeading(text = item.spellTitle)
    SpellCardDescriptionPreview(text = item.spellPreviewDescription)
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        SpellCardFootNotes(text = item.spellClassesWithLevelPreview.joinToString { it })

        SpellCardFootNotes(text = "${item.spellSourceBookPreview} ${item.spellSourcePage}")
    }
}