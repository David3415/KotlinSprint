package org.example.lesson_3

fun main() {
    var moveSource: String = "E2"
    var moveDestination: String = "E4"
    var moveNumber: Int = 1
    println("$moveSource - $moveDestination; $moveNumber")

    moveSource = "D2"
    moveDestination = "D3"
    moveNumber++
    println("$moveSource - $moveDestination; $moveNumber")
}