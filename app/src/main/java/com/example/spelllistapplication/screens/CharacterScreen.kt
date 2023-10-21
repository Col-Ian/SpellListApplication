package com.example.spelllistapplication.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.spelllistapplication.components.charactercards.SelectedCharacter
import com.example.spelllistapplication.components.charactercards.UnselectedCharacter
import com.example.spelllistapplication.viewmodels.SetCharacterViewModel
import com.example.spelllistapplication.data.characterdata.AddCharacterDialog
import com.example.spelllistapplication.data.characterdata.CharacterEvent
import com.example.spelllistapplication.data.characterdata.CharacterState
import com.example.spelllistapplication.data.characterspelllist.CustomListEvent
import com.example.spelllistapplication.data.characterspelllist.CustomListState
import com.example.spelllistapplication.viewmodels.SetCharacterAbilityScoreViewModel
import com.example.spelllistapplication.viewmodels.SetCharacterClassViewModel
import com.example.spelllistapplication.viewmodels.SetCharacterLevelViewModel
import com.example.spelllistapplication.viewmodels.SetTempSpellLevelViewModel

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
            .background(MaterialTheme.colorScheme.primary)
    ) {padding->
        if (characterState.isAddingCharacter){
            AddCharacterDialog(state = characterState, onEvent = onCharacterEvent)
        }
        LazyColumn(
            contentPadding = padding,
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ){

            items(characterState.characters){ character ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            MaterialTheme.colorScheme.tertiary,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .padding(4.dp)
                        .clickable {
                            if (setCharacterViewModel.characterIdTemp.intValue != character.id) {

                                setCharacterViewModel.characterIdTemp.intValue = character.id

                                setCharacterClassViewModel.characterClassViewModel.value =
                                    character.characterClass

                                setCharacterLevelViewModel.characterLevelViewModel.intValue =
                                    character.characterLevel

                                setCharacterAbilityScoreViewModel.characterAbilityScoreViewModel.intValue =
                                    character.characterKeyAbilityScore

                                setTempSpellLevelViewModel.tempSpellLevelViewModel.intValue = -1

                            } else if (setCharacterViewModel.characterIdTemp.intValue == character.id) {

                                setCharacterViewModel.characterIdTemp.intValue = -1

                                setCharacterClassViewModel.characterClassViewModel.value = ""

                                setCharacterLevelViewModel.characterLevelViewModel.intValue = 0

                                setCharacterAbilityScoreViewModel.characterAbilityScoreViewModel.intValue =
                                    0

                                setTempSpellLevelViewModel.tempSpellLevelViewModel.intValue = -2

                            }
                        },
                    horizontalArrangement = Arrangement.Center,

                ) {
                    if(setCharacterViewModel.characterIdTemp.intValue == character.id){
                        SelectedCharacter(
                            character = character,
                            customListState = customListState,
                            characterState = characterState,
                            onCharacterEvent = onCharacterEvent,
                            onCustomListEvent = onCustomListEvent
                        )
                    } else{
                        UnselectedCharacter(character = character)
                    }
                }
            }
        }

    }
}