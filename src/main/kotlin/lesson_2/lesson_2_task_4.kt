package org.example.lesson_2

fun main() {
    val oreCrystal: Int = 7
    val oreIron: Int = 11
    val percents: Int = 100
    val buffKoef: Float = BUFF / percents.toFloat()
    val buffCrystal: String = String.format("%.0f", oreCrystal * buffKoef)
    val buffIron: String = String.format("%.0f", oreIron * buffKoef)
    println("Buff кристаллической руды: $buffCrystal")
    println("Buff железной руды: $buffIron")

}

const val BUFF: Int = 20
