package com.example.spelllistapplication.data.characterdata

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

@OptIn(ExperimentalCoroutinesApi::class)
class CharacterViewModel(
    private val dao: CharacterDao
):ViewModel(){
    // Default sort type
    private val _sortType = MutableStateFlow(SortType.FIRST_NAME)

    private val _characters = _sortType
        .flatMapLatest { sortType->
            when(sortType){
                SortType.FIRST_NAME->dao.getContactsOrderedByName()
            }
        }.stateIn(viewModelScope,SharingStarted.WhileSubscribed(), emptyList())

    private val _state = MutableStateFlow(CharacterState())

    val state = combine(_state, _sortType, _characters){ state, sortType, characters->
        state.copy(
            characters = characters,
            sortType = sortType
        )
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), CharacterState()) // delay to avoid UI bug

    fun onEvent(event: CharacterEvent){
        when(event){

            // Delete Character
            is CharacterEvent.DeleteCharacter -> {
                viewModelScope.launch {
                    dao.deleteCharacter(event.character)
                }
            }

            // Set our AddCharacterDialog back to hidden
            CharacterEvent.HideDialog -> {
                _state.update {
                    it.copy(
                        isAddingCharacter = false
                    )
                }
            }

            // Save a Character
            CharacterEvent.SaveCharacter -> {
                val characterName = state.value.characterName
                val characterClass = state.value.characterClass
                val characterLevel = state.value.characterLevel
                val characterKeyAbilityMod = state.value.characterKeyAbilityMod

                if (characterName.isBlank() || characterClass.isBlank()){
                    return // Level and ability mod are default 0.
                }
                val character = Character(
                    characterName = characterName,
                    characterClass = characterClass,
                    characterLevel = characterLevel,
                    characterKeyAbilityMod = characterKeyAbilityMod,
//                    characterSavedSpells = listOf()
                )
                viewModelScope.launch {
                    dao.upsertCharacter(character)
                }

                // Reset values to default.
                _state.update {
                    it.copy(
                        characterName = "",
                        characterClass = "",
                        characterLevel = 0,
                        characterKeyAbilityMod = 0
                    )
                }
            }
            is CharacterEvent.SetCharacterClass -> {
                _state.update {
                    it.copy(
                        characterClass = event.characterClass
                    )
                }
            }
            is CharacterEvent.SetCharacterKeyAbilityMod -> {
                _state.update {
                    it.copy(
                        characterKeyAbilityMod = event.characterKeyAbilityMod
                    )
                }
            }
            is CharacterEvent.SetCharacterLevel -> {
                _state.update {
                    it.copy(
                        characterLevel = event.characterLevel
                    )
                }
            }
            is CharacterEvent.SetCharacterName -> {
                _state.update {
                    it.copy(
                        characterName = event.characterName
                    )
                }
            }
            CharacterEvent.ShowDialog->{
                _state.update {
                    it.copy(
                        isAddingCharacter = true
                    )
                }
            }
            is CharacterEvent.SortCharacters -> {
                _sortType.value = event.sortType
            }
        }
    }
}