package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val listSize: Int = 3
    val randomValues = List(listSize) { Random.nextInt(0, 42) }
    println(randomValues)
    val inputValuesList: MutableList<Int> = mutableListOf()
    for (i in 1..listSize) {
        print("Введите число $i: ")
        val temp: Int = readLine()!!.toInt()
        inputValuesList.add(temp)
    }
    println("Введённые числа: $inputValuesList")

    val intersectRes = randomValues.intersect(inputValuesList)
    if (intersectRes.isEmpty()) {
        println("пользователь не угадал ни одного числа")
    } else if (intersectRes.size == 3) {
        println("пользователь угадал все числа и выиграл джекпот")
    } else if (intersectRes.size == 2) {
        println("пользователь угадал два числа и получает крупный приз")
    } else if (intersectRes.size == 1) {
        println("угадано одно число, пользователю выплачивается утешительный приз")
    }
    println("Угаданные номера:$intersectRes")
    println("Выигрышные номера: $randomValues")
}
