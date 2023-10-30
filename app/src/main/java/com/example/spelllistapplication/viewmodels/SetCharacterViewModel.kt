package com.example.spelllistapplication.viewmodels

import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel


// To confirm our currently selected character
class SetCharacterViewModel : ViewModel(){
    val characterIdTemp = mutableIntStateOf(-1)
    var characterClass = mutableStateOf("")
    val characterLevel = mutableIntStateOf(0)
    val characterAbilityScore = mutableIntStateOf(0)
}

// Used to validate a character's class for adding a spell.
// -2 will mean no character selected. It will be -1 by default when character is selected
class SetTempSpellLevelViewModel: ViewModel(){
    val tempSpellLevel = mutableIntStateOf(-2)
}


// Used to calculate the total spells per day a character gets based on the spells level, and their level and ability score
fun spellsPerDay(spellLevel: Int, characterLevel: Int, abilityScore: Int): Int {
    val totalSpellsPerDay = (
            if (spellLevel == 1){
                firstLevelSpellsPerDay(characterLevel, abilityScore)
            } else if (spellLevel == 2){
                secondLevelSpellsPerDay(characterLevel, abilityScore)
            } else if (spellLevel == 3){
                thirdLevelSpellsPerDay(characterLevel, abilityScore)
            } else if (spellLevel == 4){
                fourthLevelSpellsPerDay(characterLevel, abilityScore)
            } else if (spellLevel == 5){
                fifthLevelSpellsPerDay(characterLevel, abilityScore)
            } else{
                sixthLevelSpellsPerDay(characterLevel, abilityScore)
    })

    return totalSpellsPerDay
}

// Used to calculate the total number of spells known based on a character's level
fun spellsKnownMaximum(spellLevel: Int, characterLevel: Int): Int{
    val totalSpellsKnown = (
            if (spellLevel == 0){
                zeroLevelSpellsKnown(characterLevel)
            } else if (spellLevel == 1){
                firstLevelSpellsKnown(characterLevel)
            } else if (spellLevel == 2){
                secondLevelSpellsKnown(characterLevel)
            } else if (spellLevel == 3){
                thirdLevelSpellsKnown(characterLevel)
            } else if (spellLevel == 4){
                fourthLevelSpellsKnown(characterLevel)
            } else if (spellLevel == 5){
                fifthLevelSpellsKnown(characterLevel)
            } else if(spellLevel == 9){
                0 // Un-learnable spells will have a spell level of 9
            } else {
                sixthLevelSpellsKnown(characterLevel)
            })
    return totalSpellsKnown
}

// Set defaults for spells currently known, to be added into the CustomListScreen
class SpellsKnownCurrentViewModel : ViewModel(){
    val zeroLevelSpellsKnownCurrent = mutableIntStateOf(0)
    val firstLevelSpellsKnownCurrent = mutableIntStateOf(0)
    val secondLevelSpellsKnownCurrent = mutableIntStateOf(0)
    val thirdLevelSpellsKnownCurrent = mutableIntStateOf(0)
    val fourthLevelSpellsKnownCurrent = mutableIntStateOf(0)
    val fifthLevelSpellsKnownCurrent = mutableIntStateOf(0)
    val sixthLevelSpellsKnownCurrent = mutableIntStateOf(0)
}
/*
Baseline Spells per day

1st level spells tracking ->    2 at level 1-2
                                3 at level 3-4
                                4 at level 5-8
                                5 at level 9+
*/

fun firstLevelSpellsPerDay(characterLevel: Int, abilityScore: Int): Int {
    val numberOfSpellsPerDay = if (characterLevel <= 2) {
        2
    } else if (characterLevel <= 4) {
        3
    } else if (characterLevel <= 8) {
        4
    } else {
        5
    }
    return (numberOfSpellsPerDay + firstLevelBonusSpellsPerDay(abilityScore))
}

/*

2nd level spells tracking ->    2 at level 4-5
                                3 at level 6-7
                                4 at level 8-11
                                5 at level 12+
*/

