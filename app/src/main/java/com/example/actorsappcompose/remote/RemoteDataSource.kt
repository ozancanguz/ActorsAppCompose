package com.example.actorsappcompose.remote

import com.example.actorsappcompose.api.CharacterApiService
import com.example.actorsappcompose.data.Character
import com.example.actorsappcompose.data.CharacterItem
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource@Inject constructor(private val characterApiService: CharacterApiService) {



    suspend fun getCharacters():Response<Character>  {

        return  characterApiService.getCharacters()
    }


}