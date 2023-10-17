package com.example.spelllistapplication.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.spelllistapplication.components.LevelSpecificSpells
import com.example.spelllistapplication.data.characterspelllist.CustomListEvent
import com.example.spelllistapplication.data.characterspelllist.CustomListState
import com.example.spelllistapplication.data.viewmodels.SetCharacterLevelViewModel
import com.example.spelllistapplication.data.viewmodels.SetCharacterViewModel
import com.example.spelllistapplication.data.viewmodels.spellsKnownMaximum


@Composable
fun CustomListScreen(
    customListState: CustomListState,
    onEventCustomList: (CustomListEvent) -> Unit
){
    val setCharacterViewModel: SetCharacterViewModel = viewModel()
    val characterLevelViewModel: SetCharacterLevelViewModel = viewModel()
    val characterLevel = characterLevelViewModel.characterLevelViewModel.intValue

    if (setCharacterViewModel.characterIdTemp.intValue == -1) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "No character selected.")
            Text(
                textAlign = TextAlign.Center,
                text = "Please return to the character tab to select a character")
        }
    } else{
        Column(modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
        ) {
            // All characters have spells of level 0 and 1 at minimum
            LevelSpecificSpells(
                spellLevel = 0,
                customListState = customListState,
                onEventCustomList = onEventCustomList
            )
            LevelSpecificSpells(
                spellLevel = 1,
                customListState = customListState,
                onEventCustomList = onEventCustomList
            )
            if (spellsKnownMaximum(2, characterLevel) > 0) {
                LevelSpecificSpells(
                    spellLevel = 2,
                    customListState = customListState,
                    onEventCustomList = onEventCustomList
                )
            }
            if (spellsKnownMaximum(3, characterLevel) > 0) {
                LevelSpecificSpells(
                    spellLevel = 3,
                    customListState = customListState,
                    onEventCustomList = onEventCustomList
                )
            }
            if (spellsKnownMaximum(4, characterLevel) > 0) {
                LevelSpecificSpells(
                    spellLevel = 4,
                    customListState = customListState,
                    onEventCustomList = onEventCustomList
                )
            }
            if (spellsKnownMaximum(5, characterLevel) > 0) {
                LevelSpecificSpells(
                    spellLevel = 5,
                    customListState = customListState,
                    onEventCustomList = onEventCustomList
                )
            }
            if (spellsKnownMaximum(6, characterLevel) > 0) {
                LevelSpecificSpells(
                    spellLevel = 6,
                    customListState = customListState,
                    onEventCustomList = onEventCustomList
                )
            }
        }
    }
}

