package com.example.mvilistad.view

//Posibles estados de tu sistema
//Abstracciones
sealed class MainState {
    object Idle: MainState()
    object Loading: MainState()
    data class Characters(val characters: List<Character>): MainState()
}








