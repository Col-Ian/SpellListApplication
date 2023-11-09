package com.example.spelltablet.data.characterdata

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Character(
    val characterName: String,
    val characterClass: String,
    val characterLevel: Int,
    val characterKeyAbilityScore: Int,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)