package com.example.spelllistapplication.components.customlistspellcards

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.spelllistapplication.components.spellinteractions.removeSpell
import com.example.spelllistapplication.data.characterspelllist.CustomList
import com.example.spelllistapplication.data.characterspelllist.CustomListEvent
import com.example.spelllistapplication.viewmodels.SetCharacterViewModel

@Composable
fun CustomSpellCard(
    onEventCustomList: (CustomListEvent) -> Unit,
    it: CustomList,
    viewModel: SetCharacterViewModel,
    levelOfSpell: Int
){
    if (it.characterFk == viewModel.characterIdTemp.intValue && it.spellLevel == levelOfSpell)
    {
        val expanded = remember { mutableStateOf(false) }
        val context = LocalContext.current
        Box(
            // to add padding between cards
            modifier = Modifier.padding(4.dp)
        ) {
            Box(
                modifier = Modifier
//                    .border(
//                        4.dp,
//                        MaterialTheme.colorScheme.primary
//                        , shape = RoundedCornerShape(8.dp)
//                    )
                    .fillMaxWidth()
                    .background(
                        MaterialTheme.colorScheme.primary,
                        shape = RoundedCornerShape(8.dp)
                    )

            ) {
                Column(
                    modifier = Modifier
                        .clickable { expanded.value = !expanded.value }
                        .fillMaxWidth()
                        .padding(4.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    if (expanded.value) {
                        CLSpellFullDescription(
                            item = it,
                            onEventCustomList = onEventCustomList,
                            context = context
                        )
                    } else {
                        CLSpellPreview(
                            item = it,
                            onEventCustomList = onEventCustomList,
                            context = context
                        )
                    }
                }
            }
        }
    }
}