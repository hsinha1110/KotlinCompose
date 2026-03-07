package com.himanshusinha.firstapp.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LazyColumnExample() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(20) { index ->
            Text(
                text = "Item $index",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = Color.White,
                modifier = Modifier
                    .background(Color.Black, shape = RoundedCornerShape(10.dp))
                    .padding(10.dp),
            )
        }
    }
}

@Composable
fun LazyRowExample() {
    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        items(20) { index ->
            Text(
                text = "Item $index", fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = Color.White,
                modifier = Modifier
                    .background(Color.Black, shape = RoundedCornerShape(10.dp))
                    .padding(10.dp),
            )
        }
    }
}

@Composable
fun NestedLazyLists() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 10.dp)
    ) {
        items(10) { index ->
            Text(text = "Item $index", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            LazyRow(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(all = 10.dp),
                horizontalArrangement = Arrangement.spacedBy(20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                items(10) { index ->
                    Text(
                        text = "Item $index",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .background(Color.LightGray, shape = RoundedCornerShape(10.dp))
                            .padding(30.dp),
                    )
                }
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TypesOfItem() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 40.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        // 01 - Header
        LazyColumn() {
            item {
                Text(text = "Header")
            }
        }
        // 02 - Header
        LazyColumn() {
            items(10) { index ->
                Text(text = "Item $index")
            }
        }
        // 03 - Items(list)
        val names = listOf("Alice", "Bob", "Charlie", "David", "Eve")

        LazyColumn {
            items(count = names.size) { index ->
                Text(text = names[index])
            }
        }

        // 04 - itemsIndexedList(list)
        LazyColumn() {
            itemsIndexed(names) { names, index ->
                Text(text = "$names-$index")
            }
        }
    }
}