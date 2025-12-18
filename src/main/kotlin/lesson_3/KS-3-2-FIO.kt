package org.example.lesson_3

fun main() {
    var family: String = "Andreeva"
    val name: String = "Tatiana"
    val surname: String = "Sergeevna"
    var age: Short = 20

    println("FIO: $family $name $surname Age: $age")

    age=22
    family="Sidorova"

    println("FIO: $family $name $surname Age: $age")
}