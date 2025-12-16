package org.example.lesson_2

fun main() {
    val workersNumber: Short = 30
    val studentsNumber: Short = 20
    val workerSalary: Short = 30000
    val studentSalary: Short = 20000
    val workersSalarySumm: Int = workersNumber * workerSalary
    val totalSalarySumm: Int = workersNumber * workerSalary + studentsNumber * studentSalary
    val averageSalary: Int = totalSalarySumm / (workersNumber + studentsNumber)
    println("workersSalarySumm $workersSalarySumm commonSalarySumm: $totalSalarySumm averageSalary: $averageSalary")
}