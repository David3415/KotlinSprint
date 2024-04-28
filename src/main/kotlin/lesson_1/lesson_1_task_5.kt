package org.example.lesson_1

fun main() {
    val nullPrefix: String = "0"
    var secondsInCosmosTemp: Int = 6480 // – количество секунд
    var temp: Int = secondsInCosmosTemp / 3600  //Получим часы

    val hoursInCosmos = addNullVoid(temp, nullPrefix)  ///Если надо, добавить ноль

    if (temp != 0) {///Оставшееся после вычитания кол-ва часов кол-во секунд
        secondsInCosmosTemp = secondsInCosmosTemp - 3600 * temp
    }

    temp = secondsInCosmosTemp / 60
    val minutesInCosmos: String = addNullVoid(temp, nullPrefix)

    secondsInCosmosTemp = secondsInCosmosTemp - temp * 60

    val secondsInCosmos = addNullVoid(secondsInCosmosTemp, nullPrefix) //Итоговое количество сек

    val stringToPrint = "Время, проведённое в космосе: $hoursInCosmos : $minutesInCosmos : $secondsInCosmos"
    println(stringToPrint)
}

fun addNullVoid(temp: Int, nullPrefix: String): String {
    //локальные переменные
    var _nullPrefix = nullPrefix
    val _temp = temp

    if (_temp / 10 < 1) {
        _nullPrefix = "$_nullPrefix$temp"
        return _nullPrefix
    } else {
        _nullPrefix = ""
        _nullPrefix = "$_nullPrefix$_temp"
        return _nullPrefix
    }
}