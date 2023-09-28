package com.example.spelllistapplication.data.characterdata

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Character(
    val characterName: String,
    val characterClass: String,
    val characterLevel: Int,
    val characterKeyAbilityMod: Int,
    // Needs to be used in a Type Converter later, or consider making a new @Entity for the characters spell list
//    val characterSavedSpells: List<String>,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)