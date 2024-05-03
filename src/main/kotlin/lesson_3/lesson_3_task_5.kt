package org.example.lesson_3

fun main() {
    val stringFromPlayer: String = "D2-D4;0"
    var moveSource: String = ""
    var moveDestination: String = ""
    var moveNumber: String = ""
    var wordrCounter: Int = 1
    for (i in stringFromPlayer) {
        if (i == '-'||i == ';') {
            wordrCounter++
            continue
        }
        if (wordrCounter == 1) moveSource += i
        else if (wordrCounter == 2) moveDestination += i
        else if (wordrCounter == 3) moveNumber += i
    }

    println("moveSource: $moveSource")
    println("moveDestination: $moveDestination")
    println("moveNumber $moveNumber")
}