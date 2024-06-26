package com.icapps.spelltablet.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.icapps.spelltablet.components.charactercards.SelectedCharacter
import com.icapps.spelltablet.components.charactercards.UnselectedCharacter
import com.icapps.spelltablet.data.characterdata.AddCharacterDialog
import com.icapps.spelltablet.data.characterdata.CharacterEvent
import com.icapps.spelltablet.data.characterdata.CharacterState
import com.icapps.spelltablet.data.characterspelllist.CustomListEvent
import com.icapps.spelltablet.data.characterspelllist.CustomListState
import com.icapps.spelltablet.viewmodels.FiltersAndSearchBarViewModel
import com.icapps.spelltablet.viewmodels.LearnableSwitchViewModel
import com.icapps.spelltablet.viewmodels.SetCharacterViewModel
import com.icapps.spelltablet.viewmodels.SetTempSpellLevelViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CharacterScreen(
    customListState: CustomListState,
    characterState: CharacterState,
    onCharacterEvent: (CharacterEvent) -> Unit,
    onCustomListEvent: (CustomListEvent) -> Unit
){
    val setCharacterViewModel: SetCharacterViewModel = viewModel()
    val learnableSwitchViewModel: LearnableSwitchViewModel = viewModel()
    val setTempSpellLevelViewModel: SetTempSpellLevelViewModel = viewModel()

    // To avoid a bug when swapping characters that will force a re-compose. This will clear the search field when changing characters.
    val searchBarViewModel : FiltersAndSearchBarViewModel = viewModel()
    val searchBarValue = searchBarViewModel._searchText

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

        if(characterState.characters.isEmpty()){
            Text(
                modifier = Modifier.padding(4.dp),
                textAlign = TextAlign.Center,
                text = "No characters found. Select the \"+\" button to create a new character."
            )
        }

        LazyColumn(
            contentPadding = padding,
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ){

            items(characterState.characters){ character ->
                val borderColor = if (setCharacterViewModel.characterIdTemp.intValue == character.id){
                    MaterialTheme.colorScheme.primary
                } else{
                    Color.Transparent
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            MaterialTheme.colorScheme.tertiary,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .border(
                            2.dp,
                            color = borderColor,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .clickable {
                            if (setCharacterViewModel.characterIdTemp.intValue != character.id) {

                                setCharacterViewModel.characterIdTemp.intValue = character.id

                                setCharacterViewModel.characterClass.value =
                                    character.characterClass

                                setCharacterViewModel.characterLevel.intValue =
                                    character.characterLevel

                                setCharacterViewModel.characterAbilityScore.intValue =
                                    character.characterKeyAbilityScore

                                setTempSpellLevelViewModel.tempSpellLevel.intValue = -1

                                // Set our learnableSwitch to false to prevent it being stuck on a specific character
                                learnableSwitchViewModel.learnableSwitch.value = false

                                searchBarValue.value = ""

                            } else if (setCharacterViewModel.characterIdTemp.intValue == character.id) {

                                setCharacterViewModel.characterIdTemp.intValue = -1

                                setCharacterViewModel.characterClass.value = ""

                                setCharacterViewModel.characterLevel.intValue = 0

                                setCharacterViewModel.characterAbilityScore.intValue =
                                    0

                                setTempSpellLevelViewModel.tempSpellLevel.intValue = -2

                                // Set our learnableSwitch to false to prevent it being stuck on a specific character
                                learnableSwitchViewModel.learnableSwitch.value = false
                                searchBarValue.value = ""
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