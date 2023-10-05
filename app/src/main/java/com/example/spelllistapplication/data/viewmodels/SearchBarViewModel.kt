package com.example.spelllistapplication.data.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.spelllistapplication.data.allspellslist.SpellData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn

class SearchBarViewModel: ViewModel(){

    // The viewModel can change the value, but the UI can't
    private val _searchText = MutableStateFlow("")

    val searchText = _searchText.asStateFlow()

    private val _isSearching = MutableStateFlow(false)
    val isSearching = _isSearching.asStateFlow()

    private val _spellData = MutableStateFlow(SpellData) // Data class, not the object
    // always trigger search as the value changes
    val spellData = searchText
        .combine(_spellData){ text, spellData->
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
            _spellData.value
        )

    fun onSearchTextChange(text: String){
        _searchText.value = text
    }
}

