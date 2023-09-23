package com.example.actorsappcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.actorsappcompose.data.Character
import com.example.actorsappcompose.data.CharacterItem

@Composable
fun ActorsList(characterItem: List<CharacterItem>) {


    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.padding(8.dp)
    ){

        items(items=characterItem){
            item ->

            CardItem(characterItem=item)
        }
    }



}

@Composable
fun CardItem(characterItem: CharacterItem) {


    Column (){
        Text(text = characterItem.name)

    }

}
