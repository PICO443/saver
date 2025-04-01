package com.printhub.saver.app



import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import com.printhub.saver.core.ui.theme.MyApplicationTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {

    MyApplicationTheme {
        Button( onClick = {}) {
            Text("Hello, World!")
        }
    }
}