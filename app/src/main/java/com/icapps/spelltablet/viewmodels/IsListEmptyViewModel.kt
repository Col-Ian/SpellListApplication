package com.icapps.spelltablet.viewmodels

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class IsListEmptyViewModel: ViewModel() {
    val isListEmpty = mutableStateOf(true)
}