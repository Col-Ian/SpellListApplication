package com.icapps.spelltablet.components.spellinteractions

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.icapps.spelltablet.data.allspellslist.SpellDataModel
import com.icapps.spelltablet.data.characterspelllist.CustomListEvent
import com.icapps.spelltablet.viewmodels.SetCharacterViewModel
import com.icapps.spelltablet.viewmodels.SetTempSpellLevelViewModel

@Composable
fun AddSpellButton(
    item: SpellDataModel,
    onEventCustomList: (CustomListEvent) -> Unit,
    context: Context,
    characterCanLearnSpell: Boolean
){
    val setCharacterViewModel: SetCharacterViewModel = viewModel()
    val setTempSpellLevelViewModel: SetTempSpellLevelViewModel = viewModel()

    if (characterCanLearnSpell) {
        IconButton(
            onClick = {
                addSpell(
                    item = item,
                    onEventCustomList = onEventCustomList,
                    setCharacterViewModel = setCharacterViewModel,
                    setTempSpellLevelViewModel = setTempSpellLevelViewModel,
                    context
                )
            },
            modifier = Modifier
                .background(
                    MaterialTheme.colorScheme.secondary,
                    shape = CircleShape
                )
                .size(24.dp)
                .padding(2.dp),
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Add Spell",
                tint = MaterialTheme.colorScheme.background
            )
        }
    }
}