fun secondLevelSpellsPerDay(characterLevel: Int, abilityScore: Int): Int {
    val numberOfSpellsPerDay = if (characterLevel <= 3){
        0
    } else if (characterLevel <= 5){
        2
    } else if (characterLevel <= 7){
        3
    } else if(characterLevel <= 11){
        4
    } else {
        5
    }
    return numberOfSpellsPerDay + secondLevelBonusSpellsPerDay(abilityScore)
}

/*
3rd level spells tracking ->    2 at level 7-8
                                3 at level 9-10
                                4 at level 11-14
                                5 at level 15+
*/

fun thirdLevelSpellsPerDay(characterLevel: Int, abilityScore: Int): Int {
    val numberOfSpellsPerDay = if (characterLevel <= 6){
        0
    } else if (characterLevel <= 8){
        2
    } else if (characterLevel <= 10){
        3
    } else if(characterLevel <= 14){
        4
    } else {
        5
    }
    return numberOfSpellsPerDay + thirdLevelBonusSpellsPerDay(abilityScore)
}

/*
4th level spells tracking ->    2 at level 10-11
                                3 at level 12-13
                                4 at level 14-17
                                5 at level 18+
*/

fun fourthLevelSpellsPerDay(characterLevel: Int, abilityScore: Int): Int {
    val numberOfSpellsPerDay = if (characterLevel <= 10){
        0
    } else if (characterLevel <= 11){
        2
    } else if (characterLevel <= 13){
        3
    } else if(characterLevel <= 17){
        4
    } else {
        5
    }
    return numberOfSpellsPerDay + fourthLevelBonusSpellsPerDay(abilityScore)
}

/*
5th level spells tracking ->    2 at level 13-14
                                3 at level 15-16
                                4 at level 17-18
                                5 at level 19+
*/

fun fifthLevelSpellsPerDay(characterLevel: Int, abilityScore: Int): Int {
    val numberOfSpellsPerDay = if (characterLevel <= 12){
        0
    } else if (characterLevel <= 14){
        2
    } else if (characterLevel <= 16){
        3
    } else if(characterLevel <= 18){
        4
    } else {
        5
    }
    return numberOfSpellsPerDay + fifthLevelBonusSpellsPerDay(abilityScore)
}

/*
6th level spells tracking ->    2 at level 16-17
                                3 at level 18
                                4 at level 19
                                5 at level 20
*/

fun sixthLevelSpellsPerDay(characterLevel: Int, abilityScore: Int): Int {
    val numberOfSpellsPerDay = if (characterLevel <= 15){
        0
    } else if (characterLevel <= 17){
        2
    } else if (characterLevel == 18){
        3
    } else if(characterLevel == 19){
        4
    } else {
        5
    }
    return numberOfSpellsPerDay + sixthLevelBonusSpellsPerDay(abilityScore)
}

/*
***************************************************************************************

Bonus Spells Per Day

Default 0 below at score below minimum for 1

1st level bonus tracking ->     1 at score 12-19
                                2 at score 20-27
                                3 at score 28+
*/

fun firstLevelBonusSpellsPerDay(abilityScore: Int): Int {
    return (
            if (abilityScore <= 11){
                0
            } else if ( abilityScore <= 19){
                1
            } else if (abilityScore <= 27){
                2
            } else{
                3
            })
}

/*

2nd level bonus tracking ->     1 at score 14-21
                                2 at score 22-29
                                3 at score 30+
*/

fun secondLevelBonusSpellsPerDay(abilityScore: Int): Int {
    return (
            if (abilityScore <= 13){
                0
            } else if ( abilityScore <= 21){
                1
            } else if (abilityScore <= 29){
                2
            } else{
                3
            })
}

/*

3rd level bonus tracking ->     1 at score 16-23
                                2 at score 24+
*/

fun thirdLevelBonusSpellsPerDay(abilityScore: Int): Int {
    return (
            if (abilityScore <= 15){
                0
            } else if ( abilityScore <= 23){
                1
            } else {
                2
            })
}

/*

4th level bonus tracking ->     1 at score 18-25
                                2 at score 26+
*/

