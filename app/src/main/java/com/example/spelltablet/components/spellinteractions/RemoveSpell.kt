package com.example.spelltablet.components.spellinteractions

import com.example.spelltablet.data.characterspelllist.CustomList
import com.example.spelltablet.data.characterspelllist.CustomListEvent

fun removeSpell(
    customList: CustomList,
    onEvent: (CustomListEvent) -> Unit
){
    onEvent(CustomListEvent.DeleteSpell(customList))
}