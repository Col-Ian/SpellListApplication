package com.example.spelllistapplication.data.characterdata

sealed interface CharacterEvent {

    object SaveCharacter: CharacterEvent

    data class SetCharacterName(val characterName:String): CharacterEvent
    data class SetCharacterClass(val characterClass:String): CharacterEvent
    data class SetCharacterLevel(val characterLevel:Int): CharacterEvent
    data class SetCharacterKeyAbilityMod(val characterKeyAbilityMod:Int): CharacterEvent

    data class DeleteCharacter(val character: Character): CharacterEvent
    data class SortCharacters(val sortType: SortType): CharacterEvent

    object ShowDialog: CharacterEvent
    object HideDialog: CharacterEvent
}

// To add potential character screen sort options if requested
enum class SortType {
    FIRST_NAME
}