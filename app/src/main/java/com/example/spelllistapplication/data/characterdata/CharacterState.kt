package com.example.spelllistapplication.data.characterdata

data class CharacterState (
    val characters: List<Character> = emptyList(),
    val characterName: String = "",
    val characterClass: String = "",
    val characterLevel: Int = 0,
    val characterKeyAbilityMod: Int = 0,

    val sortType: SortType = SortType.CHARACTER_NAME,
    // If a user is adding a new contact, this will show the AddCharacterDialog
    val isAddingCharacter: Boolean = false
)