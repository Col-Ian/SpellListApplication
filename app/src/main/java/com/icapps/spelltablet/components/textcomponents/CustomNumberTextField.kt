package com.icapps.spelltablet.components.textcomponents

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.core.text.isDigitsOnly

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomNumberTextField(
    labelValue: String,
    numberInput: MutableState<String>
){
    val maxChar = 2
    OutlinedTextField(
        modifier = Modifier
            .padding(2.dp),
        label = { Text(text = labelValue) },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = MaterialTheme.colorScheme.primary,
            focusedLabelColor = MaterialTheme.colorScheme.primary,
            cursorColor = MaterialTheme.colorScheme.primary,
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