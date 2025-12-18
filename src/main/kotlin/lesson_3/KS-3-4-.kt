package org.example.lesson_3

fun main() {
    var chessMoveNumber: Short = 1
    var chessMoveStart: String = "E2"
    var chessMoveEnd: String = "E4"

    println("$chessMoveStart - $chessMoveEnd, move $chessMoveNumber")

    chessMoveStart="B2"
    chessMoveEnd="B3"
    chessMoveNumber++

    println("$chessMoveStart - $chessMoveEnd, move $chessMoveNumber")
}