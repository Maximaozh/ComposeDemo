package com.example.composedemo
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { _ ->
                }
            }
        }
    }

    @Preview
    @Composable
    fun DemoTextPreview()
    {
        ComposeDemoTheme()
        {
            DemoText(message = "Welcome to android!!!", fontSize = 12f)
        }
    }

    @Composable
    fun DemoText(message: String, fontSize: Float)
    {
        Text(
            text = message,
            fontSize = fontSize.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.background(color = Color.White) // Добавил для цвета
        )
    }

    @Composable
    fun DemoSlider(sliderPosition: Float, onPositionChange: (changeValue : Float) -> Unit)
    {
        Slider(
            modifier = Modifier.padding(10.dp),
            valueRange = 20f..38f,
            value = sliderPosition,
            onValueChange = {onPositionChange(it)}
        )
    }


}
