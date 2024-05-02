package org.example.lesson_2

fun main() {
    var depositResult: Double = DEPOSIT_AMOUNT.toDouble()
    for (i in 1..DEPOSIT_PERIOD) {
        depositResult += depositResult * INTEREST_RATE / PERCENTS
    }

    val depositResultFinal: String = String.format("%.3f", depositResult)
    println("Размер вклада через 20 лет: $depositResultFinal")
}

const val DEPOSIT_AMOUNT: Int = 70000
const val INTEREST_RATE: Double = 16.7
const val DEPOSIT_PERIOD: Int = 20
const val PERCENTS: Int = 100