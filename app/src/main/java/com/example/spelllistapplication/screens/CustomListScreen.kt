@file:OptIn(ExperimentalFoundationApi::class)

package com.example.spelllistapplication.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.spelllistapplication.components.spellcards.removeSpell
import com.example.spelllistapplication.data.viewmodels.SetCharacterViewModel
import com.example.spelllistapplication.data.characterdata.CharacterEvent
import com.example.spelllistapplication.data.characterdata.CharacterState
import com.example.spelllistapplication.data.characterspelllist.CustomList
import com.example.spelllistapplication.data.characterspelllist.CustomListEvent
import com.example.spelllistapplication.data.characterspelllist.CustomListState
import com.example.spelllistapplication.data.viewmodels.SpellsKnownCurrentViewModel
import kotlinx.coroutines.flow.MutableStateFlow


@Composable
fun CustomListScreen(
    characterState: CharacterState,
    customListState: CustomListState,
    onEventCharacter: (CharacterEvent) -> Unit,
    onEventCustomList: (CustomListEvent) -> Unit
){
    val viewModel: SetCharacterViewModel = viewModel()
    val spellsKnownCurrent: SpellsKnownCurrentViewModel = viewModel()

    if (viewModel.characterFkTemp.value == -1) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "No character selected.")
            Text(
                textAlign = TextAlign.Center,
                text = "Please return to the character tab to select a character")
        }
    } else{
        //use a box with verticalScroll later with a lazy column and items instead of forEach loops
        Column(modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.primary)
                    .padding(4.dp),
            ) {
                Text(
                    modifier = Modifier
                        .padding(4.dp),
                    text = "Level 0",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(text = "Spells Known: Total")
                }
            }
            customListState.customLists.forEach{
                CustomSpellCard(
                    characterState = characterState,
                    customListState = customListState,
                    onEventCharacter = onEventCharacter,
                    onEventCustomList = onEventCustomList,
                    it = it,
                    viewModel = viewModel,
                    levelOfSpell = 0,
                    spellsKnownCurrent
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.primary)
                    .padding(4.dp)
            ) {
                Text(
                    modifier = Modifier
                        .padding(4.dp),
                    text = "Level 1",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }
            customListState.customLists.forEach{
                CustomSpellCard(
                    characterState = characterState,
                    customListState = customListState,
                    onEventCharacter = onEventCharacter,
                    onEventCustomList = onEventCustomList,
                    it = it,
                    viewModel = viewModel,
                    levelOfSpell = 1,
                    spellsKnownCurrent
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.primary)
                    .padding(4.dp)
            ) {
                Text(
                    modifier = Modifier
                        .padding(4.dp),
                    text = "Level 2",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }
            customListState.customLists.forEach{
                CustomSpellCard(
                    characterState = characterState,
                    customListState = customListState,
                    onEventCharacter = onEventCharacter,
                    onEventCustomList = onEventCustomList,
                    it = it,
                    viewModel = viewModel,
                    levelOfSpell = 2,
                    spellsKnownCurrent
                )
            }
        }

//        Column(modifier = Modifier.fillMaxSize()) {
//            Row() {
//                Text(text = "Level 0")
//            }
//            LazyColumn(
//              modifier = Modifier,
//                verticalArrangement = Arrangement.spacedBy(16.dp)
//            ){
//                items(customListState.customLists){
//                    if ( it.characterFk == viewModel.characterFkTemp.intValue && it.spellLevel == 0){
//                        Surface(
//                            modifier = Modifier
//                                .background(color = MaterialTheme.colorScheme.primary)
//                                .padding(vertical = 4.dp, horizontal = 8.dp)
//                        ){
//                            Column(
//                                modifier = Modifier,
//                                horizontalAlignment = Alignment.CenterHorizontally
//                            ) {
//                                if (expanded.value) {
//                                    CLSpellFullDescription(it)
//                                } else {
//                                    CLSpellPreview(
//                                        characterState = characterState,
//                                        customListState = customListState,
//                                        onEventCharacter = onEventCharacter,
//                                        onEventCustomList = onEventCustomList,
//                                        it
//                                    )
//                                }
//                                IconButton(
//                                    onClick = { expanded.value = !expanded.value },
//                                    modifier = Modifier
//                                        .background(
//                                            MaterialTheme.colorScheme.secondary,
//                                            shape = CircleShape
//                                        )
//                                        .size(24.dp),
//                                ) {
//                                    val arrowPointingDirection =
//                                        if (expanded.value) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown
//                                    val arrowDescription =
//                                        if (expanded.value) "Show Less" else "Show More"
//                                    Icon(
//                                        imageVector = arrowPointingDirection,
//                                        contentDescription = arrowDescription
//                                    )
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//            Row() {
//                Text(text = "Level 1")
//            }
//
//        }

    }
}

@Composable
fun CustomSpellCard(
    characterState: CharacterState,
    customListState: CustomListState,
    onEventCharacter: (CharacterEvent) -> Unit,
    onEventCustomList: (CustomListEvent) -> Unit,
    it: CustomList,
    viewModel: SetCharacterViewModel,
    levelOfSpell: Int,
    spellsKnownCurrentViewModel: SpellsKnownCurrentViewModel
){
    val expanded = remember { mutableStateOf(false) }
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Column(
            modifier = Modifier
                .clickable { expanded.value = !expanded.value },
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (it.characterFk == viewModel.characterFkTemp.intValue && it.spellLevel == levelOfSpell) {
                if (expanded.value) {
                    CLSpellFullDescription(it)
                } else {
                    CLSpellPreview(
                        characterState = characterState,
                        customListState = customListState,
                        onEventCharacter = onEventCharacter,
                        onEventCustomList = onEventCustomList,
                        it
                    )
                }
                IconButton(
                    onClick = {
                        removeSpell(customList = it, onEvent = onEventCustomList)
//                        Toast.makeText(LocalContext.current, "Spell added.", Toast.LENGTH_SHORT).show()
                    },
                    modifier = Modifier
                        .background(
                            MaterialTheme.colorScheme.secondary,
                            shape = CircleShape
                        )
                        .size(24.dp),
                ) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = "Add to character list"
                    )
                }
            }
        }
    }

}

@Composable
fun CLSpellPreview(
    characterState: CharacterState,
    customListState: CustomListState,
    onEventCharacter: (CharacterEvent) -> Unit,
    onEventCustomList: (CustomListEvent) -> Unit,
    item: CustomList
){
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
        }
        Column(horizontalAlignment = Alignment.End){
            Text(text = "${item.spellSourceBookPreview} ${item.spellSourcePage}")
        }
    }
}

// To display when the Spell is expanded
@Composable
fun CLSpellFullDescription(item: CustomList){
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
//        Text("Classes: "+ item.spellClass.joinToString { "$it ${item.spellLevel}" })
        Text("School: ${item.spellSchool}")
        Text("Casting Time: ${item.spellCastingTime}")
        Text("Range: ${item.spellRange}")
        Text("Targets: ${item.spellTargets}")
        Text("Duration: ${item.spellDuration}")
        Text("Saving Throw: ${item.spellSavingThrow}; Spell Resistance ${item.spellResistance}")
        Text("Description: ${item.spellDescriptionFull}")


    }
}