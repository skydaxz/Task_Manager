package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import com.example.taskmanager.ui.theme.TaskManagerTheme
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Design(
                        text1 = "All tasks completed",
                        text2 = "Nice work!",
                        imagePainter = painterResource(id = R.drawable.ic_task_completed)
                    )
                }
            }
        }
    }
}

@Composable
fun Design(text1: String, text2: String, imagePainter: Painter) {
    Column(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
    Image(
        painter = imagePainter, contentDescription = null)
    Text(
        text = text1,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .padding(top = 24.dp, bottom = 8.dp),
    )
    Text(
        text = text2,
        fontSize =16.sp

    )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskManagerTheme {
        Design(
            text1 = "All tasks completed",
            text2 = "Nice work!",
            imagePainter = painterResource(id = R.drawable.ic_task_completed)
            )
    }
}