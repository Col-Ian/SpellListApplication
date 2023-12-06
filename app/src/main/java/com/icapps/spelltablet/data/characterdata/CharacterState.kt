package com.icapps.spelltablet.data.characterdata

data class CharacterState (
    val characters: List<Character> = emptyList(),
    val characterName: String = "",//
    val characterClass: String = "",//
    val characterLevel: Int = 0,
    val characterKeyAbilityScore: Int = 0,
    val characterId: Int = -1,

    val sortType: SortType = SortType.CHARACTER_NAME,
    // If a user is adding a new character, this will show the AddCharacterDialog
    val isAddingCharacter: Boolean = false,
    // If a user is deleting a character, this will prompt them to confirm with the DeleteCharacterDialog
    val isDeletingCharacter: Boolean = false,
    // If a user is adding a new character, this will show the UpdateCharacterDialog
    val isUpdatingCharacter: Boolean = false
)