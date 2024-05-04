package org.example.lesson_5

fun main() {
    val firstNumber: Int = 11
    val secondNumber: Int = 12
    var rightAnswersCount: Int = 0

    println("Введите первое число от 0 до 42")
    var inputNumber: Int = readLine()!!.toInt()

    when (inputNumber) {
        firstNumber -> rightAnswersCount++
        secondNumber -> rightAnswersCount++
    }
    println("Введите второе число от 0 до 42")
    inputNumber = readLine()!!.toInt()
    when (inputNumber) {
        firstNumber -> rightAnswersCount++
        secondNumber -> rightAnswersCount++
    }
    if (rightAnswersCount == 1) {
        println("Вы выиграли утешительный приз!")
    } else if (rightAnswersCount == 2) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else {
        println("Неудача")
    }
}
