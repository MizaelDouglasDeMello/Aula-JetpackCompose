package br.com.mizaeldouglas.clone_instagram_mvvm.ui.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.mizaeldouglas.clone_instagram_mvvm.ui.components.ButtonHome
import br.com.mizaeldouglas.clone_instagram_mvvm.ui.theme.Clone_instagram_MVVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Clone_instagram_MVVMTheme {
                FirstApp()
            }
        }
    }
}

@Composable
fun FirstApp() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.DarkGray)

    ) {
        ButtonHome(text = "Mizael Douglas")
        Text(
            "Hello World!", modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
        )
        Row(
            modifier = Modifier.fillMaxWidth().fillMaxHeight(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "Hello", fontSize = 36.sp, modifier = Modifier.background(Color.Blue)
            )
            Text(
                "World", fontSize = 36.sp, modifier = Modifier.background(Color.Red)
            )
            Text(
                "!", fontSize = 36.sp, modifier = Modifier.background(Color.Yellow)
            )
        }
    }

}

@Preview
@Composable
fun FirstAppPreview() {
    Clone_instagram_MVVMTheme {
        FirstApp()
    }
}

