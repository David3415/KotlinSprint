package org.example.lesson_3

fun main() {
    val name: String = "Татьяна"
    var surname: String = "Андреева"
    val patronymic: String = "Сергеевна"
    var age: Short = 20

    println("$surname $name $patronymic, $age")
    surname = "Сидорова"
    age = 22
    println("$surname $name $patronymic, $age")

}