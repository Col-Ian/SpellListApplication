package com.icapps.spelltablet.data.characterdata

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.lifecycle.viewmodel.compose.viewModel
import com.icapps.spelltablet.data.characterspelllist.CustomListEvent
import com.icapps.spelltablet.data.characterspelllist.CustomListState
import com.icapps.spelltablet.viewmodels.SetCharacterViewModel

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
            Button(

                colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.onBackground),
                onClick = {
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
                Text(
                    color = MaterialTheme.colorScheme.tertiary,
                    fontWeight = FontWeight.Bold,
                    text = "Yes"
                )
            }
        },
        dismissButton = {
            Button(
                colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.onBackground),
                onClick = { onCharacterEvent(CharacterEvent.HideDeleteCharacterDialog)
                }) {
                Text(
                    color = MaterialTheme.colorScheme.tertiary,
                    fontWeight = FontWeight.Bold,
                    text = "No"
                )
            }
        },
    )
}