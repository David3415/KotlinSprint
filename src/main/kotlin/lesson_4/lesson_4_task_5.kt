package org.example.lesson_4

fun main() {
    print("Наличие повреждений корпуса: ")
    val shipDamage: String? = readLine()
    print("Tекущий состав экипажа: ")
    val shipCrew: String? = readLine()
    print("Количество ящиков с провизией на борту: ")
    val boxQuontity: String? = readLine()
    print("Благоприятность метеоусловий: ")
    val weather: String? = readLine()
    println(
        "${
            (shipDamage == "false" && shipCrew!!.toInt() >= SHIP_CREW_MIN && shipCrew!!.toInt() <= SHIP_CREW_MAX &&
                    boxQuontity!!.toInt() >= BOX_QUANTITY_MIN) || (shipCrew!!.toInt() in SHIP_CREW_MIN..SHIP_CREW_MAX &&
                    boxQuontity!!.toInt() >= BOX_QUANTITY_MIN && weather == "true")
        }"
    )
}

const val BOX_QUANTITY_MIN: Int = 50
const val SHIP_CREW_MIN: Int = 55
const val SHIP_CREW_MAX: Int = 70