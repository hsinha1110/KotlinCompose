package com.himanshusinha.firstapp.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ModifiersExample() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 16.dp),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        // Top Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 10.dp)
                .background(Color.Cyan),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text("Apple", fontSize = 20.sp, modifier = Modifier.padding(10.dp))
            Text("Banana", fontSize = 20.sp, modifier = Modifier.padding(10.dp))
            Text("Grapes", fontSize = 20.sp, modifier = Modifier.padding(10.dp))
        }
        // Center Row
        val boxShape = RoundedCornerShape(16.dp)

        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(boxShape)
                .background(
                    color = Color.Blue,
                    shape = boxShape
                )
                .border(
                    width = 5.dp,
                    color = Color.Gray,
                    shape = boxShape
                )
                .clickable { },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Center",
                fontSize = 20.sp,
                color = Color.White
            )
        }
        // Bottom Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 10.dp)
                .background(Color.Cyan),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text("One", fontSize = 20.sp, modifier = Modifier.padding(10.dp))
            Text("Two", fontSize = 20.sp, modifier = Modifier.padding(10.dp))
            Text("Three", fontSize = 20.sp, modifier = Modifier.padding(10.dp))
        }
    }
}