package com.icapps.spelltablet.data.allspellslist

// Class for our data model
data class SpellDataModel (
    val spellClassWithLevel: List<String>,
    val spellClassesWithLevelPreview: List<String>,
    val spellTitle: String,
    val spellPreviewDescription: String,
    val spellSourceBookPreview: String,
    val spellSourcePage: String,
    val spellSourceBookFull: String,
    val spellSchool: String,
    val spellCastingTime: String,
    val spellRange: String,
    val spellTargets: String,
    val spellArea: String,
    val spellEffect: String,
    val spellDuration: String,
    val spellSavingThrow: String,
    val spellResistance : String,
    val spellDescriptionFull: String,
){
    // To be used in SearchBarViewModel
    fun doesMatchSearchQuery(query: String): Boolean{
        val matchingCombinations = listOf(
            spellTitle,
            spellSchool
        )
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
    fun doesMatchFilterListsQuery(query: String): Boolean{
        val matchingCombinationsLists =
            // Levels will only be searchable with a class attached, since some spells vary levels based on class
            spellClassWithLevel
            // Drop " level" to just search classes
//            spellClassWithLevel.dropLast(2)

        return matchingCombinationsLists.any{
            it.contains(query)
        }
    }
    fun doesMatchFilterBookQuery(query: String): Boolean{
        val matchingCombinationsString = listOf(
            spellSourceBookFull
        )
        return matchingCombinationsString.any { it.contains(query) }
    }

}

