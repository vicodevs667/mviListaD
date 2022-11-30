package com.example.mvilistad.view
//abstraccion de las posibles interacciones
//del usuario
sealed class MainIntent {
    //Interaccion de obtener personajes
    object FetchCharacters: MainIntent()
}