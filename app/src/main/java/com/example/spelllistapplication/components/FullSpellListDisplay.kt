package com.example.spelllistapplication.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDownward
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.spelllistapplication.components.spellinteractions.DropDownFilter
import com.example.spelllistapplication.components.spelllistspellcards.SpellCard
import com.example.spelllistapplication.data.characterdata.CharacterEvent
import com.example.spelllistapplication.data.characterdata.CharacterState
import com.example.spelllistapplication.data.characterspelllist.CustomListEvent
import com.example.spelllistapplication.data.characterspelllist.CustomListState
import com.example.spelllistapplication.data.viewmodels.FiltersAndSearchBarViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SpellList(
    characterState: CharacterState,
    customListState: CustomListState,
    onEventCharacter: (CharacterEvent) -> Unit,
    onEventCustomList: (CustomListEvent) -> Unit,
    modifier: Modifier = Modifier
){
    // Filter values

    val viewModelFilters = viewModel<FiltersAndSearchBarViewModel>()
    val searchText by viewModelFilters.searchText.collectAsState()
    val spellData by viewModelFilters.spellData.collectAsState()

    val showFilters = remember { mutableStateOf(false) }
    // Class filters
    val classOptions = listOf("All","Mystic", "Precog", "Technomancer", "Witchwarper")

    val (selectedClass, onClassSelected) = remember {
        mutableStateOf( classOptions[0] )
    }

    // Level filters
    val levelOptions = listOf("Any","0", "1", "2", "3", "4", "5", "6")

    val (selectedLevel, onLevelSelected) = remember {
        mutableStateOf( levelOptions[0] )
    }

    if (selectedClass == "All") {
        viewModelFilters.onFilterClassAndLevelChange("")
    } else if (selectedLevel == "Any"){
        viewModelFilters.onFilterClassAndLevelChange(selectedClass)
    } else {
        viewModelFilters.onFilterClassAndLevelChange("$selectedClass $selectedLevel")
    }

    // Book filters, maybe turn into resource to add more simply later
    val bookOptions = listOf(
        "All",
        "Core Rulebook",
        "Adventure Path",
        "Alien Archive",
        "Armory",
        "Character Operations Manual",
        "Drift Crisis",
        "Galactic Magic",
        "Interstellar Species",
        "Near Space"
    )

    val (selectedBook, onBookSelected) = remember {
        mutableStateOf( bookOptions[0] )
    }

    if (selectedBook == "All") {
        viewModelFilters.onFilterSourceBookChange("")
    } else{
        viewModelFilters.onFilterSourceBookChange(selectedBook)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        TextField(
            value = searchText,
            onValueChange = viewModelFilters::onSearchTextChange,
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text(text = "Spell Title/School")}
        )

        if (showFilters.value){
            Column(Modifier.fillMaxWidth()) {
                // Class filters
                DropDownFilter(
                    filterType = "Class",
                    selectedOption = selectedClass,
                    onOptionSelected = onClassSelected,
                    filters = viewModelFilters::onFilterClassAndLevelChange,
                    allOptions = classOptions

                )

                // Spell level filters
                if(selectedClass == "All"){
                    Text(text = "Please select a class to filter levels")
                } else {
                    DropDownFilter(
                        filterType = "Level",
                        selectedOption = selectedLevel,
                        onOptionSelected = onLevelSelected,
                        filters = viewModelFilters::onFilterClassAndLevelChange,
                        allOptions = levelOptions
                    )
                }
                DropDownFilter(
                    filterType = "Source Book",
                    selectedOption = selectedBook,
                    onOptionSelected = onBookSelected,
                    filters = viewModelFilters::onFilterSourceBookChange,
                    allOptions = bookOptions
                )
            }
        }
        IconButton(onClick = { showFilters.value = !showFilters.value }) {
            if (showFilters.value){
                Icon(
                    imageVector = Icons.Default.ArrowUpward,
                    contentDescription = "Hide filters"
                )
            } else {
                Icon(
                    imageVector = Icons.Default.ArrowDownward,
                    contentDescription = "Show filters"
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        LazyColumn(
            modifier = modifier
        ){
            items(spellData.sortedBy { it.spellTitle }){ item ->
                SpellCard(
                    characterState = characterState,
                    customListState = customListState,
                    onEventCharacter = onEventCharacter,
                    onEventCustomList = onEventCustomList,
                    item
                )
            }
        }
    }
}