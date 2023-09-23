package com.example.actorsappcompose

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun DetailsScreen(navController: NavController) {


    Button(onClick = {

        navController.navigate(Screen.MainScreen.route)
    }) {



    }
    
}