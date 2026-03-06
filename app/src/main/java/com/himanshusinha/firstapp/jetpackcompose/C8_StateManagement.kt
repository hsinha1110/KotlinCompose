package com.himanshusinha.firstapp.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
@Composable

fun StateManagement() {
/*
remember keeps the value during recomposition

rememberSaveable keeps the value during configuration changes (like screen rotation)

Recomposition: if the state changes, Compose updates only the affected UI and not the entire screen

State Hoisting: moving state to a higher-level composable so it can be passed as a parameter to child composables, letting them display the state and send events
*/
    var score by rememberSaveable { mutableStateOf(value = 0) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text= "Score :$score", fontSize = 30.sp)
        Row(modifier = Modifier.padding(horizontal = 10.dp)) {
            Button(onClick = {score++}, modifier = Modifier.weight(weight = 1f)) {
                Text(text="Increase")
            }
            Spacer(modifier = Modifier.padding(horizontal = 10.dp))
            Button(onClick = {score--}, modifier = Modifier.weight(weight = 1f), enabled = score>0) {
                Text(text="Decrease")
            }
        }
    }
}
@Composable
fun RememberSaveableExample(){
    var score by rememberSaveable { mutableStateOf(value = 0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text= "Score :$score", fontSize = 30.sp)
        Row(modifier = Modifier.padding(horizontal = 10.dp)) {
            Button(onClick = {score++}, modifier = Modifier.weight(weight = 1f)) {
                Text(text="Increase")
            }
            Spacer(modifier = Modifier.padding(horizontal = 10.dp))
            Button(onClick = {score--}, modifier = Modifier.weight(weight = 1f), enabled = score>0) {
                Text(text="Decrease")
            }
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun StateHoistingParent(){
    var score by remember { mutableStateOf(value = 0) }
    CounterChild(
        score = score,
        increment = { score++ },
        decrement = { score-- }
    )
}

@Composable
fun CounterChild(
    score: Int,
    increment: () -> Unit,
    decrement: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Score: $score",
            fontSize = 30.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Row() {

            Button(
                onClick = { increment() },
                modifier = Modifier.weight(1f)
            ) {
                Text("Increase")
            }

            Spacer(modifier = Modifier.width(8.dp))

            Button(
                onClick = { decrement() },
                modifier = Modifier.weight(1f),
                enabled = score > 0
            ) {
                Text("Decrease")
            }
        }

    }

}