package com.example.spelllistapplication.components.customlistspellcards

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.spelllistapplication.components.textcomponents.spellcard.SpellCardDescription
import com.example.spelllistapplication.components.textcomponents.spellcard.SpellCardHeading
import com.example.spelllistapplication.components.textcomponents.spellcard.SpellCardSubtitle
import com.example.spelllistapplication.components.textcomponents.spellcard.SpellCardTitle
import com.example.spelllistapplication.data.characterspelllist.CustomList

// To display when the Spell is expanded
@Composable
fun CLSpellFullDescription(item: CustomList){
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        SpellCardHeading(text = item.spellTitle)
        Row {
            SpellCardTitle(text = "Source")
            SpellCardSubtitle(text = " ${item.spellSourceBookFull}")
        }
                Row {
            SpellCardTitle(text = "School")
            SpellCardSubtitle(text = " ${item.spellSchool}")
        }
        Row {
            SpellCardTitle(text = "Casting Time")
            SpellCardSubtitle(text = " ${item.spellCastingTime}")
        }
        Row {
            SpellCardTitle(text = "Range")
            SpellCardSubtitle(text = " ${item.spellRange}")
        }
        if(item.spellTargets != ""){
            Row {
                SpellCardTitle(text = "Targets")
                SpellCardSubtitle(text = " ${item.spellTargets}")
            }
        }
        Row {
            SpellCardTitle(text = "Duration")
            SpellCardSubtitle(text = " ${item.spellDuration}")
        }
        if(item.spellSavingThrow != "" && item.spellResistance != ""){
            Column{
                Row {
                    SpellCardTitle(text = "Saving Throw")
                    SpellCardSubtitle(text = " ${item.spellSavingThrow}")
                    Text(text = ";")
                }
                Row {
                    SpellCardTitle(text = "Spell Resistance")
                    SpellCardSubtitle(text = "  ${item.spellResistance}")
                }
            }

        }
        Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.primary)
                    .padding(8.dp)
                )
        SpellCardDescription(text = item.spellDescriptionFull)
    }
}