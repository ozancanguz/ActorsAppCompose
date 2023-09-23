package com.example.actorsappcompose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {

    //navcontroller
    val navController= rememberNavController()

    // navhost
    NavHost(navController =navController , startDestination = Screen.MainScreen.route ){

        // main screen
        composable(route=Screen.MainScreen.route){

            MainScreen(navController = navController)

        }

        // detail screen
        composable(route=Screen.DetailScreen.route){

            DetailsScreen(navController = navController)


        }



    }

}