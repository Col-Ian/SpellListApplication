package com.example.spelllistapplication.data.characterdata

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.core.text.isDigitsOnly
import com.example.spelllistapplication.components.DropDownCharacter
import com.example.spelllistapplication.components.textcomponents.AlertDialogHeading
import com.example.spelllistapplication.components.textcomponents.CustomNumberTextField


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddCharacterDialog(
    state: CharacterState,
    onEvent: (CharacterEvent) -> Unit,
    modifier: Modifier = Modifier
){
    val context = LocalContext.current
    val classOptions = listOf("Mystic","Precog","Technomancer", "Witchwarper")
    val (selectedOption, onOptionSelected) = remember {
        mutableStateOf(classOptions[0] )
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
            onEvent(CharacterEvent.HideAddCharacterDialog)
        },
        title = { AlertDialogHeading(text = "Add Character") },
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
                DropDownCharacter(
                    dropDownType = "Class",
                    selectedOption = selectedOption,
                    onOptionSelected = onOptionSelected,
                    allOptions = classOptions,
                    onEvent = onEvent
                )
                val keyAbilityScore = if (selectedOption == classOptions[0]){
                    "Wis"
                } else if(selectedOption == classOptions[1] || selectedOption == classOptions[2]) {
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
                        onEvent(CharacterEvent.SetCharacterLevel(characterLevelValue.value.toInt()))
                    }
                }
                Box {
                    CustomNumberTextField(
                        labelValue = "$keyAbilityScore Score",
                        numberInput = characterKeyAbilityValue
                    )
                    if (characterKeyAbilityValue.value.isDigitsOnly() && characterKeyAbilityValue.value.isNotBlank()) {
                        onEvent(CharacterEvent.SetCharacterKeyAbilityScore(characterKeyAbilityValue.value.toInt()))
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
                    colors = ButtonDefaults.buttonColors(Color.Transparent),
                    onClick = {
                        if(state.characterName.isEmpty()){
                            Toast.makeText(
                                context,
                                "Please Enter Character Name",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else {
                            Toast.makeText(
                                context,
                                "${state.characterName} added!",
                                Toast.LENGTH_SHORT
                            ).show()
                            onEvent(CharacterEvent.SaveCharacter)
                            onEvent(CharacterEvent.HideAddCharacterDialog)
                        }
                }) {
                    Text(
                        text = "Create Character",
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    )
}