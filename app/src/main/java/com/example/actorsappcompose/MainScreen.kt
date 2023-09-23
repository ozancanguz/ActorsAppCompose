package com.example.actorsappcompose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.actorsappcompose.viewmodels.CharacterViewModel

@Composable
fun MainScreen(navController: NavController) {

    // init view model
    val viewModel: CharacterViewModel = hiltViewModel()


    // collect state
    val characterList by viewModel.state.collectAsState()

    // call get characters
    viewModel.getCharacters()

    ActorsList(character = characterList)
    




    
}