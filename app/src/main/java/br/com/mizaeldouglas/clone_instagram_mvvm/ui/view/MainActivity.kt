package br.com.mizaeldouglas.clone_instagram_mvvm.ui.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.mizaeldouglas.clone_instagram_mvvm.R
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
            .fillMaxWidth()
            .fillMaxHeight()
//            .width(200.dp)
//            .height(200.dp)
            .border(20.dp, Color.Red)
            .padding(30.dp, 10.dp)

    ) {
        ButtonHome(text = "Mizael Douglas")
        Text(
            "Hello World!", modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
        )
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Mizael Douglas", fontSize = 36.sp)
            Column(
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
                    .clip(CircleShape)
                    .border(5.dp, Color.Red , CircleShape)
                    .background(Color.Yellow),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
//                    .padding(30.dp, 30.dp, 30.dp, 30.dp)
            ) { Text("MD", fontSize = 45.sp) }

            Column(
                modifier = Modifier
                    .clip(CircleShape)
                    .border(5.dp, Color.Black , CircleShape)
                    .background(Color.White),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.luffy),
                    contentDescription = "luffytaro",
                    modifier = Modifier
                        .clip(CircleShape)
                )
            }
        }
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

