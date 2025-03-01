package com.example.viewsinjetpackcompose
<<<<<<< HEAD
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
=======

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
>>>>>>> 7ee985d10d9f5c9d5b0b944e3df6f2ba819b3588
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
<<<<<<< HEAD
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import kotlin.random.Random


=======
import androidx.compose.ui.tooling.preview.Preview

@Preview
>>>>>>> 7ee985d10d9f5c9d5b0b944e3df6f2ba819b3588
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
