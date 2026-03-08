package com.himanshusinha.firstapp.jetpackcompose.C12_Scaffold

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AppBottomBar() {

    var selectedIndex by remember { mutableStateOf(0) }

    BottomAppBar(
        containerColor = Color.LightGray.copy(alpha = 0.2f)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            IconButton(
                onClick = { selectedIndex = 0 },
                colors = IconButtonDefaults.iconButtonColors(
                    containerColor = if (selectedIndex == 0)
                        Color.Blue.copy(alpha = 0.1f)
                    else Color.Transparent
                )
            ) {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Home",
                    modifier = Modifier.size(30.dp),
                    tint = if (selectedIndex == 0) Color.Blue else Color.Black
                )
            }

            IconButton(
                onClick = { selectedIndex = 1 },
                colors = IconButtonDefaults.iconButtonColors(
                    containerColor = if (selectedIndex == 1)
                        Color.Blue.copy(alpha = 0.1f)
                    else Color.Transparent
                )
            ) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search",
                    modifier = Modifier.size(30.dp),
                    tint = if (selectedIndex == 1) Color.Blue else Color.Black
                )
            }

            IconButton(
                onClick = { selectedIndex = 2 },
                colors = IconButtonDefaults.iconButtonColors(
                    containerColor = if (selectedIndex == 2)
                        Color.Blue.copy(alpha = 0.1f)
                    else Color.Transparent
                )
            ) {
                Icon(
                    imageVector = Icons.Default.Notifications,
                    contentDescription = "Notifications",
                    modifier = Modifier.size(30.dp),
                    tint = if (selectedIndex == 2) Color.Blue else Color.Black
                )
            }

            IconButton(
                onClick = { selectedIndex = 3 },
                colors = IconButtonDefaults.iconButtonColors(
                    containerColor = if (selectedIndex == 3)
                        Color.Blue.copy(alpha = 0.1f)
                    else Color.Transparent
                )
            ) {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Profile",
                    modifier = Modifier.size(30.dp),
                    tint = if (selectedIndex == 3) Color.Blue else Color.Black
                )
            }
        }
    }
}