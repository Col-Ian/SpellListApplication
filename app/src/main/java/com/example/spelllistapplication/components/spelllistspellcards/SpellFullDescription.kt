package com.example.spelllistapplication.components.spelllistspellcards

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.spelllistapplication.data.allspellslist.SpellDataModel

// To display when the Spell is expanded
@Composable
fun SpellFullDescription(item: SpellDataModel){
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
        Text("Classes: "+ item.spellClassWithLevel.joinToString { it })
        Text("School: ${item.spellSchool}")
        Text("Casting Time: ${item.spellCastingTime}")
        Text("Range: ${item.spellRange}")
        if(item.spellTargets != ""){
            Text("Targets: ${item.spellTargets}")
        }
        Text("Duration: ${item.spellDuration}")
        if(item.spellSavingThrow != "" && item.spellResistance != ""){
            Text("Saving Throw: ${item.spellSavingThrow}; Spell Resistance ${item.spellResistance}")
        }
        Text("Description: ${item.spellDescriptionFull}")

    }
}