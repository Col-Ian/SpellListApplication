package com.example.spelltablet.components.spellinteractions

import androidx.compose.runtime.MutableState
import com.example.spelltablet.data.allspellslist.SpellDataModel

fun addSpellButtonValidation(
    characterHasSpell: MutableState<Boolean>,
    characterSelected: Int,
    item: SpellDataModel,
    characterClass: String,
    spellSlots: Int
):Boolean
{
    // Show the + button to allow the character to add a spell


    // If the class exists in the spell's list of classes.
    var correctClass = false

    for (classes in item.spellClassWithLevel){
        if (characterClass == classes.dropLast(2)){
            correctClass = true
        }
    }

    return (characterSelected != -1
            // If the character does not have the spell
            && !characterHasSpell.value
            // If the character is the correct class to learn the spell
            && correctClass
            // If the character has spell slots of this level
            && spellSlots > 0)
}