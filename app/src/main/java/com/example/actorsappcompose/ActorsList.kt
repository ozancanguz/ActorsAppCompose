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
import com.bumptech.glide.Glide
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
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

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun CardItem(characterItem: CharacterItem) {


    Column (){

      GlideImage(model = characterItem.image, contentDescription ="Character Image" ,
          modifier = Modifier.padding(4.dp))
        Text(text = characterItem.name)

    }

}
