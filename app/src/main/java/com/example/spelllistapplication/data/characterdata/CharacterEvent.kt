package com.example.spelllistapplication.data.characterdata

sealed interface CharacterEvent {

    object SaveCharacter: CharacterEvent

    data class SetCharacterName(val characterName:String): CharacterEvent
    data class SetCharacterClass(val characterClass:String): CharacterEvent
    data class SetCharacterLevel(val characterLevel:Int): CharacterEvent
    data class SetCharacterKeyAbilityScore(val characterKeyAbilityScore:Int): CharacterEvent

    data class DeleteCharacter(val character: Character): CharacterEvent
    data class SortCharacters(val sortType: SortType): CharacterEvent

    object ShowAddCharacterDialog: CharacterEvent
    object HideAddCharacterDialog: CharacterEvent

    object ShowDeleteCharacterDialog: CharacterEvent
    object HideDeleteCharacterDialog: CharacterEvent
}

// To add potential character screen sort options if requested
enum class SortType {
    CHARACTER_NAME
}