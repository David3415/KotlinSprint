package org.example.lesson_1

fun main() {
    val hoursInCosmos: Int = SECONDS_IN_COSMOS / SECONDS_IN_HOUR   // – количество часов в космосе
    val resHours = String.format("%s%s", NULL_STRING, hoursInCosmos)
    val minutesInCosmos: Int = SECONDS_IN_COSMOS % SECONDS_IN_HOUR / SECONDS_IN_MINUTE
    val secondsInCosmos: String =
        String.format("%s%s", NULL_STRING, SECONDS_IN_COSMOS % SECONDS_IN_HOUR % SECONDS_IN_MINUTE)
    println("Время, проведенное в космосе: $resHours : $minutesInCosmos : $secondsInCosmos")


}

const val NULL_STRING: String = "0"
const val SECONDS_IN_COSMOS: Int = 6480 // – общее количество секунд полёта
const val SECONDS_IN_HOUR: Int = 3600 // Всего секунд в часе
const val SECONDS_IN_MINUTE: Int = 60 // Всего секунд в часе

