package com.icapps.spelltablet.components.spellinteractions

import com.icapps.spelltablet.data.characterspelllist.CustomList
import com.icapps.spelltablet.data.characterspelllist.CustomListEvent

fun removeSpell(
    customList: CustomList,
    onEvent: (CustomListEvent) -> Unit
){
    onEvent(CustomListEvent.DeleteSpell(customList))
}