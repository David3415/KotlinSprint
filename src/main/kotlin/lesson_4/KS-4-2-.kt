package org.example.lesson_4

fun main() {
    var weight: Int = 20
    var volume: Int = 80
    println("Cargo $weight kg and volume $volume l responds Avarage category:${weight > WEIGHT_MIN && WEIGHT_MAX >= weight && volume < WEIGHT_VOLUME}")
    weight = 50
    volume = 100
    println("Cargo $weight kg and volume $volume l responds Avarage category:${weight > WEIGHT_MIN && WEIGHT_MAX <= weight && volume < WEIGHT_VOLUME}")
}

const val WEIGHT_MIN = 35
const val WEIGHT_MAX = 100
const val WEIGHT_VOLUME = 100