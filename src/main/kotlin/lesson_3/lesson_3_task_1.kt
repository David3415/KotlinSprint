package org.example.lesson_3

fun main() {
    val userName: String = "Давид"
    val greetingDay: String = "Добрый день"
    val greetingNight: String = "Добрый вечер"

    var greeting: String = greetingDay
    println("$greeting, $userName!")

    greeting = greetingNight
    println("$greeting, $userName!")
}