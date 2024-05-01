package org.example.lesson_1

fun main() {
    val yearOfFlight: String = "1961"
    var hours: String = "09"
    var minutes: String = "07"

    println("Данные о полёте Гагарина")
    println("Дата и время взлёта:")
    println("год полёта: $yearOfFlight")
    println("час: $hours")
    println("минута: $minutes")

    hours = "10"
    minutes = "55"

    println("время посадки: $hours : $minutes")
}
