package com.example.spelllistapplication.components.spellinteractions

import androidx.compose.foundation.background
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import kotlin.reflect.KFunction1

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropDownFilter(
    filterType: String,
    selectedOption: String,
    onOptionSelected: (String) -> Unit,
    filters: KFunction1<String, Unit>,
    allOptions: List<String>
){
    val expandedClass = remember { mutableStateOf(false) }

    ExposedDropdownMenuBox(
        expanded = expandedClass.value,
        onExpandedChange = {newValue -> expandedClass.value = newValue}
    ) {
        TextField(
            value = selectedOption,
            onValueChange = filters,
            readOnly = true,
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expandedClass.value) },
            modifier = Modifier
                .menuAnchor(),
            label = { Text(
                fontWeight = FontWeight.Bold,
                text = filterType
            ) },
            colors = TextFieldDefaults.textFieldColors(focusedLabelColor = Color.Black)
        )
        ExposedDropdownMenu(
            expanded = expandedClass.value,
            onDismissRequest = { expandedClass.value = false }) {
            allOptions.forEach { item->
                DropdownMenuItem(
                    text = { Text(text = item) },
                    onClick = {
                        onOptionSelected(item)
                        expandedClass.value = false
                    }
                )
            }
        }
    }
}