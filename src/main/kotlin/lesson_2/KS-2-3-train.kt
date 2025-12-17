package org.example.lesson_2

fun main() {

    val travelTimeMinutesCommon: Short = 657
    val travelTimeHours: Int = travelTimeMinutesCommon / MINUTES_IN_HOUR
    val travelTimeMinutes: Int = travelTimeMinutesCommon % MINUTES_IN_HOUR
    val travelTime = String.format("%02d:%02d", travelTimeHours, travelTimeMinutes)

    println("Travel time: $travelTime")
}

const val MINUTES_IN_HOUR: Short = 60



