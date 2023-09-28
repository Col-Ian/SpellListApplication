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
import com.example.spelllistapplication.screens.CharacterScreen
import com.example.spelllistapplication.screens.CreateCharacterScreen
import com.example.spelllistapplication.screens.SpellListScreen

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
//        Crossfade(targetState = SpellTabletAppRouter.currentScreen) {currentState->
//            when(currentState.value){
//                is Screen.CharacterSelectScreen ->{
//                    Screen.CharacterSelectScreen()
//                }
//                is Screen.CreateCharacterScreen ->{
//                    Screen.CreateCharacterScreen()
//                }
//                is Screen.SpellListScreen ->{
//                    Screen.SpellListScreen()
//                }
//            }
//        }
//        SpellListScreen()
//        CreateCharacterScreen()
        CharacterScreen(state = state, onEvent = onEvent)
    }
}