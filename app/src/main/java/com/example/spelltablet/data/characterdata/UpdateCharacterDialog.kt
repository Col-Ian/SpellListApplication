package com.example.spelltablet.data.characterdata

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.core.text.isDigitsOnly
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.spelltablet.components.textcomponents.AlertDialogHeading
import com.example.spelltablet.components.textcomponents.CustomNumberTextField
import com.example.spelltablet.viewmodels.SetCharacterViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UpdateCharacterDialog(
    state: CharacterState,
    onCharacterEvent: (CharacterEvent) -> Unit,
    character: Character,
    modifier: Modifier = Modifier
){
    val classOptions = listOf("Mystic","Precog","Technomancer", "Witchwarper")

    val setCharacterClass: SetCharacterViewModel = viewModel()
    val characterClass = setCharacterClass.characterClass.value

    // toString to validate inputs in the TextFields
    // Default values to 0 since we are converting to Int in our onEvent
    val characterLevelValue = remember {
        mutableStateOf(character.characterLevel.toString())
    }
    val characterKeyAbilityValue = remember {
        mutableStateOf(character.characterKeyAbilityScore.toString())
    }

    val setCharacterViewModel: SetCharacterViewModel = viewModel()

    AlertDialog(
        modifier = modifier,
        onDismissRequest = {
            onCharacterEvent(CharacterEvent.ResetCharacterState)
            onCharacterEvent(CharacterEvent.HideUpdateCharacterDialog)
        },
        title = { AlertDialogHeading(text = "Update Character") },
        text = {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ){
                TextField(
                    value = state.characterName,
                    onValueChange = {
                        onCharacterEvent(CharacterEvent.SetCharacterName(it))
                    },
                    placeholder = {
                        Text(text = "Character Name")
                    }
                )
                Text(text = characterClass)
                val keyAbilityScore = if (characterClass == classOptions[0]){
                    "Wis"
                } else if(characterClass == classOptions[1] || characterClass == classOptions[2]) {
                    "Int"
                } else{
                    "Cha"
                }
                Box {
                    CustomNumberTextField(
                        labelValue = "Level",
                        numberInput = characterLevelValue
                    )
                    if (characterLevelValue.value.isDigitsOnly() && characterLevelValue.value.isNotBlank()) {
                        onCharacterEvent(CharacterEvent.SetCharacterLevel(characterLevelValue.value.toInt()))
                    }
                }
                Box {
                    CustomNumberTextField(
                        labelValue = "$keyAbilityScore Score",
                        numberInput = characterKeyAbilityValue
                    )
                    if (characterKeyAbilityValue.value.isDigitsOnly() && characterKeyAbilityValue.value.isNotBlank()) {
                        onCharacterEvent(CharacterEvent.SetCharacterKeyAbilityScore(characterKeyAbilityValue.value.toInt()))
                    }
                }
            }
        },
        confirmButton = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(48.dp)
                    .background(
                        MaterialTheme.colorScheme.tertiary,
                        shape = RoundedCornerShape(50.dp)
                    ),
                contentAlignment = Alignment.Center

            ){
                Button(
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent,
                        contentColor = MaterialTheme.colorScheme.onBackground
                    ),
                    onClick = {
                    setCharacterViewModel.characterIdTemp.intValue = -1
                    onCharacterEvent(CharacterEvent.UpdateCharacter)
                    onCharacterEvent(CharacterEvent.HideUpdateCharacterDialog)
                }) {
                    Text(text = "Update Character")
                }
            }
        }
    )
}