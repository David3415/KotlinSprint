package org.example.lesson_2

fun main() {
    val oreKristal: Short = 7
    val oreMetal: Short = 11
    val oreKristalBuff: Int = oreKristal * BUFF / 100
    val oreMetallBuff: Int = oreMetal * BUFF / 100

    println("totalCrystalBuff: $oreKristalBuff")
    println("totalMetallBuff: $oreMetallBuff")
}

const val BUFF = 20