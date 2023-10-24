package com.example.spelllistapplication.data.characterspelllist

data class CustomListState(
    val customLists: List<CustomList> = emptyList(),
    val characterFk: Int = 0,
    val spellLevel: Int = -1,
    val spellTitle: String = "",
    val spellPreviewDescription: String = "",
    val spellSourceBookPreview: String = "",
    val spellSourcePage: String = "",
    val spellSourceBookFull: String = "",
    val spellSchool: String = "",
    val spellCastingTime: String = "",
    val spellRange: String = "",
    val spellTargets: String = "",
    val spellArea: String = "",
    val spellEffect: String = "",
    val spellDuration: String = "",
    val spellSavingThrow: String = "",
    val spellResistance: String = "",
    val spellDescriptionFull: String = "",

// testing stuff
    val sortType: SortType = SortType.SPELL_TITLE
)