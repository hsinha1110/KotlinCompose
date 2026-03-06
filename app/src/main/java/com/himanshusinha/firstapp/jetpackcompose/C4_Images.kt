package com.himanshusinha.firstapp.jetpackcompose

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.himanshusinha.firstapp.R
import androidx.compose.ui.graphics.Color
@Composable
fun ImageExample() {
    Image(
        painter = painterResource(R.drawable.green_grass),
        contentDescription = "Image of Green Grass",
        modifier = Modifier
            .padding(16.dp)
            .clip(shape = RoundedCornerShape(20.dp)),
        contentScale = ContentScale.FillBounds
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun IconExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "Person Icon",
            modifier = Modifier.size(size = 100.dp), tint = Color.Red
        )
    }
}