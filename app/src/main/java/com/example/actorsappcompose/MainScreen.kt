package com.example.actorsappcompose

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController) {
    
    
    Text(text = "This is the main screen")

    Button(onClick = {

          // navigate to detail
        navController.navigate(Screen.DetailScreen.route)





    }) {



    }
}