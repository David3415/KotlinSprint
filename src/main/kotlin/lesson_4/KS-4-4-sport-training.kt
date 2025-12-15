package org.example.lesson_4

fun main() {
    var trainingDay: Short = 1
    val handsAndPressTraining: Short = 2
    val legsAndBackTraining: Short = 2
    val trainingTable = """
        |handsTraining: ${trainingDay % handsAndPressTraining == 0}
        |legsTraining: ${trainingDay % legsAndBackTraining != 0}
        |backTraining: ${trainingDay % legsAndBackTraining != 0}
        |pressTraining: ${trainingDay % handsAndPressTraining == 0}
    """.trimMargin()
    println(trainingTable)
}