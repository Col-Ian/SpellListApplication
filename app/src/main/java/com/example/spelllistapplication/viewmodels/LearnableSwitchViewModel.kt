package com.example.spelllistapplication.viewmodels

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LearnableSwitchViewModel : ViewModel(){
    val learnableSwitch = mutableStateOf(false)
}