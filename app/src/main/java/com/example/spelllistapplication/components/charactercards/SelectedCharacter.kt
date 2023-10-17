package com.example.spelllistapplication.components.charactercards

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.spelllistapplication.data.characterdata.Character
import com.example.spelllistapplication.data.characterdata.CharacterEvent
import com.example.spelllistapplication.data.characterdata.CharacterState
import com.example.spelllistapplication.data.characterdata.DeleteCharacterDialog
import com.example.spelllistapplication.data.characterdata.UpdateCharacterDialog
import com.example.spelllistapplication.data.characterspelllist.CustomListEvent
import com.example.spelllistapplication.data.characterspelllist.CustomListState
import com.example.spelllistapplication.data.viewmodels.SetCharacterViewModel

@Composable
fun SelectedCharacter(
    character: Character,
    customListState: CustomListState,
    characterState: CharacterState,
    onCharacterEvent: (CharacterEvent) -> Unit,
    onCustomListEvent: (CustomListEvent) -> Unit
){
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val setCharacterViewModel: SetCharacterViewModel = viewModel()
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // To show the delete character dialog
            if (characterState.isDeletingCharacter && setCharacterViewModel.characterIdTemp.intValue == character.id){
                DeleteCharacterDialog(
                    state = customListState,
                    onCharacterEvent = onCharacterEvent,
                    onCustomListEvent = onCustomListEvent,
                    character = character
                )
            }
            // To show the update character dialog
            if(characterState.isUpdatingCharacter && setCharacterViewModel.characterIdTemp.intValue == character.id){
                UpdateCharacterDialog(
                    state = characterState,
                    onCharacterEvent = onCharacterEvent,
                    character = character)
            }

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(2.dp)
            ) {
                Text(
                    fontWeight = FontWeight.Bold,
                    text = character.characterName
                )
                Text(text = character.characterClass)
                Text(text = "Level: ${character.characterLevel}")
            }

            Column(
                modifier = Modifier.padding(2.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Button(onClick = {
                    onCharacterEvent(CharacterEvent.ShowDeleteCharacterDialog)
                }) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = "Delete contact",
                    )
                }
                Button(onClick = {
                    onCharacterEvent(
                        CharacterEvent.SetCharacterState(
                            characterId = character.id,
                            characterName = character.characterName,
                            characterClass = character.characterClass,
                            characterLevel = character.characterLevel,
                            characterKeyAbilityScore = character.characterKeyAbilityScore
                        ))
                    onCharacterEvent(CharacterEvent.ShowUpdateCharacterDialog)
                }) {
                    Icon(imageVector = Icons.Default.Edit,
                        contentDescription = "Update contact"
                    )
                }

            }
        }
    }
}