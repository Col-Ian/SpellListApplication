package com.example.spelltablet.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.spelltablet.components.SpellList
import com.example.spelltablet.data.characterdata.CharacterEvent
import com.example.spelltablet.data.characterdata.CharacterState
import com.example.spelltablet.data.characterspelllist.CustomListEvent
import com.example.spelltablet.data.characterspelllist.CustomListState

@Composable
fun SpellListScreen (
    characterState: CharacterState,
    customListState: CustomListState,
    onEventCharacter: (CharacterEvent) -> Unit,
    onEventCustomList: (CustomListEvent) -> Unit
){
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
    ) {
        SpellList(
            customListState = customListState,
            onEventCustomList = onEventCustomList
        )
    }
}