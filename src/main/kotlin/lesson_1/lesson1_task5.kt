package org.example.lesson_1

fun main() {
    var seconds: Int = 6480
    val secondsInHour = SECONDS_IN_MINUTE * MINUTES_IN_HOUR
    val hours: Int = seconds / secondsInHour
    val minutes: Int = seconds % secondsInHour / MINUTES_IN_HOUR
    seconds = seconds % secondsInHour % MINUTES_IN_HOUR
    val timeResultString = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println("Time in space: $timeResultString")

}

const val MINUTES_IN_HOUR = 60
const val SECONDS_IN_MINUTE = 60