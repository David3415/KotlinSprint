package org.example.lesson_2

fun main() {
    val minutesInHour: Short = 60
    val departureHour: Short = 9
    val departureMinute: Short = 39
    val travelTimeMinutesCommon: Short = 657
    val travelTimeHours: Int = travelTimeMinutesCommon / minutesInHour
    val travelTimeMinutes: Int = travelTimeMinutesCommon % minutesInHour
    var nullForHour: String = ""
    var nullForMinute: String = ""
    if (travelTimeHours < 10) {
        nullForHour = "0"
    }
    if (travelTimeMinutes < 10) {
        nullForMinute = "0"
    }
    println("travelTime: $nullForHour$travelTimeHours:$nullForMinute$travelTimeMinutes")
}