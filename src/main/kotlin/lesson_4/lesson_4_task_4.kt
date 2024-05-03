package org.example.lesson_4

fun main() {

    print("Наличие повреждений корпуса: ")
    val shipsDamage = readln()
    print("Текущий состав экипажа: ")
    val numberOfCrew = readln()
    print("Количество ящиков с провизией на борту: ")
    val foodBoxCount = readln()
    print("Благоприятность метеоусловий: ")
    val weatherCondition = readln()
    println(
        "${
            (shipsDamage == "нет" && numberOfCrew.toInt() >= CREW_COUNT_MIN && numberOfCrew.toInt() <= CREW_COUNT_MAX && foodBoxCount.toInt() >= FOOD_BOX_MIN) ||
                    (numberOfCrew.toInt() == CREW_COUNT_MAX && foodBoxCount.toInt() >= FOOD_BOX_MIN && weatherCondition == "да")
        }"
    )
}

const val CREW_COUNT_MIN: Int = 55
const val CREW_COUNT_MAX: Int = 70
const val FOOD_BOX_MIN: Int = 50