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
import com.example.spelllistapplication.ui.theme.SpellListApplicationTheme

class MainActivity : ComponentActivity() {

    // Initialize the database instead of dependency injection
    private val db by lazy {
        Room.databaseBuilder(
            applicationContext,
            CharacterDatabase::class.java,
            "characters.db"
        ).build()
    }
    private val viewModel by viewModels<CharacterViewModel>(
        factoryProducer = {
            object : ViewModelProvider.Factory{
                override fun<T : ViewModel> create(modelClass: Class<T>): T{
                    return CharacterViewModel(db.dao) as T
                }
            }
        }
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SpellListApplicationTheme {
                val state by viewModel.state.collectAsState()
                SpellTabletApp(state = state, onEvent = viewModel::onEvent)
            }
        }
    }
}
