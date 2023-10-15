package com.example.spelllistapplication.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.spelllistapplication.data.viewmodels.SetCharacterViewModel
import com.example.spelllistapplication.data.characterdata.AddCharacterDialog
import com.example.spelllistapplication.data.characterdata.CharacterEvent
import com.example.spelllistapplication.data.characterdata.CharacterState
import com.example.spelllistapplication.data.characterdata.DeleteCharacterDialog
import com.example.spelllistapplication.data.characterspelllist.CustomListEvent
import com.example.spelllistapplication.data.characterspelllist.CustomListState
import com.example.spelllistapplication.data.viewmodels.SetCharacterAbilityScoreViewModel
import com.example.spelllistapplication.data.viewmodels.SetCharacterClassViewModel
import com.example.spelllistapplication.data.viewmodels.SetCharacterLevelViewModel
import com.example.spelllistapplication.data.viewmodels.SetTempSpellLevelViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CharacterScreen(
    customListState: CustomListState,
    characterState: CharacterState,
    onCharacterEvent: (CharacterEvent) -> Unit,
    onCustomListEvent: (CustomListEvent) -> Unit
){
    val setCharacterViewModel: SetCharacterViewModel = viewModel()
    val setCharacterClassViewModel: SetCharacterClassViewModel = viewModel()
    val setCharacterLevelViewModel: SetCharacterLevelViewModel = viewModel()
    val setCharacterAbilityScoreViewModel: SetCharacterAbilityScoreViewModel = viewModel()
    val setTempSpellLevelViewModel: SetTempSpellLevelViewModel = viewModel()
    Scaffold(
        floatingActionButton = {
                               FloatingActionButton(onClick = {
                                   onCharacterEvent(CharacterEvent.ShowAddCharacterDialog)
                               }) {
                                   Icon(
                                       imageVector = Icons.Default.Add,
                                       contentDescription = "Add Character"
                                   )
                               }
        },
        modifier = Modifier
            .fillMaxSize()
    ) {padding->
        if (characterState.isAddingCharacter){
            AddCharacterDialog(state = characterState, onEvent = onCharacterEvent)
        }
        LazyColumn(
            contentPadding = padding,
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ){

            items(characterState.characters){ character ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colorScheme.background)
                        .clickable {
                            if (setCharacterViewModel.characterFkTemp.intValue != character.id) {
                                setCharacterViewModel.characterFkTemp.intValue = character.id
                                setCharacterClassViewModel.characterClassViewModel.value =
                                    character.characterClass
                                setCharacterLevelViewModel.characterLevelViewModel.intValue =
                                    character.characterLevel
                                setCharacterAbilityScoreViewModel.characterAbilityScoreViewModel.intValue =
                                    character.characterKeyAbilityScore
                                setTempSpellLevelViewModel.tempSpellLevelViewModel.intValue = -1
                            } else if (setCharacterViewModel.characterFkTemp.intValue == character.id) {
                                setCharacterViewModel.characterFkTemp.intValue = -1
                                setCharacterClassViewModel.characterClassViewModel.value = ""
                                setCharacterLevelViewModel.characterLevelViewModel.intValue = 0
                                setCharacterAbilityScoreViewModel.characterAbilityScoreViewModel.intValue =
                                    0
                                setTempSpellLevelViewModel.tempSpellLevelViewModel.intValue = -2
                            }
                        },
                    horizontalArrangement = Arrangement.Center,

                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = character.characterName
                        )
                        Row(horizontalArrangement = Arrangement.SpaceBetween) {
                            Text(text = character.characterClass)
                            Text(text = "Level: ${character.characterLevel}")
                        }
                        if (characterState.isDeletingCharacter && setCharacterViewModel.characterFkTemp.intValue == character.id){
                            DeleteCharacterDialog(
                                state = customListState,
                                onCharacterEvent = onCharacterEvent,
                                onCustomListEvent = onCustomListEvent,
                                character = character
                            )
                        }
                        if(setCharacterViewModel.characterFkTemp.intValue == character.id){
                            Button(onClick = {
                                // So our characterFk doesn't get stuck on an invalid character

                                // Before deleting character, remove all spells set for character from db.
                                onCharacterEvent(CharacterEvent.ShowDeleteCharacterDialog)
                            }) {
                                Icon(imageVector = Icons.Default.Delete,
                                    contentDescription = "Delete contact"
                                )
                            }
                        }

                    }
                }
            }
        }

    }
}