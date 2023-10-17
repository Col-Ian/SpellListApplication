package com.example.spelllistapplication.components.spellinteractions

import com.example.spelllistapplication.data.characterspelllist.CustomList
import com.example.spelllistapplication.data.characterspelllist.CustomListEvent

fun removeSpell(
    customList: CustomList,
    onEvent: (CustomListEvent) -> Unit
){
    onEvent(CustomListEvent.DeleteSpell(customList))
}