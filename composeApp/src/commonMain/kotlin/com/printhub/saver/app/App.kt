package com.printhub.saver.app



import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.printhub.saver.core.ui.theme.MyApplicationTheme
import com.printhub.saver.dashboard.domain.Balance
import com.printhub.saver.dashboard.domain.BalanceCut
import com.printhub.saver.dashboard.presentation.home.components.StatusCard
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {

    MyApplicationTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ){
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
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
                    ),
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }

    }
}