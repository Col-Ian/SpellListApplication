package com.example.spelllistapplication.components.spellcards

import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.spelllistapplication.data.viewmodels.SetCharacterViewModel
import com.example.spelllistapplication.data.allspellslist.SpellDataModel
import com.example.spelllistapplication.data.characterspelllist.CustomListEvent
import com.example.spelllistapplication.data.characterspelllist.CustomListState
import com.example.spelllistapplication.data.viewmodels.SpellsKnownCurrentViewModel


fun addSpell(
    characterFk: Int,
    item: SpellDataModel,
    state: CustomListState,
    onEventCustomList: (CustomListEvent) -> Unit,
    viewModel: SetCharacterViewModel
){
    onEventCustomList(CustomListEvent.SetSpellState(
        characterFk = viewModel.characterFkTemp.value,
        spellLevel = item.spellLevel,
        spellTitle = item.spellTitle,
        spellPreviewDescription = item.spellPreviewDescription,
        spellSourceBookPreview = item.spellSourceBookPreview,
        spellSourcePage = item.spellSourcePage,
        spellSourceBookFull = item.spellSourceBookFull,
        spellSchool = item.spellSchool,
        spellCastingTime = item.spellCastingTime,
        spellRange = item.spellRange,
        spellTargets = item.spellTargets,
        spellDuration = item.spellDuration,
        spellSavingThrow = item.spellSavingThrow,
        spellResistance = item.spellResistance,
        spellDescriptionFull = item.spellDescriptionFull
    ))
    onEventCustomList(CustomListEvent.SaveSpell)

}