fun fourthLevelBonusSpellsPerDay(abilityScore: Int): Int {
    return (
            if (abilityScore <= 17){
                0
            } else if ( abilityScore <= 25){
                1
            } else {
                2
            })
}

/*
5th level bonus tracking ->     1 at score 20-27
                                2 at score 28+
*/

fun fifthLevelBonusSpellsPerDay(abilityScore: Int): Int {
    return (
            if (abilityScore <= 19){
                0
            } else if ( abilityScore <= 27){
                1
            } else {
                2
            })
}

/*
6th level bonus tracking ->     1 at score 22-29
                                2 at score 30+
*/

fun sixthLevelBonusSpellsPerDay(abilityScore: Int): Int {
    return (
            if (abilityScore <= 21){
                0
            } else if ( abilityScore <= 29){
                1
            } else {
                2
            })
}

/*
***************************************************************************************

Spells Known

0 level known tracking ->       4 at level 1
                                5 at level 2
                                6 at level 3+
*/

fun zeroLevelSpellsKnown(characterLevel: Int): Int{
    return(
            if (characterLevel <= 1){
             4
            } else if (characterLevel == 2){
                5
            } else{
                6
            })
}

/*
1st level known tracking ->     2 at level 1
                                3 at level 2
                                4 at level 3-6
                                5 at level 7-10
                                6 at level 11+
*/

fun firstLevelSpellsKnown(characterLevel: Int): Int{
    return(
            if (characterLevel <= 1){
                2
            } else if (characterLevel == 2){
                3
            } else if (characterLevel <= 6){
                4
            } else if (characterLevel <= 10){
                5
            } else{
                6
            })
}

/*
2nd level known tracking ->     2 at level 4
                                3 at level 5
                                4 at level 6-9
                                5 at level 10-13
                                6 at level 14+
*/

fun secondLevelSpellsKnown(characterLevel: Int): Int{
    return(
            if (characterLevel <= 3){
                0
            } else if(characterLevel == 4){
                2
            } else if (characterLevel == 5){
                3
            } else if (characterLevel <= 9){
                4
            } else if (characterLevel <= 13){
                5
            } else{
                6
            })
}

/*
3rd level known tracking ->     2 at level 7
                                3 at level 8
                                4 at level 9-12
                                5 at level 13-16
                                6 at level 17+
*/

fun thirdLevelSpellsKnown(characterLevel: Int): Int{
    return(
            if (characterLevel <= 6){
                0
            } else if(characterLevel == 7){
                2
            } else if (characterLevel == 8){
                3
            } else if (characterLevel <= 12){
                4
            } else if (characterLevel <= 16){
                5
            } else{
                6
            })
}

/*
4th level known tracking ->     2 at level 10
                                3 at level 11
                                4 at level 12-15
                                5 at level 16-19
                                6 at level 20+
*/

fun fourthLevelSpellsKnown(characterLevel: Int): Int{
    return(
            if (characterLevel <= 9){
                0
            } else if(characterLevel == 10){
                2
            } else if (characterLevel == 11){
                3
            } else if (characterLevel <= 15){
                4
            } else if (characterLevel <= 19){
                5
            } else{
                6
            })
}

/*
5th level known tracking ->     2 at level 13
                                3 at level 14
                                4 at level 15-18
                                5 at level 19+
*/

fun fifthLevelSpellsKnown(characterLevel: Int): Int{
    return(
            if (characterLevel <= 12){
                0
            } else if(characterLevel == 13){
                2
            } else if (characterLevel == 14){
                3
            } else if (characterLevel <= 18){
                4
            } else {
                5
            })
}

/*
6th level known tracking ->     2 at level 16
                                3 at level 17
                                4 at level 18-19
                                5 at level 20+
 */

fun sixthLevelSpellsKnown(characterLevel: Int): Int{
    return(
            if (characterLevel <= 15){
                0
            } else if(characterLevel == 16){
                2
            } else if (characterLevel == 17){
                3
            } else if (characterLevel <= 19){
                4
            } else {
                5
            })
}