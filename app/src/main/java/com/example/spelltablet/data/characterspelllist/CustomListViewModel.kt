package com.example.spelltablet.data.characterspelllist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
//import com.example.spelllistapplication.data.characterdata.CharacterState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

@OptIn(ExperimentalCoroutinesApi::class)
class CustomListViewModel(
    private val dao: CustomListDao
):ViewModel() {
//    val state = MutableStateFlow(CustomListState())

    // Testing******************
    private val _sortType = MutableStateFlow(SortType.SPELL_TITLE)

    private val _customLists = _sortType
        .flatMapLatest { sortType ->
            when(sortType){
                SortType.SPELL_TITLE->dao.getSpellsOrderedByName()
            }
        }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(), emptyList())

    private val _state = MutableStateFlow(CustomListState())

    val state = combine(_state,_sortType,_customLists){ state, sortType, customLists->
        state.copy(
            customLists = customLists,
            sortType = sortType
        )
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), CustomListState())
    // Testing******************

    fun onEvent(event: CustomListEvent){
        when(event){
            // Remove an item from a character's list
            is CustomListEvent.DeleteSpell -> {
                viewModelScope.launch {
                    dao.deleteSpell(event.customList)
                }
            }
            // Add a spell to a character's list
            CustomListEvent.SaveSpell -> {
                val characterFk = state.value.characterFk
                val spellLevel = state.value.spellLevel
                val spellTitle = state.value.spellTitle
                val spellPreviewDescription = state.value.spellPreviewDescription
                val spellSourceBookPreview = state.value.spellSourceBookPreview
                val spellSourcePage = state.value.spellSourcePage
                val spellSourceBookFull = state.value.spellSourceBookFull
                val spellSchool = state.value.spellSchool
                val spellCastingTime = state.value.spellCastingTime
                val spellRange = state.value.spellRange
                val spellTargets = state.value.spellTargets
                val spellArea = state.value.spellArea
                val spellEffect = state.value.spellEffect
                val spellDuration = state.value.spellDuration
                val spellSavingThrow = state.value.spellSavingThrow
                val spellResistance = state.value.spellResistance
                val spellDescriptionFull = state.value.spellDescriptionFull

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
                    spellArea = spellArea,
                    spellEffect = spellEffect,
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
                    characterFk = -1,
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

            is CustomListEvent.GetSpellByCharacterAndLevel -> {
                dao.getSpellByCharacterAndLevel(characterId = state.value.characterFk, spellLevel = state.value.spellLevel)
            }

            is CustomListEvent.SortCustomList -> {
                _sortType.value = event.sortType
            }

            is CustomListEvent.SetSpellState -> {
                _state.update {
                    it.copy(
                        characterFk = event.characterFk,
                        spellLevel = event.spellLevel,
                        spellTitle = event.spellTitle,
                        spellPreviewDescription = event.spellPreviewDescription,
                        spellSourceBookPreview = event.spellSourceBookPreview,
                        spellSourcePage = event.spellSourcePage,
                        spellSourceBookFull = event.spellSourceBookFull,
                        spellSchool = event.spellSchool,
                        spellCastingTime = event.spellCastingTime,
                        spellRange = event.spellRange,
                        spellTargets = event.spellTargets,
                        spellDuration = event.spellDuration,
                        spellSavingThrow = event.spellSavingThrow,
                        spellResistance = event.spellResistance,
                        spellDescriptionFull = event.spellDescriptionFull
                    )
                }
            }

            is CustomListEvent.SetSpellArea -> {
                _state.update {
                    it.copy(
                        spellArea = event.spellArea
                    )
                }
            }
            is CustomListEvent.SetSpellEffect -> {
                _state.update {
                    it.copy(
                        spellEffect = event.spellEffect
                    )
                }
            }
        }
    }
}