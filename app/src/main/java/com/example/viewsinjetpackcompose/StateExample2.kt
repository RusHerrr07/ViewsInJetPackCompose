package com.example.viewsinjetpackcompose
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.random.Random

@Composable
fun ColorBox(modifier: Modifier = Modifier) {
    val color = remember { mutableStateOf(Color.Yellow) }

    Box(
        modifier = modifier
            .fillMaxSize()  // Set a size for visibility
            .background(color.value)
            .clickable {
                color.value = Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat()
                )
            }
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewColorBox() {
    ColorBox()
}
