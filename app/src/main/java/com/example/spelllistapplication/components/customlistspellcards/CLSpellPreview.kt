package com.example.spelllistapplication.components.customlistspellcards

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
import com.example.spelllistapplication.components.spellinteractions.DeleteSpellButton
import com.example.spelllistapplication.components.textcomponents.spellcard.SpellCardDescriptionPreview
import com.example.spelllistapplication.components.textcomponents.spellcard.SpellCardFootNotes
import com.example.spelllistapplication.components.textcomponents.spellcard.SpellCardHeading
import com.example.spelllistapplication.data.characterspelllist.CustomList
import com.example.spelllistapplication.data.characterspelllist.CustomListEvent

// To display when spell is collapsed
@Composable
fun CLSpellPreview(
    item: CustomList,
    onEventCustomList: (CustomListEvent) -> Unit,
    context: Context
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
            SpellCardFootNotes(text = "Level ${item.spellLevel}")

            SpellCardFootNotes(text = "${item.spellSourceBookPreview} pg. ${item.spellSourcePage}")

        }
        Box(
            modifier = Modifier
                .padding(2.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            DeleteSpellButton(
                item = item,
                onEventCustomList = onEventCustomList,
                context = context
            )
        }
    }

}