package org.example.lesson_5

fun main() {
    val currentYear: Int = 2024

    println("Введите год рождения:")

    val inputYear: Int = readLine()!!.toInt()
    val inputAge: Int = currentYear - inputYear
    if (inputAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернуться на главный экран")
    }
}

const val AGE_OF_MAJORITY: Int = 18
