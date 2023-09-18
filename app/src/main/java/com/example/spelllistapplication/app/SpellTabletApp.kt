package com.example.spelllistapplication.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.spelllistapplication.navigation.Screen
import com.example.spelllistapplication.navigation.SpellTabletAppRouter
import com.example.spelllistapplication.screens.SpellListScreen

@Composable
fun SpellTabletApp () {
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
    SpellListScreen()
    }
}