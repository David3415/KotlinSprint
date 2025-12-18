package org.example.lesson_2

fun main() {
    val buff: Short = 20
    val oreKristal: Short = 7
    val oreMetal: Short = 11
    val oreKristalBuff: Int = oreKristal * buff / 100
    val oreMetallBuff: Int = oreMetal * buff / 100

    println("totalCrystalBuff: $oreKristalBuff")
    println("totalMetallBuff: $oreMetallBuff")
}

