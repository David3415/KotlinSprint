package org.example.lesson_4

fun main() {
    var todayTableReservation: Int = 13
    var tomorrowTableReservation: Int = 9
    var infoStringToday: String = "Доступность столиков на сегодня:"
    var infoStringTomorrow: String = "Доступность столиков на завтра:"

    var tablesAvailable: Boolean = (todayTableReservation == TABLES_QUANTITY)
    println("$infoStringToday $tablesAvailable")

    tablesAvailable = (tomorrowTableReservation == TABLES_QUANTITY)
    println("$infoStringTomorrow $tablesAvailable")
}

const val TABLES_QUANTITY: Int = 13