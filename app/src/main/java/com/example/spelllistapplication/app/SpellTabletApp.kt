package com.example.spelllistapplication.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.spelllistapplication.data.characterdata.CharacterEvent
import com.example.spelllistapplication.data.characterdata.CharacterState
import com.example.spelllistapplication.navigation.Screen
import com.example.spelllistapplication.navigation.SpellTabletAppRouter
import com.example.spelllistapplication.navigation.TopTab
import com.example.spelllistapplication.screens.CharacterScreen

@Composable
fun SpellTabletApp (
    state: CharacterState,
    onEvent: (CharacterEvent) -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ){
//        SpellListScreen()
//        CharacterScreen(state = state, onEvent = onEvent)
        TopTab(state = state, onEvent = onEvent)
    }
}