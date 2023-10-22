package com.example.spelllistapplication.components.charactercards

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.example.spelllistapplication.components.textcomponents.character.CharacterHeadingUnselected
import com.example.spelllistapplication.components.textcomponents.character.CharacterSubHeading
import com.example.spelllistapplication.data.characterdata.Character

@Composable
fun UnselectedCharacter(
    character: Character
){
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CharacterHeadingUnselected(text = character.characterName)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            CharacterSubHeading(text = character.characterClass)
            CharacterSubHeading(text = "Level: ${character.characterLevel}")
        }
    }
}