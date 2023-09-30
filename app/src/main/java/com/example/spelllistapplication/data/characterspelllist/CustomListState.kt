package com.example.spelllistapplication.data.characterspelllist

data class CustomListState(
    val customLists: List<CustomList> = emptyList(),
    val characterFk: Int = 0,
    val spellLevel: Int = 0,
    val spellTitle: String = "",
    val spellPreviewDescription: String = "",
    val spellSourceBookPreview: String = "",
    val spellSourcePage: String = "",
    val spellSourceBookFull: String = "",
    val spellSchool: String = "",
    val spellCastingTime: String = "",
    val spellRange: String = "",
    val spellTargets: String = "",
    val spellDuration: String = "",
    val spellSavingThrow: String = "",
    val spellResistance: String = "",
    val spellDescriptionFull: String = ""
)