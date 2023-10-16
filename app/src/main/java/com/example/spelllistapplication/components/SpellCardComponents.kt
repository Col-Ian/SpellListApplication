package com.example.spelllistapplication.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowDownward
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.spelllistapplication.components.spellcards.addSpell
import com.example.spelllistapplication.data.viewmodels.SetCharacterViewModel
import com.example.spelllistapplication.data.allspellslist.SpellDataModel
import com.example.spelllistapplication.data.characterdata.CharacterEvent
import com.example.spelllistapplication.data.characterdata.CharacterState
import com.example.spelllistapplication.data.characterspelllist.CustomListEvent
import com.example.spelllistapplication.data.characterspelllist.CustomListState
import com.example.spelllistapplication.data.viewmodels.FiltersAndSearchBarViewModel
import com.example.spelllistapplication.data.viewmodels.SetCharacterClassViewModel
import com.example.spelllistapplication.data.viewmodels.SetCharacterLevelViewModel
import com.example.spelllistapplication.data.viewmodels.SetTempSpellLevelViewModel
import com.example.spelllistapplication.data.viewmodels.SpellsKnownCurrentViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SpellCard(
    characterState: CharacterState,
    customListState: CustomListState,
    onEventCharacter: (CharacterEvent) -> Unit,
    onEventCustomList: (CustomListEvent) -> Unit,
    modifier: Modifier = Modifier
){
    // **************************************************************************
    // Filter values

    val viewModelFilters = viewModel<FiltersAndSearchBarViewModel>()
    val searchText by viewModelFilters.searchText.collectAsState()
    val spellData by viewModelFilters.spellData.collectAsState()
    // Needed to add a buffer timer if we search an outside resource
//    val isSearching by viewModelSearch.isSearching.collectAsState()

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
            placeholder = { Text(text = "Spell Title")}
        )

        if (showFilters.value){
            Column(Modifier.fillMaxWidth()) {
                val expandedClass = remember { mutableStateOf(false) }

                ExposedDropdownMenuBox(
                    expanded = expandedClass.value,
                    onExpandedChange = {newValue -> expandedClass.value = newValue}
                ) {
                    TextField(
                        value = selectedClass,
                        onValueChange = viewModelFilters::onFilterClassAndLevelChange,
                        readOnly = true,
                        trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expandedClass.value) },
                        modifier = Modifier.menuAnchor(),
                        label = { Text(text = "Class")}
                    )
                    ExposedDropdownMenu(
                        expanded = expandedClass.value,
                        onDismissRequest = { expandedClass.value = false }) {
                        classOptions.forEach { item->
                            DropdownMenuItem(
                                text = { Text(text = item) },
                                onClick = {
                                    onClassSelected(item)
                                    expandedClass.value = false
                                }
                            )
                        }
                    }
                }
                val expandedLevel = remember { mutableStateOf(false) }

                if(selectedClass == "All"){
                    Text(text = "Please select a class to filter levels")
                } else {
                    ExposedDropdownMenuBox(
                        expanded = expandedLevel.value,
                        onExpandedChange = {newValue -> expandedLevel.value = newValue}
                    ) {
                        TextField(
                            value = selectedLevel,
                            onValueChange = viewModelFilters::onFilterClassAndLevelChange,
                            readOnly = true,
                            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expandedLevel.value) },
                            modifier = Modifier.menuAnchor(),
                            label = { Text(text = "Level")}
                        )
                        ExposedDropdownMenu(
                            expanded = expandedLevel.value,
                            onDismissRequest = { expandedLevel.value = false }) {
                            levelOptions.forEach { item->
                                DropdownMenuItem(
                                    text = { Text(text = item) },
                                    onClick = {
                                        onLevelSelected(item)
                                        expandedLevel.value = false
                                    }
                                )
                            }
                        }
                    }
                }
                val expandedBook = remember { mutableStateOf(false) }

                ExposedDropdownMenuBox(
                    expanded = expandedBook.value,
                    onExpandedChange = {newValue -> expandedBook.value = newValue}
                ) {
                    TextField(
                        value = selectedBook,
                        onValueChange = viewModelFilters::onFilterSourceBookChange,
                        readOnly = true,
                        trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expandedBook.value) },
                        modifier = Modifier.menuAnchor(),
                        label = { Text(text = "Source Book")}
                    )
                    ExposedDropdownMenu(
                        expanded = expandedBook.value,
                        onDismissRequest = { expandedBook.value = false }) {
                        bookOptions.forEach { item->
                            DropdownMenuItem(
                                text = { Text(text = item) },
                                onClick = {
                                    onBookSelected(item)
                                    expandedBook.value = false
                                }
                            )
                        }
                    }
                }
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
                SpellList(
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

//***********************************************************************************

// Each individual Spell card to display
@Composable
fun SpellList(
    characterState: CharacterState,
    customListState: CustomListState,
    onEventCharacter: (CharacterEvent) -> Unit,
    onEventCustomList: (CustomListEvent) -> Unit,
    item: SpellDataModel,
    modifier: Modifier = Modifier
){
    val expanded = remember { mutableStateOf(false) }
    val setCharacterViewModel: SetCharacterViewModel = viewModel()
    val setTempSpellLevelViewModel: SetTempSpellLevelViewModel = viewModel()
    val setCharacterLevelViewModel: SetCharacterLevelViewModel = viewModel()
    val characterClass: SetCharacterClassViewModel = viewModel()
    val context = LocalContext.current
    
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier
            .padding(vertical = 4.dp, horizontal = 8.dp)
            .fillMaxWidth()
    ) {
        Column(
            modifier = modifier
                    .clickable { expanded.value = !expanded.value },
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (expanded.value) {
                SpellFullDescription(item)
            } else {
                SpellPreview(
                    item
                )
            }
            // Validate spell is already in character's list
            val characterHasSpell = remember {
                mutableStateOf(false)
            }
            for (spell in customListState.customLists) {
                if (spell.characterFk == setCharacterViewModel.characterIdTemp.intValue && spell.spellTitle == item.spellTitle) {
                    characterHasSpell.value = true
                }
            }
            if (characterHasSpell.value) {
                Icon(modifier = Modifier
                    .background(MaterialTheme.colorScheme.secondary, shape = CircleShape)
                    .size(24.dp),
                    imageVector = Icons.Default.CheckCircle,
                    contentDescription = "Spell in list for character."
                )
            } else {
//                if (!characterHasSpell.value){
                IconButton(
                    onClick = {
                        addSpell(
                            item = item,
                            onEventCustomList = onEventCustomList,
                            setCharacterViewModel = setCharacterViewModel,
                            setTempSpellLevelViewModel = setTempSpellLevelViewModel,
                            setCharacterLevelViewModel = setCharacterLevelViewModel,
                            characterClass = characterClass,
                            context
                        )
                    },
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.secondary, shape = CircleShape)
                        .size(24.dp),
                ) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "Add Spell")
                }
            }
        }
    }
}

