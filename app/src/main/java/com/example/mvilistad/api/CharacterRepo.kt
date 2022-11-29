package com.example.mvilistad.api

class CharacterRepo(
    private val api: CharacterApi) {
    //Metodo que hablará con ViewModel
    //para entregarle datos que sean solicitados
    suspend fun getCharacters() = api.getCharacters()
}








