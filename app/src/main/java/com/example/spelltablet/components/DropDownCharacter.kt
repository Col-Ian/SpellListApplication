package com.example.spelltablet.components

import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.example.spelltablet.data.characterdata.CharacterEvent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropDownCharacter(
    dropDownType: String,
    selectedOption: String,
    onOptionSelected: (String) -> Unit,
    allOptions: List<String>,
    onEvent: (CharacterEvent) -> Unit
){
    val expandedFilter = remember { mutableStateOf(false) }

    ExposedDropdownMenuBox(
        expanded = expandedFilter.value,
        onExpandedChange = {newValue -> expandedFilter.value = newValue}
    ) {
        TextField(
            value = selectedOption,
            onValueChange = onOptionSelected,
            readOnly = true,
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expandedFilter.value) },
            modifier = Modifier
                .menuAnchor(),
            label = { Text(
                fontWeight = FontWeight.Bold,
                text = dropDownType
            ) },
            colors = TextFieldDefaults.textFieldColors(focusedLabelColor = Color.Black)
        )
        onEvent(CharacterEvent.SetCharacterClass(selectedOption))
        ExposedDropdownMenu(
            expanded = expandedFilter.value,
            onDismissRequest = { expandedFilter.value = false }) {
            allOptions.forEach { item->
                DropdownMenuItem(
                    text = { Text(text = item) },
                    onClick = {
                        onOptionSelected(item)
                        expandedFilter.value = false
                    }
                )
            }
        }
    }
}