package com.example.spelllistapplication.data.characterspelllist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class CustomListViewModel(
    private val dao: CustomListDao
):ViewModel() {

    private val _state = MutableStateFlow(CustomListState())

    fun onEvent(event: CustomListEvent){
        when(event){
            // Remove an item from a character's list
            is CustomListEvent.DeleteSpell -> {
                viewModelScope.launch {
                    dao.deleteSpell(event.customList)
                }
            }
            // Add a spell to a character's list
            CustomListEvent.SaveSpellToCharacter -> {
                val characterFk = _state.value.characterFk
                val spellLevel = _state.value.spellLevel
                val spellTitle = _state.value.spellTitle
                val spellPreviewDescription = _state.value.spellPreviewDescription
                val spellSourceBookPreview = _state.value.spellSourceBookPreview
                val spellSourcePage = _state.value.spellSourcePage
                val spellSourceBookFull = _state.value.spellSourceBookFull
                val spellSchool = _state.value.spellSchool
                val spellCastingTime = _state.value.spellCastingTime
                val spellRange = _state.value.spellRange
                val spellTargets = _state.value.spellTargets
                val spellDuration = _state.value.spellDuration
                val spellSavingThrow = _state.value.spellSavingThrow
                val spellResistance = _state.value.spellResistance
                val spellDescriptionFull = _state.value.spellDescriptionFull

                val customList = CustomList(
                    characterFk = characterFk,
                    spellLevel = spellLevel,
                    spellTitle = spellTitle,
                    spellPreviewDescription = spellPreviewDescription,
                    spellSourceBookPreview = spellSourceBookPreview,
                    spellSourcePage = spellSourcePage,
                    spellSourceBookFull = spellSourceBookFull,
                    spellSchool = spellSchool,
                    spellCastingTime = spellCastingTime,
                    spellRange = spellRange,
                    spellTargets = spellTargets,
                    spellDuration = spellDuration,
                    spellSavingThrow = spellSavingThrow,
                    spellResistance = spellResistance,
                    spellDescriptionFull = spellDescriptionFull
                )
                viewModelScope.launch {
                    dao.upsertSpell(customList)
                }
                // Reset values to default
                _state.update {
                    it.copy(
                    characterFk = 0,
                    spellLevel = 0,
                    spellTitle = "",
                    spellPreviewDescription = "",
                    spellSourceBookPreview = "",
                    spellSourcePage = "",
                    spellSourceBookFull = "",
                    spellSchool = "",
                    spellCastingTime = "",
                    spellRange = "",
                    spellTargets = "",
                    spellDuration = "",
                    spellSavingThrow = "",
                    spellResistance = "",
                    spellDescriptionFull = ""
                    )
                }
            }
            is CustomListEvent.SetCharacterFk -> {
                _state.update {
                    it.copy(
                        characterFk = event.characterFk
                    )
                }
            }
            is CustomListEvent.SetSpellCastingTime -> {
                _state.update {
                    it.copy(
                        spellCastingTime = event.spellCastingTime
                    )
                }
            }
            is CustomListEvent.SetSpellDescriptionFull -> {
                _state.update {
                    it.copy(
                        spellDescriptionFull = event.spellDescriptionFull
                    )
                }
            }
            is CustomListEvent.SetSpellDuration -> {
                _state.update {
                    it.copy(
                        spellDuration = event.spellDuration
                    )
                }
            }
            is CustomListEvent.SetSpellLevel -> {
                _state.update {
                    it.copy(
                        spellLevel = event.spellLevel
                    )
                }
            }
            is CustomListEvent.SetSpellPreviewDescription -> {
                _state.update {
                    it.copy(
                        spellPreviewDescription = event.spellPreviewDescription
                    )
                }
            }
            is CustomListEvent.SetSpellRange -> {
                _state.update {
                    it.copy(
                        spellRange = event.spellRange
                    )
                }
            }
            is CustomListEvent.SetSpellResistance -> {
                _state.update {
                    it.copy(
                        spellResistance = event.spellResistance
                    )
                }
            }
            is CustomListEvent.SetSpellSavingThrow -> {
                _state.update {
                    it.copy(
                        spellSavingThrow = event.spellSavingThrow
                    )
                }
            }
            is CustomListEvent.SetSpellSchool -> {
                _state.update {
                    it.copy(
                        spellSchool = event.spellSchool
                    )
                }
            }
            is CustomListEvent.SetSpellSourceBookFull -> {
                _state.update {
                    it.copy(
                        spellSourceBookFull = event.spellSourceBookFull
                    )
                }
            }
            is CustomListEvent.SetSpellSourceBookPreview -> {
                _state.update {
                    it.copy(
                        spellSourceBookPreview = event.spellSourceBookPreview
                    )
                }
            }
            is CustomListEvent.SetSpellSourcePage -> {
                _state.update {
                    it.copy(
                        spellSourcePage = event.spellSourcePage
                    )
                }
            }
            is CustomListEvent.SetSpellTargets -> {
                _state.update {
                    it.copy(
                        spellTargets = event.spellTargets
                    )
                }
            }
            is CustomListEvent.SetSpellTitle -> {
                _state.update {
                    it.copy(
                        spellTitle = event.spellTitle
                    )
                }
            }
        }
    }
}