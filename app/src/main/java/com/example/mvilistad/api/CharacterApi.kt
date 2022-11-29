package com.example.mvilistad.api

import retrofit2.http.GET

//Los tipos de llamadas o peticiones a la API
interface CharacterApi {

    //Fin de la url de peticion del endpoint
    //final de ruta, fin del link
    //trerminacion del endpoint
    @GET("character")
    suspend fun getCharacters(): List<Character>

    //suspend para definir funiones
    //que son resueltas o implementadas
    //con procesos asíncronos, flujos,
    //channels o canales

    @GET("location")
    suspend fun getLocations(): List<String>
    //String es fake porque no hay modelo de
    //dato tipo Location
}