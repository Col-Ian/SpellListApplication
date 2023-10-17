package com.example.spelllistapplication.components.spellcards

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Card
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.spelllistapplication.data.allspellslist.SpellDataModel
import com.example.spelllistapplication.data.characterdata.CharacterEvent
import com.example.spelllistapplication.data.characterdata.CharacterState
import com.example.spelllistapplication.data.characterspelllist.CustomListEvent
import com.example.spelllistapplication.data.characterspelllist.CustomListState
import com.example.spelllistapplication.data.viewmodels.SetCharacterClassViewModel
import com.example.spelllistapplication.data.viewmodels.SetCharacterLevelViewModel
import com.example.spelllistapplication.data.viewmodels.SetCharacterViewModel
import com.example.spelllistapplication.data.viewmodels.SetTempSpellLevelViewModel

// Each individual Spell card to display
@Composable
fun SpellCard(
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

    Box(
        // to add padding between cards
        modifier = Modifier.padding(4.dp)
    ) {
        Box(
            modifier = Modifier
                .border(4.dp, MaterialTheme.colorScheme.primary, shape = RoundedCornerShape(8.dp))
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.background, shape = RoundedCornerShape(8.dp))

        ) {
            Column(
                modifier = Modifier
                    .clickable { expanded.value = !expanded.value }
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 4.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
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
                if (!characterHasSpell.value){
                    
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
                    Spacer(modifier = Modifier.padding(1.dp))
                }
            }
        }
    }
}