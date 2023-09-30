package com.example.spelllistapplication.data.characterdata

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.core.text.isDigitsOnly


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddCharacterDialog(
    state: CharacterState,
    onEvent: (CharacterEvent) -> Unit,
    modifier: Modifier = Modifier
){
    val radioOptions = listOf("Mystic", "Technomancer", "Witchwarper")
    val (selectedOption, onOptionSelected) = remember {
        mutableStateOf(radioOptions[0] )
    }

    // Default values to 0 since we are converting to Int in our onEvent
    val characterLevelValue = remember {
        mutableStateOf("")
    }
    val characterKeyAbilityValue = remember {
        mutableStateOf("")
    }

    AlertDialog(
        modifier = modifier,
        onDismissRequest = {
            onEvent(CharacterEvent.HideDialog)
        },
        title = { Text(text = "Add Character")},
        text = {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ){
                TextField(
                    value = state.characterName,
                    onValueChange = {
                        onEvent(CharacterEvent.SetCharacterName(it))
                    },
                    placeholder = {
                        Text(text = "Character Name")
                    }
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    radioOptions.forEach{ label->
                        CustomRadioButton(labelValue = label, selectedOption = selectedOption, onOptionSelected = onOptionSelected)
                        onEvent(CharacterEvent.SetCharacterClass(selectedOption))
                    }
                }
                val keyAbilityScore = if (selectedOption == radioOptions[0]){
                    "Wis"
                } else if(selectedOption == radioOptions[1]) {
                    "Int"
                } else{
                    "Cha"
                }
                Box() {
                    CustomNumberTextField(
                        labelValue = "Level",
                        numberInput = characterLevelValue
                    )
                    if (characterLevelValue.value.isDigitsOnly() && characterLevelValue.value.isNotBlank()) {
                        onEvent(CharacterEvent.SetCharacterLevel(characterLevelValue.value.toInt()))
                    }
                }
                Box() {
                    CustomNumberTextField(
                        labelValue = "$keyAbilityScore Modifier",
                        numberInput = characterKeyAbilityValue
                    )
                    if (characterKeyAbilityValue.value.isDigitsOnly() && characterKeyAbilityValue.value.isNotBlank()) {
                        onEvent(CharacterEvent.SetCharacterKeyAbilityMod(characterKeyAbilityValue.value.toInt()))
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
                    onEvent(CharacterEvent.SaveCharacter)
                    onEvent(CharacterEvent.HideDialog)
                }) {
                    Text(text = "Create Character")
                }
            }
        }
    )
}

@Composable
fun CustomRadioButton(
    labelValue: String,
    selectedOption: String,
    onOptionSelected: (String)-> Unit
){
    Column(
        Modifier
            .selectable(
                selected = (labelValue == selectedOption),
                onClick = {
                    onOptionSelected(labelValue)
                }
            )
    ) {
        Text(
            modifier = Modifier,
            textAlign = TextAlign.Center,
            text = labelValue
        )
        RadioButton(
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally),
            selected = (labelValue == selectedOption),
            onClick = { onOptionSelected(labelValue) }
        )

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomNumberTextField(labelValue: String, numberInput: MutableState<String>){
    val maxChar = 2
    OutlinedTextField(
        modifier = Modifier
            .padding(2.dp),
        label = { Text(text = labelValue) },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = MaterialTheme.colorScheme.primary,
            focusedLabelColor = MaterialTheme.colorScheme.secondary,
            cursorColor = MaterialTheme.colorScheme.secondary,
            containerColor = MaterialTheme.colorScheme.background
        ),
        shape = RoundedCornerShape(8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        value = numberInput.value,
        onValueChange = {
            if (it.isDigitsOnly() && it.length <= maxChar) {
                numberInput.value = it
            }
        }
    )
}