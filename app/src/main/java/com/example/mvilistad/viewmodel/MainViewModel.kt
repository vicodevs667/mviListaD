package com.example.mvilistad.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvilistad.api.CharacterRepo
import com.example.mvilistad.view.MainIntent
import com.example.mvilistad.view.MainState
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.consumeAsFlow
import kotlinx.coroutines.launch

// Extender o heredar de la clase ViewModel
//sino será solo una clase mas
class MainViewModel(
    val repo: CharacterRepo
): ViewModel() {
    //Trabajar sobre las abstracciones de
    //Intents o interacciones del usuario
    // y los posibles cambios de estado
    val userIntent = Channel<MainIntent>(Channel.UNLIMITED)
    //inicialmente empiezas en el estado de reposo
    private val _state = MutableStateFlow<MainState>(MainState.Idle)
    val state: StateFlow<MainState>
        get() = _state

    init {
        handleIntent()
    }

    private fun handleIntent() {
        viewModelScope.launch {
            userIntent.consumeAsFlow().collect{
                when(it) {
                    is MainIntent.FetchCharacters -> fetchCharacter()
                    //else -> fetchCharacter()
                }
            }
        }
    }

    private fun fetchCharacter() {
        TODO("Not yet implemented")
    }
}







