package com.example.viewsinjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.unit.dp

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.viewsinjetpackcompose.ui.theme.ComposeTestTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeTestTheme {

<<<<<<< HEAD
                ColorBox()
=======
                NotificationCounter()
>>>>>>> 7ee985d10d9f5c9d5b0b944e3df6f2ba819b3588

            }
        }
    }
}





@Preview(showBackground = true)
@Composable
private fun temp() {
    Text("Radhe Radhe",
        color = Color.White,
        modifier = Modifier.background(Color.Red)
            .size(200.dp)
            .padding(36.dp)
            .border(4.dp, Color.Blue)
            .clip(CircleShape)
            .background(Color.Yellow)


    )
}



//
@Composable
fun PasswordField() {
    var password by remember { mutableStateOf("") }
    var isPasswordVisible by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            visualTransformation = if (isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            trailingIcon = {
                TextButton(onClick = { isPasswordVisible = !isPasswordVisible }) {
                    Text(if (isPasswordVisible) "HIDE" else "SHOW")
                }
            },
            keyboardOptions = KeyboardOptions.Default,
            placeholder = {
                Text("Enter The Unique Password",
                    color = Color.Black,
                    fontWeight = FontWeight.ExtraBold
                )
            }
            ,
            singleLine = true,



        )
    }
}


//@Preview(showBackground = true)
//@Composable
//private fun show(){
//Column(
//verticalArrangement = Arrangement.SpaceEvenly,
//    horizontalAlignment =Alignment.End
//)
//{
//
//    Text("A", fontSize = 24.sp)
//    Text("B", fontSize=24.sp)
//
//}
//
//
//    Row(
//         horizontalArrangement = Arrangement.SpaceBetween
//    )
//    {
//        Text("A", fontSize = 26.sp)
//        Text("B", fontSize = 26.sp)
//
//    }
//
//
//
//}



//
//@Preview(showBackground = true)
//@Composable
//fun PasswordFieldPreview() {
//    ComposeTestTheme {
//        PasswordField()
//    }
//}

//@Preview(showBackground = true)
//@Composable
//fun PasswordFieldPreview() {
//    ComposeTestTheme {
//        PasswordField()
//    }
//}

//@Preview(showBackground = true)
//@Composable
//fun show(){
//    Row {
//        Image(
//            painter = painterResource(id = R.drawable.temp),
//            contentDescription = "Image"
//        )
//    }
//}

@Composable
fun listviewItem(img: Int, name: String, occupation: String) {
    Row (
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(16.dp),
//        verticalAlignment = Alignment.CenterVertically, // Align items properly
//        horizontalArrangement = Arrangement.spacedBy(12.dp) // Space between Image & Column
        modifier = Modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = img),
            contentDescription = "Profile Image",
            modifier = Modifier.size(50.dp) // Ensures consistent size
        )

        Column {
            Text(
                text = name,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 18.sp
            )
            Text(
                text = occupation,
                fontWeight = FontWeight.Light,
                fontSize = 14.sp,
                color = Color.Gray // Subtle differentiation
            )
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun showPreview() {
//    Column {
//        listviewItem(R.drawable.temp, "Prahlad Yadav", "Software Engineer")
//        listviewItem(R.drawable.temp, "Prahlad Yadav", "Software Engineer")
//        listviewItem(R.drawable.temp, "Prahlad Yadav", "Software Engineer")
//        listviewItem(R.drawable.temp, "Prahlad Yadav", "Software Engineer")
//        listviewItem(R.drawable.temp, "Prahlad Yadav", "Software Engineer")
//
//    }
//
//}





