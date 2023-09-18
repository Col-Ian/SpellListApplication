package com.example.spelllistapplication.navigation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

sealed class Screen{
    object CharacterSelectScreen : Screen()
    object CreateCharacterScreen : Screen()
    object SpellListScreen : Screen()
}

object SpellTabletAppRouter{
    var currentScreen: MutableState<Screen> = mutableStateOf(Screen.CharacterSelectScreen)

    fun navigateTo(destination: Screen){
        currentScreen.value = destination
    }
}