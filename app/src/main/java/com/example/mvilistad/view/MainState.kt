package com.example.mvilistad.view

sealed class MainState {
    object Idle: MainState()
    object Loading: MainState()
    data class Characters(val characters: List<Character>): MainState()
}