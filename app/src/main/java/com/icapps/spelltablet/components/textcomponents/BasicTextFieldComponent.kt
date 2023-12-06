package com.icapps.spelltablet.components.textcomponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.icapps.spelltablet.viewmodels.FiltersAndSearchBarViewModel

@Composable
fun BasicTextFieldComponent(
    searchText: String,
    viewModelFilters: FiltersAndSearchBarViewModel,
    placeholderText: String,
    fontSize: TextUnit = MaterialTheme.typography.bodyLarge.fontSize
){


    BasicTextField(
        value = searchText,
        onValueChange = viewModelFilters::onSearchTextChange,
        modifier = Modifier
            .fillMaxWidth()
            .background(
                MaterialTheme.colorScheme.surfaceVariant
            ),
        singleLine = true,
        cursorBrush = SolidColor(LocalContentColor.current),
        textStyle = TextStyle(color = LocalContentColor.current),
        decorationBox = { innerTextField ->
            Row (
                verticalAlignment = Alignment.CenterVertically
                ){
                Box(
                    Modifier
                        .weight(1f)
                        .padding(8.dp)
                ) {
                    if (searchText.isEmpty()) Text(
                        placeholderText,
                        style = LocalTextStyle.current.copy(
                            fontSize = fontSize,
                            color = LocalContentColor.current.copy(alpha = 0.6f)
                        )
                    )
                    innerTextField()
                }
            }
        }
    )
}