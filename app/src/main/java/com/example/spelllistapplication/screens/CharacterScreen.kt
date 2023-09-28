package com.example.spelllistapplication.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.spelllistapplication.data.characterdata.AddCharacterDialog
import com.example.spelllistapplication.data.characterdata.CharacterEvent
import com.example.spelllistapplication.data.characterdata.CharacterState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CharacterScreen(
    state: CharacterState,
    onEvent: (CharacterEvent) -> Unit
){
    Scaffold(
        floatingActionButton = {
                               FloatingActionButton(onClick = {
                                   onEvent(CharacterEvent.ShowDialog)
                               }) {
                                   Icon(
                                       imageVector = Icons.Default.Add,
                                       contentDescription = "Add Character"
                                   )
                               }
        },
        modifier = Modifier
            .fillMaxSize()
    ) {padding->
        if (state.isAddingCharacter){
            AddCharacterDialog(state = state, onEvent = onEvent)
        }
        LazyColumn(
            contentPadding = padding,
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ){
            items(state.characters){character ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Column(
                        modifier = Modifier
                            .weight(1f)
                    ) {
                        Text(
                            text = character.characterName 
                        )
                        Row(horizontalArrangement = Arrangement.SpaceBetween) {
                            Text(text = character.characterClass)   
                            Text(text = "Level: ${character.characterLevel}")
                        }
                        IconButton(onClick = {
                            onEvent(CharacterEvent.DeleteCharacter(character))
                        }) {
                            Icon(imageVector = Icons.Default.Delete,
                                contentDescription = "Delete contact"
                            )
                        }
                    }
                }
            }
        }
    }
}