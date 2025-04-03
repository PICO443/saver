package com.printhub.saver.dashboard.presentation.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.printhub.saver.core.ui.components.GlassyCard
import com.printhub.saver.core.ui.utils.formatCurrency
import com.printhub.saver.core.ui.utils.glassGradiant
import com.printhub.saver.dashboard.domain.Balance
import org.jetbrains.compose.resources.stringResource
import saver.composeapp.generated.resources.Res
import saver.composeapp.generated.resources.balance
import saver.composeapp.generated.resources.expenses_cut
import saver.composeapp.generated.resources.family_cut
import saver.composeapp.generated.resources.saving_cut

@Composable
fun StatusCard(
    balance: Balance,
    modifier: Modifier = Modifier,
){
 GlassyCard(
     color = MaterialTheme.colorScheme.primary,
     alpha = 0.6f
 ) {
        Column(
            modifier = modifier.padding(12.dp)
        ) {
            Text(
                text = stringResource(Res.string.balance),
                style = MaterialTheme.typography.headlineLarge,
                color = LocalContentColor.current.copy(alpha = 0.6f)
            )
            Text(
                text = formatCurrency(balance.getTotalBalance()),
                style = MaterialTheme.typography.displayLarge,
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                BalanceCutChip(
                    balanceCut = balance.familyCut,
                    cutName = stringResource(Res.string.family_cut)
                )
                BalanceCutChip(
                    balanceCut = balance.expensesCut,
                    cutName = stringResource(Res.string.expenses_cut)
                )
                BalanceCutChip(
                    balanceCut = balance.savingCut,
                    cutName = stringResource(Res.string.saving_cut)
                )
            }
        }
    }
}