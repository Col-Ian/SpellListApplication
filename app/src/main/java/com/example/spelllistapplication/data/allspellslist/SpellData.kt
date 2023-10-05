package com.example.spelllistapplication.data.allspellslist

import kotlinx.coroutines.flow.*
// Class for our data model
data class SpellDataModel (
    val spellLevel: Int,
    val spellClass: List<String>,
    val spellClassPreview: List<String>,
    val spellTitle: String,
    val spellPreviewDescription: String,
    val spellSourceBookPreview: String,
    val spellSourcePage: String,
    val spellSourceBookFull: String,
    val spellSchool: String,
    val spellCastingTime: String,
    val spellRange: String,
    val spellTargets: String,
    val spellDuration: String,
    val spellSavingThrow: String,
    val spellResistance : String,
    val spellDescriptionFull: String,
){
    // To be used in SearchBarViewModel
    fun doesMatchSearchQuery(query: String): Boolean{
        val matchingCombinations = listOf(spellTitle)
        // can add more fields if needed:
        /*
        * val matchingCombinations = listOf(
        * spellTitle,
        * spellClass,
        * "$spellTitle $spellClass",
        * etc....
        * )
        * */
        return matchingCombinations.any{
            it.contains(query, ignoreCase = true)
        }

    }
}

