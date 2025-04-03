package com.printhub.saver.core.ui.utils

import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

fun glassGradiant(color: Color): Brush {
    return Brush.linearGradient(
        colors = listOf(
            color.copy(alpha = 0.6f),
            color.copy(alpha = 0.1f)
        ),
        start = Offset(0f, 0f),
        end = Offset.Infinite
    )
}