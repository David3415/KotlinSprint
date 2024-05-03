package org.example.lesson_4

fun main() {

    var volume: Int = 20
    var weight: Int = 80
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${weight > MIN_WEIGHT && weight <= MAX_WEIGHT && volume < MAX_VOLUME}")

    weight = 50
    volume = 100
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${weight > MIN_WEIGHT && weight <= MAX_WEIGHT && volume < MAX_VOLUME}")
}

const val MAX_VOLUME: Int = 100
const val MIN_WEIGHT: Int = 35
const val MAX_WEIGHT: Int = 100
