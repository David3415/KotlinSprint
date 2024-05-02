package org.example.lesson_2

fun main() {
    val departureHour: Int = 9
    val departureMinute: Int = 39
    val departureMinutesTotal = departureMinute + departureHour * MINUTES_IN_HOUR
    val trainTravelTime: Int = 457
    println("Время прибытия поезда ${(departureMinutesTotal + trainTravelTime) / MINUTES_IN_HOUR}:${(departureMinutesTotal + trainTravelTime) % MINUTES_IN_HOUR} ")
}

const val MINUTES_IN_HOUR: Int = 60

