package com.himanshusinha.firstapp.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun RowExample() {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Apple", fontSize = 20.sp)
        Text(text = "Banana", fontSize = 20.sp)
        Text(text = "Grapes", fontSize = 20.sp)
    }
}

@Composable
fun ColumnExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Login", fontSize = 20.sp)
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Enter your name") }
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Enter your email") }
        )
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BoxExample() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "Note 01", fontSize = 20.sp, modifier = Modifier.align(Alignment.TopEnd))
        Text(text = "Note 02", fontSize = 20.sp, modifier = Modifier.align(Alignment.Center))
        Text(text = "Note 03", fontSize = 20.sp, modifier = Modifier.align(Alignment.BottomStart))

    }
}
// Row - Arranges composables horizontally (side by side)
// Column - Arranges composables vertically (one below another)
// Box - Stacks composables on top of each other
// Modifiers - Modifiers allows to change the appearance layout or behavior of a composable