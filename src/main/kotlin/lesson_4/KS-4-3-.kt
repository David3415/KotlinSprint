package org.example.lesson_4

fun main() {
    val weather: Boolean = true
    val covered: Boolean = true
    val wetness: Int = 20
    val season: String = "Winter"
    println("The weather is good for bean:${weather == true && covered == true && wetness == 20 && season == "Winter"}")
}