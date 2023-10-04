package com.example.spelllistapplication.components.spellcards

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.example.spelllistapplication.data.characterspelllist.CustomList
import com.example.spelllistapplication.data.characterspelllist.CustomListEvent

fun removeSpell(
    customList: CustomList,
    onEvent: (CustomListEvent) -> Unit
){
    onEvent(CustomListEvent.DeleteSpell(customList))
//    Toast.makeText(LocalContext.current, "Spell removed.", Toast.LENGTH_SHORT).show()
}