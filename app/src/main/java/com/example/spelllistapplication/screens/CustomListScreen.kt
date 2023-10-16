package com.example.spelllistapplication.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.example.spelllistapplication.data.characterspelllist.CustomList
import com.example.spelllistapplication.data.characterspelllist.CustomListEvent
import com.example.spelllistapplication.data.characterspelllist.CustomListState
import com.example.spelllistapplication.data.viewmodels.SetCharacterAbilityScoreViewModel
import com.example.spelllistapplication.data.viewmodels.SetCharacterLevelViewModel
import com.example.spelllistapplication.data.viewmodels.SetCharacterViewModel
import com.example.spelllistapplication.data.viewmodels.spellsKnownMaximum
import com.example.spelllistapplication.data.viewmodels.spellsPerDay


@Composable
fun CustomListScreen(
    customListState: CustomListState,
    onEventCustomList: (CustomListEvent) -> Unit
){
    val setCharacterViewModel: SetCharacterViewModel = viewModel()
    val characterLevelViewModel: SetCharacterLevelViewModel = viewModel()
    val characterLevel = characterLevelViewModel.characterLevelViewModel.intValue

    val characterAbilityScoreViewModel: SetCharacterAbilityScoreViewModel = viewModel()
    val characterAbilityScore = characterAbilityScoreViewModel.characterAbilityScoreViewModel.intValue

    if (setCharacterViewModel.characterIdTemp.intValue == -1) {
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
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Total Spells Known: ${spellsKnownMaximum(0, characterLevel)}")
                }
            }
            customListState.customLists.forEach{
                CustomSpellCard(
                    onEventCustomList = onEventCustomList,
                    it = it,
                    viewModel = setCharacterViewModel,
                    levelOfSpell = 0
                )
            }
            Column(
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
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Maximum Spells Known: ${spellsKnownMaximum(1, characterLevel)}")
                    Text(text = "Spells Per Day ${spellsPerDay(1,characterLevel, characterAbilityScore)}")
                }
            }
            customListState.customLists.forEach{
                CustomSpellCard(
                    onEventCustomList = onEventCustomList,
                    it = it,
                    viewModel = setCharacterViewModel,
                    levelOfSpell = 1
                )
            }
            if (spellsKnownMaximum(2, characterLevel) > 0) {
                Column(
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
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "Total Spells Known: ${spellsKnownMaximum(2, characterLevel)}")
                        Text(text = "Spells Per Day ${spellsPerDay(2,characterLevel, characterAbilityScore)}")
                    }
                }
                customListState.customLists.forEach {
                    CustomSpellCard(
                        onEventCustomList = onEventCustomList,
                        it = it,
                        viewModel = setCharacterViewModel,
                        levelOfSpell = 2
                    )
                }
            }
            if (spellsKnownMaximum(3, characterLevel) > 0) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = MaterialTheme.colorScheme.primary)
                        .padding(4.dp)
                ) {
                    Text(
                        modifier = Modifier
                            .padding(4.dp),
                        text = "Level 3",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "Total Spells Known: ${spellsKnownMaximum(3, characterLevel)}")
                        Text(text = "Spells Per Day ${spellsPerDay(3,characterLevel, characterAbilityScore)}")
                    }
                }
                customListState.customLists.forEach {
                    CustomSpellCard(
                        onEventCustomList = onEventCustomList,
                        it = it,
                        viewModel = setCharacterViewModel,
                        levelOfSpell = 3
                    )
                }
            }
            if (spellsKnownMaximum(4, characterLevel) > 0) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = MaterialTheme.colorScheme.primary)
                        .padding(4.dp)
                ) {
                    Text(
                        modifier = Modifier
                            .padding(4.dp),
                        text = "Level 4",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "Total Spells Known: ${spellsKnownMaximum(4, characterLevel)}")
                        Text(text = "Spells Per Day ${spellsPerDay(4,characterLevel, characterAbilityScore)}")
                    }
                }
                customListState.customLists.forEach {
                    CustomSpellCard(
                        onEventCustomList = onEventCustomList,
                        it = it,
                        viewModel = setCharacterViewModel,
                        levelOfSpell = 4
                    )
                }
            }
            if (spellsKnownMaximum(5, characterLevel) > 0) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = MaterialTheme.colorScheme.primary)
                        .padding(4.dp)
                ) {
                    Text(
                        modifier = Modifier
                            .padding(4.dp),
                        text = "Level 5",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "Total Spells Known: ${spellsKnownMaximum(5, characterLevel)}")
                        Text(text = "Spells Per Day ${spellsPerDay(5,characterLevel, characterAbilityScore)}")
                    }
                }
                customListState.customLists.forEach {
                    CustomSpellCard(
                        onEventCustomList = onEventCustomList,
                        it = it,
                        viewModel = setCharacterViewModel,
                        levelOfSpell = 5
                    )
                }
            }
            if (spellsKnownMaximum(6, characterLevel) > 0) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = MaterialTheme.colorScheme.primary)
                        .padding(4.dp)
                ) {
                    Text(
                        modifier = Modifier
                            .padding(4.dp),
                        text = "Level 6",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "Total Spells Known: ${spellsKnownMaximum(6, characterLevel)}")
                        Text(text = "Spells Per Day ${spellsPerDay(6,characterLevel, characterAbilityScore)}")
                    }
                }
                customListState.customLists.forEach {
                    CustomSpellCard(
                        onEventCustomList = onEventCustomList,
                        it = it,
                        viewModel = setCharacterViewModel,
                        levelOfSpell = 6
                    )
                }
            }
        }
    }
}

@Composable
fun CustomSpellCard(
    onEventCustomList: (CustomListEvent) -> Unit,
    it: CustomList,
    viewModel: SetCharacterViewModel,
    levelOfSpell: Int
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
            if (it.characterFk == viewModel.characterIdTemp.intValue && it.spellLevel == levelOfSpell) {
                if (expanded.value) {
                    CLSpellFullDescription(it)
                } else {
                    CLSpellPreview(
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