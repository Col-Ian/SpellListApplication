package com.example.spelllistapplication.data.characterspelllist


sealed interface CustomListEvent {

    object SaveSpellToCharacter: CustomListEvent

    data class SetCharacterFk(val characterFk:Int): CustomListEvent
    data class SetSpellLevel(val spellLevel:Int): CustomListEvent
    data class SetSpellTitle(val spellTitle:String):CustomListEvent
    data class SetSpellPreviewDescription(val spellPreviewDescription:String):CustomListEvent
    data class SetSpellSourceBookPreview(val spellSourceBookPreview:String):CustomListEvent
    data class SetSpellSourcePage(val spellSourcePage:String):CustomListEvent
    data class SetSpellSourceBookFull(val spellSourceBookFull:String):CustomListEvent
    data class SetSpellSchool(val spellSchool:String):CustomListEvent
    data class SetSpellCastingTime(val spellCastingTime:String):CustomListEvent
    data class SetSpellRange(val spellRange:String):CustomListEvent
    data class SetSpellTargets(val spellTargets:String):CustomListEvent
    data class SetSpellDuration(val spellDuration:String):CustomListEvent
    data class SetSpellSavingThrow(val spellSavingThrow:String):CustomListEvent
    data class SetSpellResistance(val spellResistance:String):CustomListEvent
    data class SetSpellDescriptionFull(val spellDescriptionFull:String):CustomListEvent

    data class DeleteSpell(val customList: CustomList): CustomListEvent
}