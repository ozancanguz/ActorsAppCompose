package com.example.actorsappcompose.api

import com.example.actorsappcompose.data.Character
import com.example.actorsappcompose.data.CharacterItem
import retrofit2.Response
import retrofit2.http.GET

interface CharacterApiService {


    @GET("characters")
    suspend fun getCharacters():Response<Character>



}