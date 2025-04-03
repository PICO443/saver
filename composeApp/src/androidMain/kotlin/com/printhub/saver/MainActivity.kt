package com.printhub.saver

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.printhub.saver.app.App
import com.printhub.saver.core.ui.theme.MyApplicationTheme
import com.printhub.saver.dashboard.domain.Balance
import com.printhub.saver.dashboard.domain.BalanceCut
import com.printhub.saver.dashboard.presentation.home.components.StatusCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun AppAndroidPreview() {
    MyApplicationTheme {
        StatusCard(
            Balance(
                familyCut = BalanceCut(
                    percentage = 10.0,
                    currentCut = 100.0
                ),
                expensesCut = BalanceCut(
                    percentage = 10.0,
                    currentCut = 100.0
                ),
                savingCut = BalanceCut(
                    percentage = 10.0,
                    currentCut = 100.0
                )
            )
        )
    }
}