package com.example.spelllistapplication.components.spelllistspellcards

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.spelllistapplication.components.spellinteractions.AddSpellButton
import com.example.spelllistapplication.components.textcomponents.spellcard.SpellCardDescription
import com.example.spelllistapplication.components.textcomponents.spellcard.SpellCardHeading
import com.example.spelllistapplication.components.textcomponents.spellcard.SpellCardSubtitle
import com.example.spelllistapplication.components.textcomponents.spellcard.SpellCardTitle
import com.example.spelllistapplication.data.allspellslist.SpellDataModel
import com.example.spelllistapplication.data.characterspelllist.CustomListEvent

// To display when the Spell is expanded
@Composable
fun SpellFullDescription(
    item: SpellDataModel,
    onEventCustomList: (CustomListEvent)-> Unit,
    context: Context,
    characterCanLearnSpell: Boolean
){
    Column()
    {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    MaterialTheme.colorScheme.background,
                    shape = RoundedCornerShape(8.dp)
                )
        ) {
            SpellCardHeading(text = item.spellTitle)
            Row {
                SpellCardTitle(text = "Source")
                SpellCardSubtitle(text = " ${item.spellSourceBookFull}")
            }
            Row {
                SpellCardTitle(text = "Classes")
                SpellCardSubtitle(text = " ${item.spellClassWithLevel.joinToString { it }}")
            }
            Row {
                SpellCardTitle(text = "School")
                SpellCardSubtitle(text = " ${item.spellSchool}")
            }
            Row {
                SpellCardTitle(text = "Casting Time")
                SpellCardSubtitle(text = " ${item.spellCastingTime}")
            }
            if (item.spellRange != "") {
                Row {
                    SpellCardTitle(text = "Range")
                    SpellCardSubtitle(text = " ${item.spellRange}")
                }
            }
            if (item.spellTargets != "") {
                Row {
                    SpellCardTitle(text = "Targets")
                    SpellCardSubtitle(text = " ${item.spellTargets}")
                }
            }
            if (item.spellArea != "") {
                Row {
                    SpellCardTitle(text = "Area")
                    SpellCardSubtitle(text = " ${item.spellArea}")
                }
            }
            if (item.spellEffect != "") {
                Row {
                    SpellCardTitle(text = "Effect")
                    SpellCardSubtitle(text = " ${item.spellEffect}")
                }
            }
            Row {
                SpellCardTitle(text = "Duration")
                SpellCardSubtitle(text = " ${item.spellDuration}")
            }
            if (item.spellSavingThrow != "" && item.spellResistance != "") {
                Column{
                    Row {
                        SpellCardTitle(text = "Saving Throw")
                        SpellCardSubtitle(text = " ${item.spellSavingThrow}")
                        Text(text = ";")
                    }
                    Row{
                        SpellCardTitle(text = "Spell Resistance")
                        SpellCardSubtitle(text = "  ${item.spellResistance}")
                    }
                }
            }
        }
        Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
                )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    MaterialTheme.colorScheme.background,
                    shape = RoundedCornerShape(8.dp)
                )
        ) {
            SpellCardDescription(text = item.spellDescriptionFull)
            Box(
                modifier = Modifier
                    .padding(2.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                AddSpellButton(
                    item = item,
                    onEventCustomList = onEventCustomList,
                    context = context,
                    characterCanLearnSpell = characterCanLearnSpell
                )
            }
        }
    }
}