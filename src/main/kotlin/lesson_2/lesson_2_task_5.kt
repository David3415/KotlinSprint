package org.example.lesson_2

fun main() {
    val interesRate: Double = 16.7
    val depositAmount: Int = 70000
    val depositPeriod: Int = 20

    var depositResult: Double = depositAmount.toDouble()
    for (i in 1..depositPeriod) {
        depositResult += depositResult * interesRate / PERCENTS
    }

    val depositResultFinal: String = String.format("%.3f", depositResult)
    println("Размер вклада через 20 лет: $depositResultFinal")
}


const val PERCENTS = 100

