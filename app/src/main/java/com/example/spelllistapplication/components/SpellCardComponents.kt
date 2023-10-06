package com.example.spelllistapplication.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.ExperimentalMaterial3Api
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
import com.example.spelllistapplication.data.viewmodels.SearchBarViewModel
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
    val viewModelSearch = viewModel<SearchBarViewModel>()
    val searchText by viewModelSearch.searchText.collectAsState()
    val spellData by viewModelSearch.spellData.collectAsState()
    // Needed to add a buffer timer if we search an outside resource
//    val isSearching by viewModelSearch.isSearching.collectAsState()
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        TextField(
            value = searchText,
            onValueChange = viewModelSearch::onSearchTextChange,
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text(text = "Search")}
        )
        Spacer(modifier = Modifier.height(8.dp))
        LazyColumn(
            modifier = modifier
        ){
            items(spellData){ item ->
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

    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier
            .padding(vertical = 4.dp, horizontal = 8.dp)
            .fillMaxWidth()
    ) {
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (expanded.value) {
                SpellFullDescription(item)
            } else {
                SpellPreview(
                    characterState = characterState,
                    customListState = customListState,
                    onEventCharacter = onEventCharacter,
                    onEventCustomList = onEventCustomList,
                    item
                )
            }
            IconButton(onClick = { expanded.value = !expanded.value},
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.secondary, shape = CircleShape)
                    .size(24.dp),
            ) {
                val arrowPointingDirection = if(expanded.value) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown
                val arrowDescription = if ( expanded.value) "Show Less" else "Show More"
                Icon(imageVector = arrowPointingDirection, contentDescription = arrowDescription)
            }
        }
    }
}

// To display when the Spell is collapsed
@Composable
fun SpellPreview(
    characterState: CharacterState,
    customListState: CustomListState,
    onEventCharacter: (CharacterEvent) -> Unit,
    onEventCustomList: (CustomListEvent) -> Unit,
    item: SpellDataModel
){
    val viewModel: SetCharacterViewModel = viewModel()
    val spellsKnownCurrent : SpellsKnownCurrentViewModel = viewModel()
    Text(
        textAlign = TextAlign.Center,
        text = item.spellTitle
    )
    Text(text = item.spellPreviewDescription)
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(text = "Level ${item.spellLevel}")
            IconButton(
                onClick = {

                    if(viewModel.characterFkTemp.value < -1){
//                        Toast.makeText(LocalContext.current, "Please select a character first.", Toast.LENGTH_LONG).show()
                    } else{
                        addSpell(characterFk = viewModel.characterFkTemp.value, item = item, state = customListState, onEventCustomList = onEventCustomList, viewModel = viewModel)
                        addSpellKnown(spellLevel = item.spellLevel, spellsKnownCurrent = spellsKnownCurrent)
//                        Toast.makeText(LocalContext.current, "Spell added.", Toast.LENGTH_SHORT).show()
                    }
                          },
                modifier = Modifier
                    .background(
                        MaterialTheme.colorScheme.secondary,
                        shape = CircleShape
                    )
                    .size(24.dp),
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add to character list"
                )
            }
        }
        Column(horizontalAlignment = Alignment.End){
            Text(text = item.spellClassPreview.joinToString { it })
            Text(text = "${item.spellSourceBookPreview} ${item.spellSourcePage}")
        }
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
        Text("Classes: "+ item.spellClass.joinToString { "$it ${item.spellLevel}" })
        Text("School: ${item.spellSchool}")
        Text("Casting Time: ${item.spellCastingTime}")
        Text("Range: ${item.spellRange}")
        Text("Targets: ${item.spellTargets}")
        Text("Duration: ${item.spellDuration}")
        Text("Saving Throw: ${item.spellSavingThrow}; Spell Resistance ${item.spellResistance}")
        Text("Description: ${item.spellDescriptionFull}")
        Box(contentAlignment = Alignment.BottomStart)
        {
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .background(
                        MaterialTheme.colorScheme.secondary,
                        shape = CircleShape
                    )
                    .size(24.dp),
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add to character list"
                )
            }
        }

    }
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