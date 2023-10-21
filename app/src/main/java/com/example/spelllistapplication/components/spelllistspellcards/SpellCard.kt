package com.example.spelllistapplication.components.spelllistspellcards

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.spelllistapplication.components.spellinteractions.AddSpellButtonValidation
import com.example.spelllistapplication.components.spellinteractions.addSpell
import com.example.spelllistapplication.data.allspellslist.SpellDataModel
import com.example.spelllistapplication.data.characterspelllist.CustomListEvent
import com.example.spelllistapplication.data.characterspelllist.CustomListState
import com.example.spelllistapplication.viewmodels.SetCharacterClassViewModel
import com.example.spelllistapplication.viewmodels.SetCharacterLevelViewModel
import com.example.spelllistapplication.viewmodels.SetCharacterViewModel
import com.example.spelllistapplication.viewmodels.SetTempSpellLevelViewModel
import com.example.spelllistapplication.viewmodels.spellsKnownMaximum

// Each individual Spell card to display
@Composable
fun SpellCard(
    customListState: CustomListState,
    onEventCustomList: (CustomListEvent) -> Unit,
    item: SpellDataModel,
    characterSelected: Int
){
    val expanded = remember { mutableStateOf(false) }
    val setCharacterViewModel: SetCharacterViewModel = viewModel()
    val setTempSpellLevelViewModel: SetTempSpellLevelViewModel = viewModel()
    val setCharacterLevelViewModel: SetCharacterLevelViewModel = viewModel()
    val characterClass: SetCharacterClassViewModel = viewModel()
    val context = LocalContext.current

    // Validate spell is already in character's list
    val characterHasSpell = remember {
        mutableStateOf(false)
    }
    for (spell in customListState.customLists) {
        if (spell.characterFk == characterSelected && spell.spellTitle == item.spellTitle) {
            characterHasSpell.value = true
        }
    }

    var spellLevel = -1

    for(item in item.spellClassWithLevel){
        if(item.dropLast(2) == characterClass.characterClassViewModel.value){
            spellLevel = item.takeLast(1).toInt()
        }
    }

    val spellSlots = spellsKnownMaximum(
        characterLevel = setCharacterLevelViewModel.characterLevelViewModel.intValue,
        spellLevel = spellLevel
    )

    val characterCanLearnSpell = AddSpellButtonValidation(
        characterHasSpell = characterHasSpell,
        characterSelected = setCharacterViewModel.characterIdTemp.intValue,
        item = item,
        characterClass = characterClass.characterClassViewModel.value,
        spellSlots = spellSlots
    )


    Box(
        // to add padding between cards
        modifier = Modifier.padding(4.dp)
    ) {
        Box(
            modifier = Modifier
                .border(4.dp, MaterialTheme.colorScheme.primary, shape = RoundedCornerShape(8.dp))
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.background, shape = RoundedCornerShape(8.dp))

        ) {
            Column(
                modifier = Modifier
                    .clickable { expanded.value = !expanded.value }
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 4.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                if (expanded.value) {
                    SpellFullDescription(item)
                } else {
                    SpellPreview(
                        item
                    )
                }

                if(characterCanLearnSpell){
                    IconButton(
                        onClick = {
                            addSpell(
                                item = item,
                                onEventCustomList = onEventCustomList,
                                setCharacterViewModel = setCharacterViewModel,
                                setTempSpellLevelViewModel = setTempSpellLevelViewModel,
                                setCharacterLevelViewModel = setCharacterLevelViewModel,
                                characterClass = characterClass,
                                context
                            )
                        },
                        modifier = Modifier
                            .background(MaterialTheme.colorScheme.secondary, shape = CircleShape)
                            .size(24.dp),
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Add Spell",
                            tint = MaterialTheme.colorScheme.background
                        )
                    }
                    Spacer(modifier = Modifier.padding(1.dp))
                }
            }
        }
    }
}