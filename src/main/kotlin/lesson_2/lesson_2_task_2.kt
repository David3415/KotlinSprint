package org.example.lesson_2

fun main() {

    val employersSalarySum: Int = EMPLOYERS_NUM * EMPLOYERS_SALARY
    val commonSalarySum: Int = employersSalarySum + INTERNS_SALARY * INTERNS_NUM

    val averageSalarySum: Int = commonSalarySum / (EMPLOYERS_NUM + INTERNS_NUM)

    println("Расходы на выплату зарплаты постоянных сотрудников: $employersSalarySum")
    println("Общие расходы по ЗП после прихода стажеров: $commonSalarySum")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalarySum")
}

const val EMPLOYERS_NUM = 50
const val EMPLOYERS_SALARY = 30000
const val INTERNS_NUM = 30
const val INTERNS_SALARY = 20000
