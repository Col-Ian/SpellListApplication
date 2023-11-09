package com.example.spelltablet.components.spelllistspellcards

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.spelltablet.components.spellinteractions.addSpellButtonValidation
import com.example.spelltablet.data.allspellslist.SpellDataModel
import com.example.spelltablet.data.characterspelllist.CustomListEvent
import com.example.spelltablet.data.characterspelllist.CustomListState
import com.example.spelltablet.viewmodels.SetCharacterViewModel
import com.example.spelltablet.viewmodels.spellsKnownMaximum

// Each individual Spell card to display
@Composable
fun SpellCard(
    customListState: CustomListState,
    onEventCustomList: (CustomListEvent) -> Unit,
    item: SpellDataModel,
    characterSelected: Int,
    showAllSpells: Boolean
){
    val expanded = remember { mutableStateOf(false) }
    val setCharacterViewModel: SetCharacterViewModel = viewModel()
    val characterClass = setCharacterViewModel.characterClass.value
    val characterLevel = setCharacterViewModel.characterLevel.intValue
    val context = LocalContext.current

    // Validate spell is already in character's list
    val characterHasSpell = remember {
        mutableStateOf(false)
    }
    for (spell in customListState.customLists) {
        if (spell.characterFk == characterSelected && spell.spellTitle == item.spellTitle) {
            characterHasSpell.value = true
        }
    }

    val spellLevel = remember {
        mutableIntStateOf(-1)
    }

    for(classRequired in item.spellClassWithLevel){
        if(classRequired.dropLast(2) == characterClass){
            spellLevel.intValue = classRequired.takeLast(1).toInt()
        }
    }

    val spellSlots = spellsKnownMaximum(
        characterLevel = characterLevel,
        spellLevel = spellLevel.intValue
    )

    val characterCanLearnSpell = addSpellButtonValidation(
        characterHasSpell = characterHasSpell,
        characterSelected = setCharacterViewModel.characterIdTemp.intValue,
        item = item,
        characterClass = characterClass,
        spellSlots = spellSlots
    )



    val showSpell = remember {
        mutableStateOf(true)
    }

    // If the learnableSwitch is true, and the characterCanLearnSpell is false, do not show the spell.
    if ( !showAllSpells && !characterCanLearnSpell){
        showSpell.value = false
    }


    // Whether or not to show the spell based on the toggle to only show learnable spells


    if(showSpell.value) {
        Box(
            // to add padding between cards
            modifier = Modifier.padding(4.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        MaterialTheme.colorScheme.primary,
                        shape = RoundedCornerShape(8.dp)
                    )

            ) {
                Column(
                    modifier = Modifier
                        .clickable { expanded.value = !expanded.value }
                        .fillMaxWidth()
                        .padding( 4.dp)                    ,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    if (expanded.value) {
                        SpellFullDescription(
                            item = item,
                            onEventCustomList = onEventCustomList,
                            context = context,
                            characterCanLearnSpell = characterCanLearnSpell
                        )
                    } else {
                        SpellPreview(
                            item = item,
                            onEventCustomList = onEventCustomList,
                            context = context,
                            characterCanLearnSpell = characterCanLearnSpell
                        )
                    }
                }
            }
        }
    }
}