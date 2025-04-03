package com.printhub.saver.dashboard.presentation.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.printhub.saver.core.ui.components.GlassyCard
import com.printhub.saver.core.ui.utils.formatCurrency
import com.printhub.saver.dashboard.domain.BalanceCut


@Composable
fun BalanceCutChip(
    balanceCut: BalanceCut,
    cutName: String,
    modifier: Modifier = Modifier
){

    GlassyCard(
        color = Color.White,
        alpha = 0.5f
    ) {
        Column(
            modifier = modifier.padding(8.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = cutName,
                    style = MaterialTheme.typography.bodySmall,
                    color = LocalContentColor.current.copy(alpha = 0.6f)
                )
                Text(
                    text = "${balanceCut.percentage}%",
                    style = MaterialTheme.typography.bodySmall,
                    color = LocalContentColor.current.copy(alpha = 0.6f)
                )
            }
            Text(
                text = formatCurrency(balanceCut.currentCut),
                style = MaterialTheme.typography.bodyLarge,
            )
        }
    }
}