package com.example.spelllistapplication.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.spelllistapplication.components.customlistspellcards.CustomSpellCard
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

    Box(modifier = Modifier.padding(8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = MaterialTheme.colorScheme.primary,
                    shape = RoundedCornerShape(12.dp)
                )
                .padding(8.dp)
        ) {
            Text(
                modifier = Modifier
                    .padding(4.dp),
                text = "Level $spellLevel",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Maximum Spells Known: ${
                        spellsKnownMaximum(
                            spellLevel,
                            characterLevel
                        )
                    }"
                )
                // Level 0 spells have infinite uses
                if (spellLevel > 0) {
                    Text(
                        text = "Spells Per Day ${
                            spellsPerDay(
                                spellLevel,
                                characterLevel,
                                characterAbilityScore
                            )
                        }"
                    )
                }
            }
        }
    }
    customListState.customLists.forEach{
        CustomSpellCard(
            onEventCustomList = onEventCustomList,
            it = it,
            viewModel = setCharacterViewModel,
            levelOfSpell = spellLevel
        )
    }
}