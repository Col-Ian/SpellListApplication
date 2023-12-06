package com.icapps.spelltablet.viewmodels

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class SearchBarValueViewModel : ViewModel(){
    val searchBarValue = mutableStateOf("")
}