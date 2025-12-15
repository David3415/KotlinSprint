package org.example.lesson_1

fun main() {
    var seconds: Int = 6480
    val minutesInHour = 60
    val secondsInHour = minutesInHour * 60
    val hours: Int = seconds / secondsInHour
    val minutes: Int = seconds % secondsInHour / minutesInHour
    seconds = seconds % secondsInHour % minutesInHour
    println("Time in space: $hours:$minutes:$seconds")
}