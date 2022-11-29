package com.example.mvilistad.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//vamos a crear el "cliente" que sera
//el objeto configurado de Retrofit
//para establecer la comunicación y tratamiento
//con su respectiva API
object CharacterService {
    const val BASE_URL = "https://rickandmortyapi.com/api/"

    private fun getRetrofit() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(
            GsonConverterFactory.create())
        .build()
}