// To display when the Spell is collapsed
@Composable
fun SpellPreview(
    item: SpellDataModel
){
    Text(
        textAlign = TextAlign.Center,
        text = item.spellTitle
    )
    Text(
        textAlign = TextAlign.Center,
        text = item.spellPreviewDescription
    )
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = item.spellClassesWithLevelPreview.joinToString { it })

        Text(text = "${item.spellSourceBookPreview} ${item.spellSourcePage}")
    }
}

// To display when the Spell is expanded
@Composable
fun SpellFullDescription(item: SpellDataModel){
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {Text(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        textAlign = TextAlign.Center,
        text = item.spellTitle
        )
        Text("Source: ${ item.spellSourceBookFull }")
        Text("Classes: "+ item.spellClassWithLevel.joinToString { it })
        Text("School: ${item.spellSchool}")
        Text("Casting Time: ${item.spellCastingTime}")
        Text("Range: ${item.spellRange}")
        if(item.spellTargets != ""){
            Text("Targets: ${item.spellTargets}")
        }
        Text("Duration: ${item.spellDuration}")
        if(item.spellSavingThrow != "" && item.spellResistance != ""){
            Text("Saving Throw: ${item.spellSavingThrow}; Spell Resistance ${item.spellResistance}")
        }
        Text("Description: ${item.spellDescriptionFull}")

    }
}

fun doesCharacterHaveSpell(
    characterState: CharacterState,
    customListState: CustomListState,
    onEventCharacter: (CharacterEvent) -> Unit,
    onEventCustomList: (CustomListEvent) -> Unit,
    item: SpellDataModel,
    viewModel: SetCharacterViewModel,
    modifier: Modifier = Modifier
): Boolean{
    customListState.customLists.forEach(
        if (customListState.characterFk == viewModel.characterIdTemp.intValue && customListState.spellTitle == item.spellTitle){
            return (true)
        } else{
            return false
        }
    )
}

// Function to increase the size of spellsKnownCurrently
fun addSpellKnown(spellLevel:Int, spellsKnownCurrent: SpellsKnownCurrentViewModel){
    if (spellLevel == 0) {
        spellsKnownCurrent.zeroLevelSpellsKnownCurrent.intValue++
    } else if (spellLevel == 1) {
        spellsKnownCurrent.firstLevelSpellsKnownCurrent.intValue++
    } else if (spellLevel == 2) {
            spellsKnownCurrent.secondLevelSpellsKnownCurrent.intValue++
    } else if (spellLevel == 3) {
        spellsKnownCurrent.thirdLevelSpellsKnownCurrent.intValue++
    } else if (spellLevel == 4) {
        spellsKnownCurrent.fourthLevelSpellsKnownCurrent.intValue++
    } else if (spellLevel == 5) {
        spellsKnownCurrent.fifthLevelSpellsKnownCurrent.intValue++
    } else if (spellLevel == 6) {
        spellsKnownCurrent.sixthLevelSpellsKnownCurrent.intValue++
    }
}

// Function to decrease the size of spellsKnownCurrently
fun removeSpellKnown(spellLevel:Int, spellsKnownCurrent: SpellsKnownCurrentViewModel){
    if (spellLevel == 0) {
        spellsKnownCurrent.zeroLevelSpellsKnownCurrent.intValue--
    } else if (spellLevel == 1) {
        spellsKnownCurrent.firstLevelSpellsKnownCurrent.intValue--
    } else if (spellLevel == 2) {
        spellsKnownCurrent.secondLevelSpellsKnownCurrent.intValue--
    } else if (spellLevel == 3) {
        spellsKnownCurrent.thirdLevelSpellsKnownCurrent.intValue--
    } else if (spellLevel == 4) {
        spellsKnownCurrent.fourthLevelSpellsKnownCurrent.intValue--
    } else if (spellLevel == 5) {
        spellsKnownCurrent.fifthLevelSpellsKnownCurrent.intValue--
    } else if (spellLevel == 6) {
        spellsKnownCurrent.sixthLevelSpellsKnownCurrent.intValue--
    }
}