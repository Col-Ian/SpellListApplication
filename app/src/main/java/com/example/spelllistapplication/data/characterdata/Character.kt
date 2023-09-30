package com.example.spelllistapplication.data.characterdata

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Character(
    val characterName: String,
    val characterClass: String,
    val characterLevel: Int,
    val characterKeyAbilityMod: Int,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)