package com.example.spelllistapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import com.example.spelllistapplication.app.SpellTabletApp
import com.example.spelllistapplication.data.characterdata.CharacterDatabase
import com.example.spelllistapplication.data.characterdata.CharacterViewModel
import com.example.spelllistapplication.data.characterspelllist.CustomListDatabase
import com.example.spelllistapplication.data.characterspelllist.CustomListViewModel
import com.example.spelllistapplication.ui.theme.SpellListApplicationTheme

class MainActivity : ComponentActivity() {

    // Initialize the database instead of dependency injection
    private val dbCharacter by lazy {
        Room.databaseBuilder(
            applicationContext,
            CharacterDatabase::class.java,
            "characters.db"
        ).build()
    }
    private val dbCustomList by lazy {
        Room.databaseBuilder(
            applicationContext,
            CustomListDatabase::class.java,
            "customList.db"
        ).build()
    }
    private val viewModelCharacter by viewModels<CharacterViewModel>(
        factoryProducer = {
            object : ViewModelProvider.Factory{
                override fun<T : ViewModel> create(modelClass: Class<T>): T{
                    return CharacterViewModel(dbCharacter.dao) as T
                }
            }
        }
    )
    private val viewModelCustomList by viewModels<CustomListViewModel> (
        factoryProducer = {
            object : ViewModelProvider.Factory{
                override fun<T : ViewModel> create(modelClass: Class<T>): T{
                    return CustomListViewModel(dbCustomList.dao) as T
                }
            }
        }
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SpellListApplicationTheme {
                val characterState by viewModelCharacter.state.collectAsState()
                val customListState by viewModelCustomList.state.collectAsState()

                SpellTabletApp(
                    characterState = characterState,
                    customListState = customListState,
                    onEventCharacter = viewModelCharacter::onEvent,
                    onEventCustomList = viewModelCustomList::onEvent)
            }
        }
    }
}
