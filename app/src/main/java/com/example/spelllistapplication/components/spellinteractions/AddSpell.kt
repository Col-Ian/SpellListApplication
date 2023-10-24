package com.example.spelllistapplication.components.spellinteractions

import android.content.Context
import android.widget.Toast
import com.example.spelllistapplication.data.allspellslist.SpellDataModel
import com.example.spelllistapplication.data.characterspelllist.CustomListEvent
import com.example.spelllistapplication.viewmodels.SetCharacterViewModel
import com.example.spelllistapplication.viewmodels.SetTempSpellLevelViewModel
import com.example.spelllistapplication.viewmodels.spellsKnownMaximum


fun addSpell(
    item: SpellDataModel,
    onEventCustomList: (CustomListEvent) -> Unit,
    setCharacterViewModel: SetCharacterViewModel,
    setTempSpellLevelViewModel: SetTempSpellLevelViewModel,
    context: Context
){
    for (spellClass in item.spellClassWithLevel){
        if (spellClass.dropLast(2) == setCharacterViewModel.characterClass.value)
            setTempSpellLevelViewModel.tempSpellLevel.intValue = spellClass.takeLast(1).toInt()
    }

    // In case AddSpellButtonValidation fails.
    if (setTempSpellLevelViewModel.tempSpellLevel.intValue == -2){
        Toast.makeText(context,"No character selected.", Toast.LENGTH_SHORT).show()
    } else if (setTempSpellLevelViewModel.tempSpellLevel.intValue == -1){
        Toast.makeText(context,"Wrong class for this spell.", Toast.LENGTH_SHORT).show()
    } else if (spellsKnownMaximum(setTempSpellLevelViewModel.tempSpellLevel.intValue, setCharacterViewModel.characterLevel.intValue ) == 0){
        Toast.makeText(context,"No spell slots of this level.", Toast.LENGTH_SHORT).show()
    }else{
        onEventCustomList(CustomListEvent.SetSpellState(
            characterFk = setCharacterViewModel.characterIdTemp.intValue,
            spellLevel = setTempSpellLevelViewModel.tempSpellLevel.intValue,
            spellTitle = item.spellTitle,
            spellPreviewDescription = item.spellPreviewDescription,
            spellSourceBookPreview = item.spellSourceBookPreview,
            spellSourcePage = item.spellSourcePage,
            spellSourceBookFull = item.spellSourceBookFull,
            spellSchool = item.spellSchool,
            spellCastingTime = item.spellCastingTime,
            spellRange = item.spellRange,
            spellTargets = item.spellTargets,
            spellArea = item.spellArea,
            spellEffect = item.spellEffect,
            spellDuration = item.spellDuration,
            spellSavingThrow = item.spellSavingThrow,
            spellResistance = item.spellResistance,
            spellDescriptionFull = item.spellDescriptionFull
        ))
        onEventCustomList(CustomListEvent.SaveSpell)
        // Reset our tempSpellLevel
        setTempSpellLevelViewModel.tempSpellLevel.intValue = -1
        Toast.makeText(context,"Spell added.", Toast.LENGTH_SHORT).show()
    }
}

