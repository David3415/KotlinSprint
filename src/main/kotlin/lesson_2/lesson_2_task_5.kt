package org.example.lesson_2

fun main() {
    val depositAmount: Int = 70000
    val depositPeriod: Int = 20
    val percents: Int = 100
    var depositResult: Double = depositAmount.toDouble()
    for (i in 1..depositPeriod) {
        depositResult += depositResult * INTEREST_RATE / percents
    }

    val depositResultFinal: String = String.format("%.3f", depositResult)
    println("Размер вклада через 20 лет: $depositResultFinal")
}

const val INTEREST_RATE: Double = 16.7

