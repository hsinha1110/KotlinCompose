package com.himanshusinha.firstapp.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Composable
fun DividerExample1() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Profile Details", fontSize = 16.sp )
        HorizontalDivider(
            modifier = Modifier
                .width(300.dp)
                .padding(all = 10.dp),
            thickness = 2.dp,
            color = Color.Red

        )
        Text(text = "More Information")

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DividerExample2() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Profile Details", fontSize = 16.sp, fontWeight = FontWeight.Bold)

            VerticalDivider(
                modifier = Modifier
                    .height(80.dp)
                    .padding(all = 10.dp),
                thickness = 2.dp,
                color = Color.Blue
            )
            Text(text = "More Information", fontSize = 16.sp, fontWeight = FontWeight.Bold)

        }
    }

}