package com.example.viewsinjetpackcompose

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun NotificationCounter() {
    var count by remember { mutableStateOf(0) }  // Use remember for state persistence

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Text("You have sent $count notifications")
        Button(onClick = {
            Log.d("CODERTAB", "Button clicked")
            count++  // Updates the state, triggering recomposition
        }) {
            Text("Send Notification")
        }
    }
}
