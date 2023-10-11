package com.example.spelllistapplication.components.spellcards

import android.content.Context
import android.widget.Toast
import com.example.spelllistapplication.data.allspellslist.SpellDataModel
import com.example.spelllistapplication.data.characterspelllist.CustomListEvent
import com.example.spelllistapplication.data.viewmodels.SetCharacterClassViewModel
import com.example.spelllistapplication.data.viewmodels.SetCharacterLevelViewModel
import com.example.spelllistapplication.data.viewmodels.SetCharacterViewModel
import com.example.spelllistapplication.data.viewmodels.SetTempSpellLevelViewModel
import com.example.spelllistapplication.data.viewmodels.spellsKnownMaximum


fun addSpell(
    item: SpellDataModel,
    onEventCustomList: (CustomListEvent) -> Unit,
    setCharacterViewModel: SetCharacterViewModel,
    setTempSpellLevelViewModel: SetTempSpellLevelViewModel,
    setCharacterLevelViewModel: SetCharacterLevelViewModel,
    characterClass: SetCharacterClassViewModel,
    context: Context
){

    for (spellClass in item.spellClassWithLevel){
        if (spellClass.dropLast(2) == characterClass.characterClassViewModel.value)
            setTempSpellLevelViewModel.tempSpellLevelViewModel.intValue = spellClass.takeLast(1).toInt()
    }
    if (setTempSpellLevelViewModel.tempSpellLevelViewModel.intValue == -2){
        Toast.makeText(context,"No character selected.", Toast.LENGTH_SHORT).show()
    } else if (setTempSpellLevelViewModel.tempSpellLevelViewModel.intValue == -1){
        Toast.makeText(context,"Wrong class for this spell.", Toast.LENGTH_SHORT).show()
    } else if (spellsKnownMaximum(setTempSpellLevelViewModel.tempSpellLevelViewModel.intValue, setCharacterLevelViewModel.characterLevelViewModel.intValue ) == 0){
        Toast.makeText(context,"No spell slots of this level.", Toast.LENGTH_SHORT).show()
    }else{
        onEventCustomList(CustomListEvent.SetSpellState(
            characterFk = setCharacterViewModel.characterFkTemp.intValue,
            spellLevel = setTempSpellLevelViewModel.tempSpellLevelViewModel.intValue,
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
        // Reset our tempSpellLevel
        setTempSpellLevelViewModel.tempSpellLevelViewModel.intValue = -1
        Toast.makeText(context,"Spell added.", Toast.LENGTH_SHORT).show()
    }
}

