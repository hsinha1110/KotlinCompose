package com.himanshusinha.firstapp.jetpackcompose

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextExample() {
    Text(
        text = "Mission Android 2026",
        color = Color.Blue,
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Cursive,
        letterSpacing = 5.sp,
        textAlign = TextAlign.Center
    )
}

@Composable
fun TextFieldExample() {

    var name by remember { mutableStateOf(value = "") }

    TextField(
        value = name,
        onValueChange = { name = it },
//        label={Text(text="Enter your name")}
        placeholder = { Text(text = "Enter Your Name") },
        leadingIcon = {
            Text(text = "*", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        },
        trailingIcon = {
            Text(text = "#", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        },
        singleLine = true,
        shape = CircleShape,
        modifier = Modifier.padding(top = 70.dp, start = 20.dp),
        colors = TextFieldDefaults.colors(
            focusedTextColor = Color.Green,
            unfocusedTextColor = Color.Red,
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.Black,
            focusedIndicatorColor = Color.Blue,
            unfocusedIndicatorColor = Color.Black,
            cursorColor = Color.Magenta,
            focusedPlaceholderColor = Color.Cyan,
            unfocusedPlaceholderColor = Color.Gray,
            focusedLeadingIconColor = Color.Green,
            unfocusedLeadingIconColor = Color.Red,
            focusedTrailingIconColor = Color.Green,
            unfocusedTrailingIconColor = Color.Red,
            unfocusedLabelColor = Color.Red,
            focusedLabelColor = Color.Green
        )
    )

}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OutlinedTextFieldExample() {

    var name by remember { mutableStateOf("") }

    OutlinedTextField(
        value = name,   // ✅ state use karo
        onValueChange = { name = it },

        modifier = Modifier.padding(top = 70.dp, start = 20.dp),

        label = { Text(text = "Name") },

        placeholder = {
            Text(text = "Enter your name")
        },

        leadingIcon = {
            Text(text = "*", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        },

        trailingIcon = {
            Text(text = "#", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        },

        singleLine = true,
        shape = RoundedCornerShape(20.dp),

        colors = OutlinedTextFieldDefaults.colors(   // ✅ colors
            focusedTextColor = Color.Green,
            unfocusedTextColor = Color.Red,

            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.Black,

            focusedBorderColor = Color.Blue,
            unfocusedBorderColor = Color.Black,

            cursorColor = Color.Magenta,

            focusedPlaceholderColor = Color.Cyan,
            unfocusedPlaceholderColor = Color.Gray,

            focusedLeadingIconColor = Color.Green,
            unfocusedLeadingIconColor = Color.Red,

            focusedTrailingIconColor = Color.Green,
            unfocusedTrailingIconColor = Color.Red,

            focusedLabelColor = Color.Green,
            unfocusedLabelColor = Color.Red
        )
    )
}