package org.example

fun main() {
    val ordersCount: Int = 75
    val thanksText: String = "Thank you for purchasing!"
    val yearOfFlight: Int = 1961
    var hour: Int = 9
    var minutes: Int = 7
    println("Year: $yearOfFlight")
    println("Hour of takeOff: $hour")
    println("Minutes of takeOff: $minutes")
    hour = 10
    minutes = 55
    print("Time of landing: $hour:$minutes")
}