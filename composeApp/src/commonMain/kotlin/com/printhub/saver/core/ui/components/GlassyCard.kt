package com.printhub.saver.core.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardDefaults.cardColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import com.printhub.saver.core.ui.utils.glassGradiant

// Reusable Composable for Card with Gradient Border
@Composable
fun GlassyCard(
    modifier: Modifier = Modifier,
    color: Color,
    alpha: Float = 1f,
    content: @Composable () -> Unit
) {
    // Create the gradient brush
    val gradientBrush = glassGradiant(color)
    Box(
        modifier = Modifier.clip(MaterialTheme.shapes.medium)
    ) {
        // Card with custom gradient border
        Card(
            colors = cardColors().copy(containerColor = Color.Transparent),
            modifier = modifier
                .background(gradientBrush, MaterialTheme.shapes.medium, alpha)
                .drawBehind {
//                    drawRoundRect(
//                        brush = gradientBrush,
//                        size = size,
//                        style = Fill, // Stroke width for the border
//                        topLeft = androidx.compose.ui.geometry.Offset.Zero,
//                    )
                    // Draw the gradient border using the custom brush and stroke width
                    drawRoundRect(
                        brush = gradientBrush,
                        size = size,
                        style = Stroke(width = 2.dp.toPx()), // Stroke width for the border
                        topLeft = androidx.compose.ui.geometry.Offset.Zero,
                        // TODO - Add Dynamic Corner Radius
                        cornerRadius = CornerRadius(10.dp.toPx())
                    )
                },
//        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp) // Shadow elevation
        ) {
            // Box to contain the content inside the card
            content()
        }
    }
}