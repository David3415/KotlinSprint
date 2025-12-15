package org.example.lesson_4

fun main() {
    var bookedTablesToday: Short = 13
    var bookedTablesTomorrow: Short = 9
    println(
        "Available tables for today : ${TOTAL_TABLES_NUMBER > bookedTablesToday}\n' "+
                "Available tables for tomorrow : ${TOTAL_TABLES_NUMBER > bookedTablesTomorrow}"
    )
}

const val TOTAL_TABLES_NUMBER: Short = 13