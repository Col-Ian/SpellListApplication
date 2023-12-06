package com.icapps.spelltablet.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.icapps.spelltablet.data.characterdata.CharacterEvent
import com.icapps.spelltablet.data.characterdata.CharacterState
import com.icapps.spelltablet.data.characterspelllist.CustomListEvent
import com.icapps.spelltablet.data.characterspelllist.CustomListState
import com.icapps.spelltablet.navigation.TopTab

@Composable
fun SpellTabletApp (
    characterState: CharacterState,
    customListState: CustomListState,
    onEventCharacter: (CharacterEvent) -> Unit,
    onEventCustomList: (CustomListEvent) -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ){
        TopTab(
            characterState = characterState,
            customListState = customListState,
            onEventCharacter = onEventCharacter,
            onEventCustomList = onEventCustomList
        )
    }
}