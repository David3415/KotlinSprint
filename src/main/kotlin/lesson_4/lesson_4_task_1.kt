package org.example.lesson_4

fun main() {
    val todayTableReservation: Int = 13
    val tomorrowTableReservation: Int = 9
    val infoStringToday: String = "Доступность столиков на сегодня:"
    val infoStringTomorrow: String = "Доступность столиков на завтра:"

    var tablesAvailable: Boolean = (todayTableReservation < TABLES_QUANTITY)
    println("$infoStringToday $tablesAvailable")

    tablesAvailable = (tomorrowTableReservation < TABLES_QUANTITY)
    println("$infoStringTomorrow $tablesAvailable")
}

const val TABLES_QUANTITY: Int = 13