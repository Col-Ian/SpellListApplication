package com.example.spelllistapplication.data.characterdata

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import androidx.core.text.isDigitsOnly
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.spelllistapplication.data.viewmodels.SetCharacterClassViewModel
import com.example.spelllistapplication.data.viewmodels.SetCharacterViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UpdateCharacterDialog(
    state: CharacterState,
    onCharacterEvent: (CharacterEvent) -> Unit,
    character: Character,
    modifier: Modifier = Modifier
){
    val radioOptionsTop = listOf("Mystic","Precog")
    val radioOptionsBottom = listOf("Technomancer", "Witchwarper")

    val setCharacterClass: SetCharacterClassViewModel = viewModel()
    val characterClass = setCharacterClass.characterClassViewModel.value

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
        title = { Text(text = "Update Character")},
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
                val keyAbilityScore = if (characterClass == radioOptionsTop[0]){
                    "Wis"
                } else if(characterClass == radioOptionsTop[1] || characterClass == radioOptionsBottom[0]) {
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
                        brush = Brush.horizontalGradient(
                            listOf(
                                MaterialTheme.colorScheme.secondary,
                                MaterialTheme.colorScheme.primary
                            )
                        ),
                        shape = RoundedCornerShape(50.dp)
                    ),
                contentAlignment = Alignment.Center

            ){
                Button(onClick = {
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