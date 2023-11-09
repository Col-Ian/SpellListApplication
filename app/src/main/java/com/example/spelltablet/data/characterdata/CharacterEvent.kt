package com.example.spelltablet.data.characterdata

sealed interface CharacterEvent {

    object SaveCharacter: CharacterEvent

    object UpdateCharacter: CharacterEvent

    data class SetCharacterId(val characterId: Int): CharacterEvent
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

    object ShowUpdateCharacterDialog: CharacterEvent
    object HideUpdateCharacterDialog: CharacterEvent

    data class SetCharacterState(
        val characterId: Int,
        val characterName:String,
        val characterClass:String,
        val characterLevel:Int,
        val characterKeyAbilityScore:Int
    ):CharacterEvent

    object ResetCharacterState:CharacterEvent
}

// To add potential character screen sort options if requested
enum class SortType {
    CHARACTER_NAME
}