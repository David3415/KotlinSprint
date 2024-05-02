package org.example.lesson_2

fun main() {

    val buffKoef: Float = BUFF / PERCENTS
    val buffCrystal: String = String.format("%.0f", ORE_KRYSTAL * buffKoef)
    val buffIron: String = String.format("%.0f", ORE_IRON * buffKoef)
    println("Buff кристаллической руды: $buffCrystal")
    println("Buff железной руды: $buffIron")

}

const val ORE_KRYSTAL: Int = 7
const val ORE_IRON: Int = 11
const val BUFF: Int = 20
const val PERCENTS: Float = 100.0f