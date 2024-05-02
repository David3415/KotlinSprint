package org.example.lesson_1

fun main() {
    val length: Long = 40868600000    //–расстояние, которое пролетел Гагарин пока был в космосе в миллиметрах;
    val age: Byte = 27    // – возраст Гагарина на момент полета (целых лет);
    val partOfDay: Float = 0.075f   // – какую часть дня Гагарин провел в космосе;
    val seconds: Short = 6480 // – количество секунд которое Гагарин провел в космосе;
    val partOfYear: Double = 2.0547945205479453E-4 //– какую часть года Гагарин провел в космосе;
    val apogee: Int = 327000  // – апогей орбиты Гагарина в метрах.

    val stringToPrint = """
        $length - Расстояние, которое пролетел Гагарин пока был в космосе в миллиметрах
        $age - возраст Гагарина на момент полета (целых лет) 
        $partOfDay - какую часть дня Гагарин провел в космосе 
        $seconds - количество секунд которое Гагарин провел в космосе 
        $partOfYear - какую часть года Гагарин провел в космосе 
        $apogee - апогей орбиты Гагарина в метрах
    """.trimIndent()

    println(stringToPrint)
}