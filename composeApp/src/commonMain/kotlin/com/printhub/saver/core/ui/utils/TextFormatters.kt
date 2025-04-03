package com.printhub.saver.core.ui.utils



fun formatCurrency(amount: Double): String {
    // Manually handle decimal formatting
    val amountString = if (amount % 1 == 0.0) {
        "${amount.toInt()}.00"  // If it's a whole number, add ".00"
    } else {
        val decimalPart = (amount % 1 * 100).toInt()  // Get the decimal part
        "${amount.toInt()}.$decimalPart".padEnd(6, '0')  // Ensure 2 decimal places
    }

    // Split the amount into integer and decimal parts
    val parts = amountString.split(".")
    val integerPart = parts[0]
    val decimalPart = parts[1]

    // Add thousands separators manually to the integer part
    val formattedIntegerPart = integerPart.reversed().chunked(3).joinToString(",").reversed()

    // Return the formatted currency string
    return "£$formattedIntegerPart.$decimalPart"
}
