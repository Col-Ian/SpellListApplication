package com.example.spelllistapplication.components.spellinteractions

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.spelllistapplication.components.spellinteractions.removeSpell
import com.example.spelllistapplication.data.characterspelllist.CustomList
import com.example.spelllistapplication.data.characterspelllist.CustomListEvent

@Composable
fun DeleteSpellButton(
    item: CustomList,
    onEventCustomList: (CustomListEvent) -> Unit,
    context: Context
){
    IconButton(
        onClick = {
            removeSpell(customList = item, onEvent = onEventCustomList)
            Toast.makeText(context, "Spell removed.", Toast.LENGTH_SHORT).show()
        },
        modifier = Modifier
            .background(
                MaterialTheme.colorScheme.primary,
                shape = CircleShape
            )
            .size(24.dp)
            .padding(2.dp),
    ) {
        Icon(
            imageVector = Icons.Default.Delete,
            contentDescription = "Add to character list",
            tint = MaterialTheme.colorScheme.background
        )
    }
}