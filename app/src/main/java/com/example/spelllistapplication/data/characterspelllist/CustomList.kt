package com.example.spelllistapplication.data.characterspelllist

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CustomList(
    @PrimaryKey(autoGenerate = true)
    val id:Int = 1,
    val characterFk: Int,
    val spellLevel: Int,
    // Class not needed as of now.
//    val spellClass: String,
//    val spellClassPreview: String,
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
    val spellResistance: String,
    val spellDescriptionFull: String,
)