package org.example.lesson_3

fun main() {
    val name: String = "Татьяна"
    val surname: String = "Андреева"
    val patronymic: String = "Сергеевна"
    val surnameNew: String = "Сидорова"
    val ageBeforeMarriage: Short = 20
    val ageAfterMarriage: Short = 22
    val lineEnd1: String = "лет"
    val lineEnd2: String = "года"

    println("$surname $name $patronymic, $ageBeforeMarriage $lineEnd1")
    println("$surnameNew $name $patronymic, $ageAfterMarriage $lineEnd2")
}