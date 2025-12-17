package org.example

fun main() {
    val yearOfFlight: Int = 1961
    var hour: String = "09"
    var minutes: String = "07"

    println("Year: $yearOfFlight")
    println("Hour of takeOff: $hour")
    println("Minutes of takeOff: $minutes")

    hour = "10"
    minutes = "55"

    print("Time of landing: $hour:$minutes")
}