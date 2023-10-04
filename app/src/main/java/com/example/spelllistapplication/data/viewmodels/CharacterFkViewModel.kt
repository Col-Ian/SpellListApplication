package com.example.spelllistapplication.data.viewmodels

import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel


// To confirm our currently selected character
class CharacterFkViewModel : ViewModel(){
    val characterFkTemp = mutableIntStateOf(-1)
}