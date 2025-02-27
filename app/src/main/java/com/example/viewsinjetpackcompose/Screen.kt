package com.example.viewsinjetpackcompose
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun show() {
    LazyColumn {
        items(getCategoryList()) { item ->
            BlogCategory(img = item.img, title = item.title, subtitle = item.subtitle)
        }
    }
}

@Composable
fun BlogCategory(img: Int, title: String, subtitle: String) {
    Card(
        modifier = Modifier.padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Row(modifier = Modifier.padding(8.dp)) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "Category Icon",
                modifier = Modifier.size(48.dp).padding(end = 8.dp)
            )
            ItemDescription(title, subtitle, Modifier.weight(1f))
        }
    }
}



@Composable
fun ItemDescription(title: String, subtitle: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            fontWeight = FontWeight.ExtraBold,
            style = MaterialTheme.typography.bodyLarge
        )
        Text(
            text = subtitle,
            fontWeight = FontWeight.Thin,
            fontSize = 12.sp
        )
    }
}

data class Category(val img: Int, val title: String, val subtitle: String)

fun getCategoryList(): List<Category> {
    return listOf(
        Category(R.drawable.temp, "Programming", "Learn different languages"),
        Category(R.drawable.temp, "AI & Machine Learning", "Explore AI and ML concepts"),
        Category(R.drawable.temp, "Cybersecurity", "Protect your data and systems"),
        Category(R.drawable.temp, "Web Development", "Master front-end and back-end"),
        Category(R.drawable.temp, "App Development", "Create apps for Android and iOS"),
        Category(R.drawable.temp, "Game Development", "Design and build engaging games"),
        Category(R.drawable.temp, "Cloud Computing", "Work with cloud-based solutions"),
        Category(R.drawable.temp, "Data Science", "Analyze and visualize data"),
        Category(R.drawable.temp, "Blockchain", "Learn about decentralized technology"),
        Category(R.drawable.temp, "DevOps", "Improve development and deployment workflow"),
        Category(R.drawable.temp, "Networking", "Understand computer networks"),
        Category(R.drawable.temp, "UI/UX Design", "Design better user experiences"),
        Category(R.drawable.temp, "Embedded Systems", "Work with hardware and software integration"),
        Category(R.drawable.temp, "Robotics", "Build and program robots"),
        Category(R.drawable.temp, "IoT (Internet of Things)", "Connect devices to the internet"),
        Category(R.drawable.temp, "Big Data", "Handle and process large datasets"),
        Category(R.drawable.temp, "Quantum Computing", "Explore next-gen computing"),
        Category(R.drawable.temp, "Cyber Forensics", "Investigate cyber crimes"),
        Category(R.drawable.temp, "Software Testing", "Ensure quality in software development"),
        Category(R.drawable.temp, "AR/VR Development", "Create immersive digital experiences")
    )
}
