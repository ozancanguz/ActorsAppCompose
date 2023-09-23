package com.example.actorsappcompose.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.actorsappcompose.data.Character
import com.example.actorsappcompose.data.CharacterItem
import com.example.actorsappcompose.repo.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharacterViewModel @Inject constructor(val repository: Repository): ViewModel(){

    private val _state= MutableStateFlow(Character())
    val state:StateFlow<List<CharacterItem>>
         get()=_state


    fun getCharacters(){
        viewModelScope.launch {

            val response=repository.remote.getCharacters()
            _state.value= response.body()!!
        }
    }







}