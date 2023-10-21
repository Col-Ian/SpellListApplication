package com.example.spelllistapplication.data.characterdata

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.spelllistapplication.data.characterspelllist.CustomListEvent
import com.example.spelllistapplication.data.characterspelllist.CustomListState
import com.example.spelllistapplication.viewmodels.SetCharacterViewModel

@Composable
fun DeleteCharacterDialog(
    state: CustomListState,
    onCharacterEvent: (CharacterEvent) -> Unit,
    onCustomListEvent: (CustomListEvent) -> Unit,
    character: Character,
    modifier: Modifier = Modifier
){
    val setCharacterViewModel: SetCharacterViewModel = viewModel()

    AlertDialog(
        modifier = modifier,
        onDismissRequest = { onCharacterEvent(CharacterEvent.HideDeleteCharacterDialog) },
        title = { Text(text = "Delete ${character.characterName}?")},
        confirmButton = {
            Button(onClick = {
                for(spell in state.customLists){
                    if(spell.characterFk == character.id){
                        onCustomListEvent(CustomListEvent.DeleteSpell(spell))
                    }
                }
                onCharacterEvent(CharacterEvent.DeleteCharacter(character))
                // So the value doesn't get stuck on an invalid character
                setCharacterViewModel.characterIdTemp.intValue = -1
                onCharacterEvent(CharacterEvent.HideDeleteCharacterDialog)
            }) {
                Text(text = "Yes")
            }
        },
        dismissButton = {
            Button(onClick = { onCharacterEvent(CharacterEvent.HideDeleteCharacterDialog) }) {
                Text(text = "No")
            }
        },
    )
}