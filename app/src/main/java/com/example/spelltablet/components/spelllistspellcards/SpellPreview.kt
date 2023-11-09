package com.example.spelltablet.components.spelllistspellcards

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.spelltablet.components.spellinteractions.AddSpellButton
import com.example.spelltablet.components.textcomponents.spellcard.SpellCardDescriptionPreview
import com.example.spelltablet.components.textcomponents.spellcard.SpellCardFootNotes
import com.example.spelltablet.components.textcomponents.spellcard.SpellCardHeading
import com.example.spelltablet.data.allspellslist.SpellDataModel
import com.example.spelltablet.data.characterspelllist.CustomListEvent

// To display when the Spell is collapsed
@Composable
fun SpellPreview(
    item: SpellDataModel,
    onEventCustomList: (CustomListEvent)-> Unit,
    context: Context,
    characterCanLearnSpell: Boolean
){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                MaterialTheme.colorScheme.background,
                shape = RoundedCornerShape(8.dp)
            )
    ) {
        SpellCardHeading(text = item.spellTitle)
        SpellCardDescriptionPreview(text = item.spellPreviewDescription)
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            SpellCardFootNotes(text = item.spellClassesWithLevelPreview.joinToString { it })

            SpellCardFootNotes(text = "${item.spellSourceBookPreview} pg. ${item.spellSourcePage}")
        }
        Box(
            modifier = Modifier
                .padding(2.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            AddSpellButton(
                item = item,
                onEventCustomList = onEventCustomList,
                context = context,
                characterCanLearnSpell = characterCanLearnSpell
            )
        }
    }

}