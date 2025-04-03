package com.printhub.saver.dashboard.domain

data class Balance(
    val familyCut: BalanceCut,
    val expensesCut: BalanceCut,
    val savingCut: BalanceCut
){
    fun getTotalBalance(): Double {
        return familyCut.currentCut + expensesCut.currentCut + savingCut.currentCut
    }
}
