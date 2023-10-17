package com.example.spelllistapplication.components.customlistspellcards

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.spelllistapplication.data.characterspelllist.CustomList

// To display when the Spell is expanded
@Composable
fun CLSpellFullDescription(item: CustomList){
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        textAlign = TextAlign.Center,
        text = item.spellTitle
    )
        Text("Source: ${ item.spellSourceBookFull }")
        Text("School: ${item.spellSchool}")
        Text("Casting Time: ${item.spellCastingTime}")
        Text("Range: ${item.spellRange}")
        Text("Targets: ${item.spellTargets}")
        Text("Duration: ${item.spellDuration}")
        Text("Saving Throw: ${item.spellSavingThrow}; Spell Resistance ${item.spellResistance}")
        Text("Description: ${item.spellDescriptionFull}")
    }
}