package br.com.mizaeldouglas.clone_instagram_mvvm.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun ButtonHome(
    text: String,
) {
    Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Black)
    ) {
        Text("--")
        Text(
            text = text,
            color = Color.White,
            fontSize = 20.sp
        )
        Text("--")
    }

}

@Composable
@Preview
fun ButtonHomePreview() {
    ButtonHome(text = "Mizael Douglas")
}