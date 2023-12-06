package com.icapps.spelltablet.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.icapps.spelltablet.data.allspellslist.SpellData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn

class FiltersAndSearchBarViewModel: ViewModel(){

    // **************************************************************************
    // Filters for the search bar

    val _searchText = MutableStateFlow("")


    val searchText = _searchText.asStateFlow()

    // Buffer if searching outside sources
//    private val _isSearching = MutableStateFlow(false)
//    val isSearching = _isSearching.asStateFlow()

    private val _searchBarSpellData = MutableStateFlow(SpellData) // Data class, not the object
    // always trigger search as the value changes
    private val searchBarSpellData = searchText
        .combine(_searchBarSpellData){ text, spellData->
            // If search field is empty, return full list as it is
            if(text.isBlank()){
                spellData
            } else{
                spellData.filter {
                    it.doesMatchSearchQuery(text)
                }
            }
        }.stateIn(
            //Turn a normal flow into a state flow
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            _searchBarSpellData.value
        )

    fun onSearchTextChange(text: String){
        _searchText.value = text
    }

    // **************************************************************************
    // Filters for the class options

    private val _searchClassAndLevel = MutableStateFlow("")

    private val  searchClassAndLevel = _searchClassAndLevel.asStateFlow()

    // Already MutableStateFlow at top
    private val _classAndLevelFilterSpellData = searchBarSpellData

    private val classAndLevelFilterSpellData = searchClassAndLevel
        .combine(_classAndLevelFilterSpellData){ text, spellData->
            if(text.isBlank()){
                spellData
            } else{
                spellData.filter {
                    it.doesMatchFilterListsQuery(text)
                }
            }
        }.stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            _classAndLevelFilterSpellData.value
        )

    fun onFilterClassAndLevelChange(text: String){
        _searchClassAndLevel.value = text
    }

    // **************************************************************************
    // Filters for the source book options

    private val _searchSourceBook = MutableStateFlow("")

    private val  searchSourceBook = _searchSourceBook.asStateFlow()

    // Final filter, unless more are needed.
    val spellData = searchSourceBook
        .combine(classAndLevelFilterSpellData){text, spellData->
            if(text.isBlank()){
                spellData
            } else{
                spellData.filter {
                    it.doesMatchFilterBookQuery(text)
                }
            }
        }.stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            classAndLevelFilterSpellData.value
        )

    fun onFilterSourceBookChange(text: String){
        _searchSourceBook.value = text
    }
}

