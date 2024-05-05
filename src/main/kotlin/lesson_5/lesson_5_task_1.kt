package org.example.lesson_5

fun main() {
    val number1: Int = 1
    val number2: Int = 4
    val resultSum: Int = number1 + number2
    println("Подтвердите, что вы не бот - решите пример")
    print("$number1 + $number2 = ")
    val userAnswer: String = readln()
    if (resultSum == userAnswer.toInt()) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен")
    }
}
