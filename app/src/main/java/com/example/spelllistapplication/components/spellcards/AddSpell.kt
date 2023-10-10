package com.example.spelllistapplication.components.spellcards

import com.example.spelllistapplication.data.allspellslist.SpellDataModel
import com.example.spelllistapplication.data.characterspelllist.CustomListEvent
import com.example.spelllistapplication.data.viewmodels.SetCharacterViewModel


fun addSpell(
    item: SpellDataModel,
    onEventCustomList: (CustomListEvent) -> Unit,
    viewModel: SetCharacterViewModel
){
    onEventCustomList(CustomListEvent.SetSpellState(
        characterFk = viewModel.characterFkTemp.intValue,
        spellLevel = 0, // This is going to turn into an if statement when changes are made make "class level" instead of two separate elements, 0 as a placeholder
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