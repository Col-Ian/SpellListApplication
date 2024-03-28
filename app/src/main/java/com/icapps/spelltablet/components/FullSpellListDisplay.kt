package com.icapps.spelltablet.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDownward
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.icapps.spelltablet.components.spellinteractions.DropDownFilter
import com.icapps.spelltablet.components.spelllistspellcards.SpellCard
import com.icapps.spelltablet.components.textcomponents.BasicTextFieldComponent
import com.icapps.spelltablet.components.textcomponents.spelllist.LearnableSpellsText
import com.icapps.spelltablet.components.textcomponents.spelllist.LevelFilterPlaceholderText
import com.icapps.spelltablet.data.characterspelllist.CustomListEvent
import com.icapps.spelltablet.data.characterspelllist.CustomListState
import com.icapps.spelltablet.viewmodels.FiltersAndSearchBarViewModel
import com.icapps.spelltablet.viewmodels.IsListEmptyViewModel
import com.icapps.spelltablet.viewmodels.LearnableSwitchViewModel
import com.icapps.spelltablet.viewmodels.SearchBarValueViewModel
import com.icapps.spelltablet.viewmodels.SetCharacterViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SpellList(
    customListState: CustomListState,
    onEventCustomList: (CustomListEvent) -> Unit,
    modifier: Modifier = Modifier
){
    // Filter values

    val viewModelFilters = viewModel<FiltersAndSearchBarViewModel>()
    val searchText by viewModelFilters.searchText.collectAsState()
    val spellData by viewModelFilters.spellData.collectAsState()

    // Need to set the characterSelected here to force a recompose on lazy list on change
    val setCharacterViewModel: SetCharacterViewModel = viewModel()
    val characterSelected = setCharacterViewModel.characterIdTemp.intValue



    // For the drop down arrow to show filters.
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


    // Deny ability to select levels if no specific class selected
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
        "Angels of the Drift",
        "Armory",
        "Character Operations Manual",
        "Drift Crisis",
        "Galactic Magic",
        "Galaxy Exploration Manual",
        "Interstellar Species",
        "Junker's Delight",
        "Near Space",
        "Pact Worlds",
        "Ports of Call",
        "Redshift Rally",
        "Starfinder Enhanced",
        "Tech Revolution"
    )

    // Default to all books selected
    val (selectedBook, onBookSelected) = remember {
        mutableStateOf( bookOptions[0] )
    }

    if (selectedBook == "All") {
        viewModelFilters.onFilterSourceBookChange("")
    } else{
        viewModelFilters.onFilterSourceBookChange(selectedBook)
    }


    // State of our switch for displaying only learnable spells
    val learnableSwitch: LearnableSwitchViewModel = viewModel()

    // State of our isListEmpty value to display when learnable spells search results empty.
    val isListEmpty: IsListEmptyViewModel = viewModel()

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        BasicTextFieldComponent(
            searchText = searchText,
            viewModelFilters = viewModelFilters,
            placeholderText = "Spell Title/School"
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
                    LevelFilterPlaceholderText(text = "Please select a class to filter levels")
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
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 4.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
            ){
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
                // Add Toggle Button for spells for character only if id != -1
            if (characterSelected != -1){
                Row(verticalAlignment = Alignment.CenterVertically) {
                    LearnableSpellsText(text = "Learnable Spells")
                    Switch(checked = learnableSwitch.learnableSwitch.value, onCheckedChange = {
                        learnableSwitch.learnableSwitch.value = it
                    },
                        thumbContent = if (learnableSwitch.learnableSwitch.value) {
                            {
                                Icon(
                                    imageVector = Icons.Filled.Check,
                                    contentDescription = null,
                                    modifier = Modifier.size(SwitchDefaults.IconSize),
                                )
                            }
                        } else {
                            null
                        }
                    )
                }
            }
        }

        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
                .fillMaxHeight()
        ) {
            Spacer(modifier = Modifier.height(8.dp))

            if(learnableSwitch.learnableSwitch.value) {
                isListEmpty.isListEmpty.value = true
                LazyColumn(
                    modifier = modifier
                ) {
                    val emptyList = (1)
                    items(spellData.sortedBy { it.spellTitle }) { item ->
                        SpellCard(
                            customListState = customListState,
                            onEventCustomList = onEventCustomList,
                            item,
                            characterSelected = characterSelected,
                            showAllSpells = false
                        )
                    }
//                    Will display if there are no results when Learnable is selected.
                    if(isListEmpty.isListEmpty.value){
                        items(emptyList) {
                            Text(
                                modifier = Modifier.padding(4.dp),
                                textAlign = TextAlign.Center,
                                text = "No spells available. Check your spelling, filters, or that the character has spell slots for the level of spell you're looking for."
                            )
                        }
                    }
                }
            } else{
                LazyColumn(
                    modifier = modifier
                ){
                    items(spellData.sortedBy { it.spellTitle }){ item ->
                        SpellCard(
                            customListState = customListState,
                            onEventCustomList = onEventCustomList,
                            item,
                            characterSelected = characterSelected,
                            showAllSpells = true
                        )
                    }
                }
//                Will display if there are no results based on the search criteria.
                if(spellData.isEmpty()){
                    Text(
                        modifier = Modifier.padding(4.dp),
                        textAlign = TextAlign.Center,
                        text = "No spells available. Check your spelling in the search bar."
                    )
                }
            }
        }

    }
}