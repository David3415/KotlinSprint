package org.example.lesson_2

fun main() {
    val studentPoints1: Int = 3
    val studentPoints2: Int = 4
    val studentPoints3: Int = 3
    val studentPoints4: Int = 5
    val numOfStudents: Int = 4

    println(
        String.format(
            "%.2f",
            (studentPoints1 + studentPoints2 + studentPoints3 + studentPoints4).toFloat() / numOfStudents
        )
    )

}