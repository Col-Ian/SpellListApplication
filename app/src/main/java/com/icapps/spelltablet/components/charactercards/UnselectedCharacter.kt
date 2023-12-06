package com.icapps.spelltablet.components.charactercards

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.icapps.spelltablet.components.textcomponents.character.CharacterHeadingUnselected
import com.icapps.spelltablet.components.textcomponents.character.CharacterSubHeading
import com.icapps.spelltablet.data.characterdata.Character

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