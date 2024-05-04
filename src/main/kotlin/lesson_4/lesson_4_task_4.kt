package org.example.lesson_4

fun main() {
    var dayCount: Int = 2
    var exerciseProgram: String

    if (dayCount % 2 != 0) {
        exerciseProgram = """
        Упражнения для рук:    true
        Упражнения для ног:    false
        Упражнения для спины:  false
        Упражнения для пресса: true
    """.trimIndent()
    } else {
        exerciseProgram = """
        Упражнения для рук:    false
        Упражнения для ног:    true
        Упражнения для спины:  true
        Упражнения для пресса: false
    """.trimIndent()
    }
    println(exerciseProgram)
}

