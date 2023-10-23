package com.example.spelllistapplication.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDownward
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.spelllistapplication.components.customlistspellcards.CustomSpellCard
import com.example.spelllistapplication.components.textcomponents.customlist.SpellLevelFootNotes
import com.example.spelllistapplication.components.textcomponents.customlist.SpellLevelHeading
import com.example.spelllistapplication.data.characterspelllist.CustomListEvent
import com.example.spelllistapplication.data.characterspelllist.CustomListState
import com.example.spelllistapplication.viewmodels.SetCharacterViewModel
import com.example.spelllistapplication.viewmodels.spellsKnownMaximum
import com.example.spelllistapplication.viewmodels.spellsPerDay

@Composable
fun LevelSpecificSpells(
    spellLevel: Int,
    customListState: CustomListState,
    onEventCustomList: (CustomListEvent) -> Unit
){
    val setCharacterViewModel: SetCharacterViewModel = viewModel()
    val characterLevel = setCharacterViewModel.characterLevel.intValue
    val characterAbilityScore = setCharacterViewModel.characterAbilityScore.intValue

    val expanded = remember{
        mutableStateOf(true)
    }

    Box(
        modifier = Modifier.padding(8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = MaterialTheme.colorScheme.tertiary,
                    shape = RoundedCornerShape(6.dp)
                )
                .padding(2.dp)
                .clickable { expanded.value = !expanded.value }
        ) {

            Row (verticalAlignment = Alignment.CenterVertically) {
                SpellLevelHeading(text = "Level $spellLevel")
                Spacer(modifier = Modifier.padding(4.dp))
                if (expanded.value){
                    Icon(
                        modifier = Modifier.size(14.dp),
                        imageVector = Icons.Default.ArrowDownward,
                        contentDescription = "Hide level $spellLevel spells"
                    )
                } else {
                    Icon(
                        modifier = Modifier.size(14.dp),
                        imageVector = Icons.Default.ArrowUpward,
                        contentDescription = "Show level $spellLevel spells"
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                SpellLevelFootNotes(
                    text = "Maximum Spells Known: ${
                        spellsKnownMaximum(
                            spellLevel,
                            characterLevel
                        )
                    }"
                )
//                Text(
//                    text = "Maximum Spells Known: ${
//                        spellsKnownMaximum(
//                            spellLevel,
//                            characterLevel
//                        )
//                    }"
//                )
                // Level 0 spells have infinite uses
                if (spellLevel > 0) {
                    SpellLevelFootNotes(
                        text ="Spells Per Day ${
                            spellsPerDay(
                                spellLevel,
                                characterLevel,
                                characterAbilityScore
                            )
                        }"
                    )
//                    Text(
//                        text = "Spells Per Day ${
//                            spellsPerDay(
//                                spellLevel,
//                                characterLevel,
//                                characterAbilityScore
//                            )
//                        }"
//                    )
                }
            }
        }
    }
    if (expanded.value) {
        customListState.customLists.forEach {
            CustomSpellCard(
                onEventCustomList = onEventCustomList,
                it = it,
                viewModel = setCharacterViewModel,
                levelOfSpell = spellLevel
            )
        }
    }
}